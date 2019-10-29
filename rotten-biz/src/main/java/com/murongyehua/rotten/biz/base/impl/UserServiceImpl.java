package com.murongyehua.rotten.biz.base.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.IdUtil;
import com.murongyehua.rotten.biz.base.UserService;
import com.murongyehua.rotten.dao.mapper.RottenUserDao;
import com.murongyehua.rotten.dao.po.UserPO;
import com.murongyehua.rotten.dto.UserDTO;
import com.murongyehua.rotten.entity.ResultContext;
import com.murongyehua.rotten.entity.UserContext;
import com.murongyehua.rotten.entity.UserInfo;
import com.murongyehua.rotten.enums.ENStatus;
import com.murongyehua.rotten.enums.ENUserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.List;

/**
 * @author liul
 * @version 1.0 2019/10/25
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private RottenUserDao userDao;

    @Override
    public ResultContext addUser(UserDTO userDTO) {
        UserPO userPO = new UserPO();
        BeanUtil.copyProperties(userDTO,userPO);
        if (userDao.isUserExist(userPO) > 0) {
            return ResultContext.getFail("目标用户已存在");
        }
        userPO.setUrid(IdUtil.simpleUUID());
        userPO.setType(ENUserType.NORMAL.getValue());
        userPO.setStatus(ENStatus.ACTIVE.getValue());
        userPO.setPassword(DigestUtils.md5DigestAsHex(userPO.getPassword().getBytes()));
        userPO.setCreateUser(userDTO.getCurrentUserId());
        userPO.setUpdateUser(userDTO.getCurrentUserId());
        userPO.setVersion(1);
        int count = userDao.insert(userPO);
        if (count != 1) {
            return ResultContext.getFail("添加失败");
        }
        return ResultContext.getSuccess("操作成功");
    }

    @Override
    public ResultContext getUserBySomething(UserDTO userDTO) {
        UserPO userPO = new UserPO();
        BeanUtil.copyProperties(userDTO, userPO);
        List<UserPO> users = userDao.selectBySelective(userPO);
        return ResultContext.getSuccess("操作成功",users);
    }

    @Override
    public ResultContext login(UserDTO userDTO) {
        UserPO userPO = new UserPO();
        userPO.setUsername(userDTO.getUsername());
        userPO.setPassword(DigestUtils.md5DigestAsHex(userDTO.getPassword().getBytes()));
        List<UserPO> userPOS = userDao.selectBySelective(userPO);
        if (userPOS.size() == 0) {
            return ResultContext.getFail("用户名或密码错误");
        }
        UserInfo userInfo = new UserInfo(userPOS.get(0).getUrid(), userPOS.get(0).getUsername(), userPOS.get(0).getNickname());
        UserContext.setUserInfo(userInfo);
        return ResultContext.getSuccess("登录成功",userPOS.get(0));
    }
}
