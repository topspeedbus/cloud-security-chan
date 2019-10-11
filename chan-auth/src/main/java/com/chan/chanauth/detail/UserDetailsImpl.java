package com.chan.chanauth.detail;

import com.chan.common.constant.CommonConstant;
import com.chan.common.constant.SecurityConstant;
import com.chan.userapi.entity.SysRole;
import com.chan.userapi.vo.UserVO;
import lombok.Data;
import org.apache.commons.lang.StringUtils;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @version 1.0
 * @auther chan
 * @Date 2018/12/28 14:46
 */
@Data
public class UserDetailsImpl implements UserDetails {
    private Integer userId;
    private String username;
    private String password;
    private Integer status;
    private List<SysRole> roleList;

    public UserDetailsImpl(UserVO userVo) {
        this.userId = userVo.getUserId();
        this.username = userVo.getUsername();
        this.password = userVo.getPassword();
        this.status = userVo.getDelFlag();
        roleList = userVo.getRoleList();
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorityList = new ArrayList<>();
        roleList.forEach(r -> authorityList.add(new SimpleGrantedAuthority(r.getRoleCode())));
        authorityList.add(new SimpleGrantedAuthority(SecurityConstant.BASE_ROLE));
        return authorityList;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return !CommonConstant.STATUS_LOCK.equals(status);
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return CommonConstant.STATUS_NORMAL.equals(status);
    }
}
