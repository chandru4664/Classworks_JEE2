package com.htc.spring4mvc.security;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserSecurityDAOImpl implements UserSecurityDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public UserInfo findByssoId(String ssoId) {
		String sql1 ="select "
				+ "u.sso_id, "
				+ "u.password, "
				+ "u.first_name, "
				+ "u.last_name, "
				+ "u.email, "
				+ "u.state "
				+ "from users u "
				+ "where u.sso_id=:ssoId";
		
		String sql2 = "select r.roleid, "
				+ "r.type "
				+ "from roles r "
				+ "inner join user_roles ur "
				+ "on ur.role_id = r.roleid "
				+ "where ur.user_id=:ssoId";
		
		NamedParameterJdbcTemplate namedJdbcTemplate = new NamedParameterJdbcTemplate(jdbcTemplate);
		UserInfo userInfo = namedJdbcTemplate.queryForObject(sql1, Collections.singletonMap("ssoId", ssoId), new RowMapper<UserInfo>(){
			
			@Override
			public UserInfo mapRow(ResultSet rs, int row) throws SQLException {
				UserInfo userInfo = new UserInfo();
				userInfo.setSsoId(rs.getString(1));
				userInfo.setPassword(rs.getString(2));
				userInfo.setFirstName(rs.getString(3));
				userInfo.setLastName(rs.getString(4));
				userInfo.setEmail(rs.getString(5));
				userInfo.setState(rs.getString(6));
				return userInfo;
			}			
		});
		 
		List<UserRole> roleList = namedJdbcTemplate.query(sql2, Collections.singletonMap("ssoId", ssoId), new RowMapper<UserRole>(){
			@Override
			public UserRole mapRow(ResultSet rs, int row) throws SQLException {
				UserRole userRole = new UserRole();
				userRole.setRoleid(rs.getInt(1));
				userRole.setRoleType(rs.getString(2));
				return userRole;
			}			
		});
		userInfo.setUserRoles(new HashSet<UserRole>(roleList));
		return userInfo;
	}

}
