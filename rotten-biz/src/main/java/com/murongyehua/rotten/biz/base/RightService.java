package com.murongyehua.rotten.biz.base;

import com.murongyehua.rotten.dao.po.RightPO;
import com.murongyehua.rotten.dto.RightDTO;
import com.murongyehua.rotten.entity.ResultContext;

import java.util.List;


/**
 * @author liul
 * @version 1.0 2019/10/28
 */
public interface RightService {

    ResultContext addRight(RightDTO rightDTO);

    ResultContext removeRight(RightDTO rightDTO);

    List<RightPO> queryRight(RightDTO rightDTO);
}
