package com.wassim.firstProject;

import com.wassim.firstProject.utilities.DataBaseUtility;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstProjectApplication implements CommandLineRunner {

	private final DataBaseUtility dataBaseUtility;

	public FirstProjectApplication(DataBaseUtility dataBaseUtility) {
		this.dataBaseUtility = dataBaseUtility;
	}

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		dataBaseUtility.initDataBase();
	}
}
