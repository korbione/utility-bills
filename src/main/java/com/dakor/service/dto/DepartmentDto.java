package com.dakor.service.dto;

import java.math.BigDecimal;

/**
 * .
 *
 * @author dkor
 */
public class DepartmentDto {
	private String id;
	private String name;
	private BigDecimal tariff;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getTariff() {
		return tariff;
	}

	public void setTariff(BigDecimal tariff) {
		this.tariff = tariff;
	}
}
