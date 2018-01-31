package com.taobao.dao;

import com.taobao.model.UserModel;

import java.util.List;

/**
 * 用户实体映射接口
 * @author FaceFeel
 * @Created 2018-01-31 14:42
 */

public interface UserDao {

    List<UserModel> getUserList();
}
