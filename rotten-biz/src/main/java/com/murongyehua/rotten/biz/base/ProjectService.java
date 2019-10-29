package com.murongyehua.rotten.biz.base;

import com.murongyehua.rotten.dto.ProjectDTO;
import com.murongyehua.rotten.dto.ProjectParam;
import com.murongyehua.rotten.entity.ResultContext;

/**
 * @author liul
 * @version 1.0 2019/10/28
 */
public interface ProjectService {

    ResultContext addProject(ProjectDTO projectDTO);

    ResultContext deleteProject(ProjectDTO projectDTO);

    ResultContext queryProject(ProjectParam projectParam);

}
