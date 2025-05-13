package com.ibandorta.springbatch2.prueba.writer;

import com.ibandorta.springbatch2.prueba.model.User;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import javax.sql.DataSource;

public class UserItemWriter extends JdbcBatchItemWriter<User> {

    public UserItemWriter(DataSource dataSource) {
        super();
        this.setItemSqlParameterSourceProvider(new org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider<>());
        this.setSql("INSERT INTO USERS_PROCESSED(id, name, email) VALUES (:id, :name, :email");
        this.setDataSource(dataSource);
        this.afterPropertiesSet();
    }



    @Bean
    public JdbcCursorItemReader<User> reader(DataSource dataSource) {
        JdbcCursorItemReader<User> reader = new JdbcCursorItemReader<>();
        reader.setDataSource(dataSource);
        reader.setSql("SELECT ID, NAME, EMAIL FROM USERS");
        reader.setRowMapper(new BeanPropertyRowMapper<>(User.class));
        return reader;
    }
}
