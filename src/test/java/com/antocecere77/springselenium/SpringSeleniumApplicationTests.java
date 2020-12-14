package com.antocecere77.springselenium;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

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

	@Test
	void contextLoads() {
		System.out.println(path);
		System.out.println(fruits);
		System.out.println(fruits.size());
		System.out.println(timeout);
		user.printDetails();
	}

	//DI not Spring Boot way
	//		Address address = new Address();
	//		Salary salary = new Salary();
	//		User user = new User(address, salary);
	//		user.printDetails();

}
