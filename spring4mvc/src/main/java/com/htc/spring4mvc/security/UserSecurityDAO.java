package com.htc.spring4mvc.security;

public interface UserSecurityDAO {

	public UserInfo findByssoId(String ssoId);
}
