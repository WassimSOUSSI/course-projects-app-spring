package com.wassim.springsecurityexample;

import com.wassim.springsecurityexample.utilities.DatabaseUtility;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringSecurityExampleApplication implements CommandLineRunner {

	private final DatabaseUtility databaseUtility;

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		databaseUtility.initDatabase();
	}
}
