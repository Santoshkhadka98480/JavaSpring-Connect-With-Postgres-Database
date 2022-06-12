package com.postgres.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {

    @Autowired
    public JdbcTemplate jdbcTemplate;


    //create the table ...
    public void createdTable() {
        var query = "CREATE TABLE student(id serial primary key, name varchar(50) not null, city varchar(50) )";
        int update = this.jdbcTemplate.update(query);
        System.out.println(update);
    }

    //insert into data to db
    public void insertData(String name, String city) {
        String q = "INSERT INTO student(name,city) values(?,?)";
        int update = this.jdbcTemplate.update(q,name,city);
        System.out.println(update+ " rows address ");
    }

}
