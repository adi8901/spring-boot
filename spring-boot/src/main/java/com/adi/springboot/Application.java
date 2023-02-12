package com.adi.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.adi.springboot.controller.DepartmentController;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
//@ComponentScan(value = "com.adi.springboot.servicess" + "com.adi.springboot.controller.DepartmentController" + "DepartmentController.class")
@ComponentScan(basePackages = {"com.adi.springboot.controller" + "com.adi.springboot.services"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("Hello");
	}

}
