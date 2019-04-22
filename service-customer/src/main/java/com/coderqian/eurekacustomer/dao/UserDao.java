package com.coderqian.eurekacustomer.dao;

import com.coderqian.eurekacustomer.model.entity.UserEntity;

/**
 * @author qianliqing
 * @date 2019-04-21 12:32 AM
 * mail: qianlq0824@gmail.com
 */

public interface UserDao {

    /**
     * 插入用户
     *
     * @param name  姓名
     * @param birth 出生日期
     * @return UserEntity
     */
    UserEntity insertUser(String name, String birth);

    /**
     * 更新
     *
     * @param id    id
     * @param name  姓名
     * @param birth 出生日期
     * @return UserEntity
     */
    UserEntity updateUser(String id, String name, String birth);

    /**
     * 查询用户
     *
     * @param id 用户编号
     * @return UserEntity
     */
    UserEntity findUser(String id);
}