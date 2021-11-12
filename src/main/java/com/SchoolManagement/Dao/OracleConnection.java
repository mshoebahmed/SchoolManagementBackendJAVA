package com.SchoolManagement.Dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class OracleConnection {
    
    @Autowired
	private DataSource dataSource;

	private JdbcTemplate oracleSql;

	int i = 0;
    


	public String sqlCreate(String query) {
		try {
			oracleSql = new JdbcTemplate(dataSource);
			oracleSql.update(query);
			return "added";

		} catch (Exception e) {
			return "sql error " + e.toString();
		}

	}
}
