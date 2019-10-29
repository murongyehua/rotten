package com.murongyehua.rotten.biz.base.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.IdUtil;
import com.murongyehua.rotten.biz.base.ProjectService;
import com.murongyehua.rotten.dao.mapper.RottenProjectDao;
import com.murongyehua.rotten.dao.po.ProjectPO;
import com.murongyehua.rotten.dto.ProjectDTO;
import com.murongyehua.rotten.dto.ProjectParam;
import com.murongyehua.rotten.entity.ResultContext;
import com.murongyehua.rotten.enums.ENUserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liul
 * @version 1.0 2019/10/28
 */
@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private RottenProjectDao projectDao;

    @Override
    public ResultContext addProject(ProjectDTO projectDTO) {
        ProjectPO projectPO = new ProjectPO();
        BeanUtil.copyProperties(projectDTO, projectPO);
        if (projectDao.isProjectExist() > 0) {
            return ResultContext.getFail("目标项目已存在");
        }
        projectPO.setUrid(IdUtil.simpleUUID());
        projectPO.setCreateUser(projectDTO.getCurrentUserId());
        projectDTO.setUpdateUser(projectDTO.getCurrentUserId());
        projectDTO.setVersion(1);
        int count = projectDao.insert(projectPO);
        if (count != 1) {
            return ResultContext.getFail("项目添加失败");
        }
        return ResultContext.getSuccess("操作成功");
    }

    @Override
    public ResultContext deleteProject(ProjectDTO projectDTO) {
        int successCount = projectDao.deleteByPrimaryKey(projectDTO.getUrid());
        if (successCount != 1) {
            return ResultContext.getFail("删除失败");
        }
        return ResultContext.getSuccess("操作成功");
    }

    @Override
    public ResultContext queryProject(ProjectParam projectParam) {
        ProjectPO projectPO = new ProjectPO();
        BeanUtil.copyProperties(projectParam, projectPO);
        List<ProjectPO> list;
        if (ENUserType.MANAGER.getValue().equals(projectParam.getUserType())) {
            // 查全部
            list = projectDao.selectBySelective(projectPO);
        }else {
            // 查部分
                // 先查权限
        }
        return null;
    }
}
