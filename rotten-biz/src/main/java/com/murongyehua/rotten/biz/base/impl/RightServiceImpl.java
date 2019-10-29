package com.murongyehua.rotten.biz.base.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.StrUtil;
import com.murongyehua.rotten.biz.base.RightService;
import com.murongyehua.rotten.dao.mapper.RottenRightDao;
import com.murongyehua.rotten.dao.po.RightPO;
import com.murongyehua.rotten.dto.RightDTO;
import com.murongyehua.rotten.entity.ResultContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liul
 * @version 1.0 2019/10/28
 */
@Service
public class RightServiceImpl implements RightService {

    @Autowired
    private RottenRightDao rightDao;

    @Override
    public ResultContext addRight(RightDTO rightDTO) {
        RightPO rightPO = new RightPO();
        BeanUtil.copyProperties(rightDTO,rightPO);
        if (rightDao.selectBySelective(rightPO).size() > 0) {
            return ResultContext.getFail("目标权限已存在");
        }
        rightPO.setUrid(IdUtil.simpleUUID());
        rightPO.setCreateUser(rightDTO.getCurrentUserId());
        rightPO.setVersion(1);
        int successCount = rightDao.insert(rightPO);
        if (successCount != 1){
            return ResultContext.getFail("分配权限失败");
        }
        return ResultContext.getSuccess("操作成功");
    }

    @Override
    public ResultContext removeRight(RightDTO rightDTO) {
        int successCount = rightDao.deleteByPrimaryKey(rightDTO.getUrid());
        if (successCount != 1) {
            return ResultContext.getFail("删除权限失败");
        }
        return ResultContext.getSuccess("操作成功");
    }

    @Override
    public List<RightPO> queryRight(RightDTO rightDTO) {
        if (StrUtil.isEmpty(rightDTO.getUserId()) && StrUtil.isEmpty(rightDTO.getProjectId())) {
            return null;
        }
        RightPO rightPO = new RightPO();
        rightPO.setUserId(rightDTO.getUserId());
        rightPO.setProjectId(rightDTO.getProjectId());
        return rightDao.selectBySelective(rightPO);
    }
}
