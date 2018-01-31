package com.taobao.service.impl;

import com.taobao.dao.UserDao;
import com.taobao.model.UserModel;
import com.taobao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 获取用户列表数据接口实现类
 * @author FaceFeel
 * @Created 2018-01-31 14:52
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<UserModel> getUserList() {
        return userDao.getUserList();
    }
}
