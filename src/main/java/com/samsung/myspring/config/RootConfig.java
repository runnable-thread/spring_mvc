package com.samsung.myspring.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.samsung.myspring.sample"})
public class RootConfig {
    //Connection pool 생성 (KikariConfig)
    //hikarri connection pool 생성 후
    @Bean
    public DataSource dataSource(){
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        config.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
        config.setUsername("book_ex");
        config.setPassword("book_ex");

        HikariDataSource dataSource = new HikariDataSource(config);
        return dataSource;
    }
}
