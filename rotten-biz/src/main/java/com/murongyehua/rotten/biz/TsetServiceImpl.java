package com.murongyehua.rotten.biz;

import org.springframework.stereotype.Service;

/**
 * @author liul
 * @version 1.0 2019/10/25
 */
@Service("testService")
public class TsetServiceImpl implements TestService {
    @Override
    public String test() {
        return "test success!";
    }
}
