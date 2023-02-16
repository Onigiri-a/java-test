package com.team.service;

/**
 * @description:自定义异常类
 * @author: chenhz Email:chenhuaizhi800@163.com
 * @version: v
 * @time: 2023/2/14 14:44
 */


public class TeamException extends Exception {
    static final long serialVersionUID = -3387516993124229948L;
    public TeamException() {
        super();
    }
    public TeamException(String message) {
        super(message);
    }

}
