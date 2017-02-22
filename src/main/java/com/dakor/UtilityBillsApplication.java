package com.dakor;

import com.dakor.service.IDepartmentService;
import com.dakor.service.dto.DepartmentDto;
import com.dakor.service.dto.TariffDto;
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
			DepartmentDto department = new DepartmentDto();
			department.setName("test");
			department = departmentService.save(department);

			TariffDto tariff = new TariffDto();
			tariff.setValue(new BigDecimal("34.5"));
			departmentService.saveTariff(department.getId(), tariff);
		};
	}
}
