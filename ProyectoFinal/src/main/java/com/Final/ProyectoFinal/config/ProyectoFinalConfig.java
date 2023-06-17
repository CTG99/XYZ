/*package com.Final.ProyectoFinal.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class ProyectoFinalConfig {
	
	

	public JdbcUserDetailsManager jdbcUserDetailsManager(DataSource ds) {
		
		JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager();
		jdbcUserDetailsManager.setDataSource(ds);
		return jdbcUserDetailsManager;
	};
	
    @Bean(destroyMethod = "close")
    DataSource dataSource(Environment env) {
        HikariConfig config = new HikariConfig();
        config.setDriverClassName(env.getRequiredProperty("com.mysql.cj.jdbc.Driver"));
        config.setJdbcUrl(env.getRequiredProperty("jdbc:mysql://localhost:3306//crops"));
        config.setUsername(env.getRequiredProperty("carlos"));
        config.setPassword(env.getRequiredProperty("carlos"));
        return new HikariDataSource(config);
    }
 
    @Bean
    JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
 
    @Bean
    DataSourceTransactionManager dataSourceTransactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }*/
	
	/*
    @Bean
    public DataSource mysqlDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/crops");
        dataSource.setUsername("carlos");
        dataSource.setPassword("carlos");

        return dataSource;
    }
    
    @Bean
    JdbcTemplate jdbcTemplate2(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
	*/
	
	
//    @Bean
//    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
//        return new JdbcTemplate(dataSource);
//    }

	/*
	 * DataSource ds;
	 * 
	 * @Bean public JdbcUserDetailsManager jdbcUserDetailsManager(DataSource ds) {
	 * 
	 * JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager();
	 * jdbcUserDetailsManager.setDataSource(ds); return jdbcUserDetailsManager; };
	 * 
	 * @Bean public JdbcTemplate getJdbcTemplate() { return new JdbcTemplate(ds); }
	 
}*/
