package com.lib;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class JdbcUserDao  implements UserDao {


	private DataSource dataSource;
	private JdbcTemplate jt;


	
	@Override
	public void create(String name, Integer age, String sex) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub
		this.dataSource = dataSource;
	    this.jt = new JdbcTemplate(dataSource);

	}

	@Override
	public List<User> listUsers() {
		// TODO Auto-generated method stub
		String query ="select * from user";
		return jt.query(query,new RowMapper<User>(){  
		    @Override  
		    public User mapRow(ResultSet rs, int rownumber) throws SQLException {  
		        User e=new User();  
		        e.setName(rs.getString(1));  
		        e.setAge(rs.getInt(2));  
		        e.setSex(rs.getString(3));  
		        return e;  
		    }  
		   });  
	}
	
	
	

}
