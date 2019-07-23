package com.yoge.miaosha.service;

import com.yoge.miaosha.error.BusinessException;
import com.yoge.miaosha.service.model.UserModel;

public interface UserService {

    /**
     * 通过用户id获取对象
     */
    UserModel getUserById(Integer id);

    /**
     * 用户注册
     * @param userModel
     * @throws BusinessException
     */
    void register(UserModel userModel) throws BusinessException;

    UserModel validateLogin(String telphone, String encrptPassword) throws BusinessException;

}
