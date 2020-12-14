package com.antocecere77.springselenium;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Locale;

@SpringBootTest
class SpringSeleniumApplicationTests {

	@Autowired
	private User user;

	@Value("${Path}")
	private String path;

	@Value("${fruits}")
	private List<String> fruits;

	@Value("${timeout}")
	private Integer timeout;

	@Value("${TEST_URL:https://www.google.com}")
	private String testUrl;

	@Autowired
	private Faker faker;

	@Test
	void contextLoads() {
		System.out.println(path);
		System.out.println(fruits);
		System.out.println(fruits.size());
		System.out.println(timeout);
		System.out.println(testUrl);

		user.printDetails();
		System.out.println(faker.name().firstName());
	}

	//DI not Spring Boot way
	//		Address address = new Address();
	//		Salary salary = new Salary();
	//		User user = new User(address, salary);
	//		user.printDetails();

}
