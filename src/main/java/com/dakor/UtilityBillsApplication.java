package com.dakor;

import com.dakor.service.IDepartmentService;
import com.dakor.service.dto.DepartmentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class UtilityBillsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UtilityBillsApplication.class, args);
	}

	@Bean
	@Autowired
	public CommandLineRunner start(IDepartmentService departmentService) {
		return (args) -> {
			if (departmentService.getByName("test") == null) {
				DepartmentDto department = new DepartmentDto();
				department.setName("test");
				department.setTariff(new BigDecimal("45.65"));
				department = departmentService.save(department);
				System.out.println(department.getId());
			}
		};
	}
}
