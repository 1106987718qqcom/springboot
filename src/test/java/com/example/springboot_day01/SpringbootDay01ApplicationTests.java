package com.example.springboot_day01;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.GetMapping;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDay01ApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("a");
	}
	@GetMapping("/test")
	public String test02(){

		return "nihao";
	}
}
