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
     * @param user 用户实体
     * @return UserEntity
     */
    UserEntity insertUser(UserEntity user);

    /**
     * 更新
     *
     * @param user 用户实体
     * @return UserEntity
     */
    UserEntity updateUser(UserEntity user);

    /**
     * 查询用户
     *
     * @param id 用户编号
     * @return UserEntity
     */
    UserEntity findUser(String id);
}
