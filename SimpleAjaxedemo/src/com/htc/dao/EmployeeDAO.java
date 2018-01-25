package com.htc.dao;


import java.sql.SQLException;

import javax.naming.NamingException;

public interface EmployeeDAO {
 Employee getEmployee(int eid) throws SQLException;
 int storeEmployee(Employee e) throws NamingException, SQLException;
}
