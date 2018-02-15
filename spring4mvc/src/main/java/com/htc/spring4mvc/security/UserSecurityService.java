package com.htc.spring4mvc.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userSecurityService")
public class UserSecurityService {

	@Autowired
	UserSecurityDAO userSercuiryDAO;

	public UserSecurityDAO getUserSercuiryDAO() {
		return userSercuiryDAO;
	}

	public void setUserSercuiryDAO(UserSecurityDAO userSercuiryDAO) {
		this.userSercuiryDAO = userSercuiryDAO;
	}
	
	public UserInfo findByssoId(String ssoId){
		return userSercuiryDAO.findByssoId(ssoId);
	}

}
