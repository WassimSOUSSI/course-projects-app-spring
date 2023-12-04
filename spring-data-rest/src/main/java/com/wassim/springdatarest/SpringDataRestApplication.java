package com.wassim.springdatarest;

import com.wassim.springdatarest.utilities.DatabaseUtility;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringDataRestApplication implements CommandLineRunner {

	private final DatabaseUtility databaseUtility;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		databaseUtility.initDB();
	}
}
