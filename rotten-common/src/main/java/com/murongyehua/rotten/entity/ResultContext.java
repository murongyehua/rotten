package com.murongyehua.rotten.entity;

import com.murongyehua.rotten.enums.ENMsgCode;
import lombok.Data;

/**
 * @author liul
 * @version 1.0 2019/10/25
 */
@Data
public class ResultContext<T> {
    private String code;
    private String info;
    private T data;
    private boolean success;

    public static ResultContext getSuccess(String info){
        ResultContext resultContext = new ResultContext();
        resultContext.setCode(ENMsgCode.SUCCESS.getValue());
        resultContext.setSuccess(true);
        resultContext.setInfo(info);
        return resultContext;
    }

    public static ResultContext getFail(String info){
        ResultContext resultContext = new ResultContext();
        resultContext.setCode(ENMsgCode.BUSINESS_ERROR.getValue());
        resultContext.setSuccess(false);
        resultContext.setInfo(info);
        return resultContext;
    }

    public static ResultContext getSuccess(String info, Object data){
        ResultContext resultContext = new ResultContext();
        resultContext.setCode(ENMsgCode.SUCCESS.getValue());
        resultContext.setSuccess(true);
        resultContext.setInfo(info);
        resultContext.setData(data);
        return resultContext;
    }

    public static ResultContext getFail(String info, Object data){
        ResultContext resultContext = new ResultContext();
        resultContext.setCode(ENMsgCode.BUSINESS_ERROR.getValue());
        resultContext.setSuccess(false);
        resultContext.setInfo(info);
        resultContext.setData(data);
        return resultContext;
    }

}
