package com.htc.spring4mvc.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("customUserDetailService")
public class CustomUserDetailService implements UserDetailsService{

	@Autowired
	UserSecurityService userSecurityService;
	
	public UserSecurityService getUserSecurityService() {
		return userSecurityService;
	}

	public void setUserSecurityService(UserSecurityService userSecurityService) {
		this.userSecurityService = userSecurityService;
	}

	@Override
	public UserDetails loadUserByUsername(String ssoId) throws UsernameNotFoundException {
		UserInfo userInfo = userSecurityService.findByssoId(ssoId);
		System.out.println(userInfo);
		
		if(userInfo == null) {
			System.out.println("User Not Found");
			throw new UsernameNotFoundException("Username not found" );
		}
		return new User(userInfo.getSsoId(), userInfo.getPassword(), userInfo.getState().equals("Active"), true, true, true, getGrantedAuthorities(userInfo));
	}

	private List<GrantedAuthority> getGrantedAuthorities(UserInfo userInfo){
        List<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
         
        for(UserRole userRole : userInfo.getUserRoles()){
            System.out.println("UserRole : "+userRole);
            roles.add(new SimpleGrantedAuthority(userRole.getRoleType()));
        }
        System.out.print("authorities : "+roles);
        return roles;
    }
	
}
