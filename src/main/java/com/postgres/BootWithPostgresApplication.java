package com.postgres;

import com.postgres.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootWithPostgresApplication implements CommandLineRunner {

	@Autowired
	private StudentDao  studentDao;

	public static void main(String[] args) {
		SpringApplication.run(BootWithPostgresApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		this.studentDao.createdTable();

		 this.studentDao.insertData("Santosh Khadka","Kathmandu");
	}
}
