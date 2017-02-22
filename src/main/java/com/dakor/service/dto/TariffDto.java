package com.dakor.service.dto;

import java.math.BigDecimal;

/**
 * .
 *
 * @author dkor
 */
public class TariffDto {
	private String id;
	private BigDecimal value;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}
}
