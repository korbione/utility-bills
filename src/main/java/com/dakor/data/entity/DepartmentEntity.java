package com.dakor.data.entity;

import javax.persistence.*;
import java.math.BigDecimal;

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

	@Column(name = "TARIFF", precision = 4, scale = 2, columnDefinition="DECIMAL(4,2)")
	private BigDecimal tariff;

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
