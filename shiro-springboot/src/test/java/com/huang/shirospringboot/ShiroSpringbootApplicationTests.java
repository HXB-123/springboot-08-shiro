package com.huang.shirospringboot;

import com.huang.shirospringboot.pojo.User;
import com.huang.shirospringboot.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ShiroSpringbootApplicationTests {

	@Autowired
	UserServiceImpl userService;


	@Test
	public void contextLoads() {

		User yyx = userService.queryUserByName("yyx");
        //String yyx = "yyg";
		System.out.println(yyx.toString());
	}

}
