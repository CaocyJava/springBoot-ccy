package com.ccy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author caocy
 * @date 2017-11-29
 */
@SpringBootApplication
@MapperScan("com.ccy.dao")
public class StartController {

	public static void main(String[] args) {
		SpringApplication.run(StartController.class, args);
	}

}


