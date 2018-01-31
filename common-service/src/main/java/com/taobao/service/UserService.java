package com.taobao.service;

import com.taobao.model.UserModel;

import java.util.List;

/**
 * 获取用户列表接口
 * @author FaceFeel
 * @Created 2018-01-31 14:51
 */

public interface UserService {

    List<UserModel> getUserList();
}
