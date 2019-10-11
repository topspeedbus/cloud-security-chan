package com.chan.usercore.repository;


import com.chan.userapi.entity.SysRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @version 1.0
 * @auther chan
 * @Date 2019/10/10 11:28
 */
public interface SysRoleRepository extends JpaRepository<SysRole, Integer>, JpaSpecificationExecutor<SysRole> {
}
