package com.boot.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {
    @Bean
    @ConfigurationProperties(prefix="spring.datasource") //use all configuration in application.properties that start with "spring.datasource"
    @Primary // use this datasource as default one
    public DataSource dataSource(){
        return DataSourceBuilder.create().build();
    }
}
