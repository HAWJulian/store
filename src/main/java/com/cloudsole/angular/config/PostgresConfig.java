package com.cloudsole.angular.config;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 
import org.apache.commons.dbcp.*;
import org.springframework.context.annotation.Bean;
/**
 * Created by tmichels on 8/4/14.
 */
public class PostgresConfig
{

	@Bean
	public BasicDataSource dataSource() throws URISyntaxException
	{
		String dbUrl = System.getenv("JDBC_DATABASE_URL");
		String username = System.getenv("JDBC_DATABASE_USERNAME");
		String password = System.getenv("JDBC_DATABASE_PASSWORD");

		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setUrl(dbUrl);
		basicDataSource.setUsername(username);
		basicDataSource.setPassword(password);

		return basicDataSource;
	}
}
