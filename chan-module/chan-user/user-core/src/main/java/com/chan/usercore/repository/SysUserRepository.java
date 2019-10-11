package com.chan.usercore.repository;


import com.chan.userapi.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @version 1.0
 * @auther chan
 * @Date 2019/9/19 19:06
 */
public interface SysUserRepository extends JpaRepository<SysUser, Integer>, JpaSpecificationExecutor<SysUser> {
    SysUser findByUsername(String name);
}
