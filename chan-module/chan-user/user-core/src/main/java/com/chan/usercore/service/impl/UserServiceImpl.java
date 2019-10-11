package com.chan.usercore.service.impl;


import com.chan.userapi.entity.SysRole;
import com.chan.userapi.entity.SysUser;
import com.chan.userapi.entity.SysUserRole;
import com.chan.userapi.vo.UserVO;

import com.chan.usercore.repository.SysRoleRepository;
import com.chan.usercore.repository.SysUserRepository;
import com.chan.usercore.repository.SysUserRoleRepository;
import com.chan.usercore.service.UserService;

import org.springframework.beans.BeanUtils;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @version 1.0
 * @auther chan
 * @Date 2018/12/26 14:50
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Resource
    private SysUserRepository userRepository;
    @Resource
    private SysUserRoleRepository userRoleRepository;
    @Resource
    private SysRoleRepository roleRepository;

    @Override
    public UserVO getUserInfoByName(String userName) {
        SysUser user = userRepository.findByUsername(userName);

        List<SysUserRole> userRoles = userRoleRepository.findAll((Specification) (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();
            predicates.add(criteriaBuilder.equal(root.get("userId"), user.getUserId()));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });

        List<SysRole> roleList = roleRepository.findAll((Specification<SysRole>) (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();
            predicates.add(criteriaBuilder.and(root.get("roleId").in(userRoles.stream().map(SysUserRole::getRoleId).collect(Collectors.toList()))));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(user, userVO);
        userVO.setRoleList(roleList);
        return userVO;
    }
}
