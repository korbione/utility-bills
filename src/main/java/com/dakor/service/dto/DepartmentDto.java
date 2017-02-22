package com.dakor.service.dto;

/**
 * .
 *
 * @author dkor
 */
public class DepartmentDto {
	private String id;
	private String name;
	private TariffDto tariff;

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

	public TariffDto getTariff() {
		return tariff;
	}

	public void setTariff(TariffDto tariff) {
		this.tariff = tariff;
	}
}
