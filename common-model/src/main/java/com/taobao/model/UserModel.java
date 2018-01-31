package com.taobao.model;
import com.google.common.base.MoreObjects;

/**
 * 用户实体
 * @author FaceFeel
 * @Created 2018-01-31 14:38
 */

public class UserModel implements java.io.Serializable {

    private String userName;
    private String passWord;

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("userName", userName)
                .add("passWord", passWord)
                .toString();
    }

    public String getUserName() {
        return userName;
    }

    public UserModel setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassWord() {
        return passWord;
    }

    public UserModel setPassWord(String passWord) {
        this.passWord = passWord;
        return this;
    }
}
