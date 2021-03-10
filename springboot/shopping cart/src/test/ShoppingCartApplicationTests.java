package com.project.ShoppingCart;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration
@ContextConfiguration(locations = {
		"classpath*:spring/applicationContext.xml",
		"classpath*:spring/applicationContext-jpa.xml",
		"classpath*:spring/applicationContext-security.xml" } )
@SpringBootTest
class ShoppingCartApplicationTests {

	@Test
	void contextLoads() {
	}

}
