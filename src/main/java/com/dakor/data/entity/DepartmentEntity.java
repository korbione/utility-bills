package com.dakor.data.entity;

import javax.persistence.*;

/**
 * .
 *
 * @author dkor
 */
@Entity
@Table(name = "DEPARTMENT")
public class DepartmentEntity extends AbstractIdentifierEntity {
	@Column(name = "NAME", nullable = false, length = 50)
	private String name;

	@OneToOne(mappedBy = "department", cascade = CascadeType.ALL)
	private TariffEntity tariff;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TariffEntity getTariff() {
		return tariff;
	}

	public void setTariff(TariffEntity tariff) {
		this.tariff = tariff;
	}
}
