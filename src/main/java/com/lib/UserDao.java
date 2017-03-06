package com.lib;



import java.util.List;

import javax.sql.DataSource;

public interface UserDao  {
	   public void setDataSource(DataSource ds);
	   public void create(String name, Integer age,String sex);
//	   public User getUser(String name);
	   public List<User> listUsers();


}
