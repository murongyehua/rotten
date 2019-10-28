package com.murongyehua.rotten.entity;

import cn.hutool.core.lang.Assert;

/**
 * @author liul
 * @version 1.0 2019/10/25
 */
public class UserContext {
    private static ThreadLocal<UserInfo> threadLocal = new ThreadLocal<>();

    public static void setUserInfo(UserInfo userInfo){
        threadLocal.set(userInfo);
    }

    public static UserInfo getUserInfo(){
        UserInfo userInfo = threadLocal.get();
        Assert.notNull(userInfo, "无法获取登录用户信息！", new Object[0]);
        return userInfo;
    }

    public static boolean hasUserInfo() {
        UserInfo userInfo = (UserInfo)threadLocal.get();
        return userInfo != null;
    }

    public static String getUserId() {
        return getUserInfo().getUserId();
    }

}
