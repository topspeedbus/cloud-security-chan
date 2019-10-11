package com.chan.usercore.repository;


import com.chan.userapi.entity.SysUserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @version 1.0
 * @auther chan
 * @Date 2019/10/10 11:23
 */
public interface SysUserRoleRepository extends JpaRepository<SysUserRole, Integer>, JpaSpecificationExecutor<SysUserRole> {
}
