package com.dakor.data.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * .
 *
 * @author dkor
 */
@Entity
@Table(name = "TARIFF")
public class TariffEntity extends AbstractIdentifierEntity {
	@Column(name = "VALUE", nullable = false, precision = 4, scale = 2, columnDefinition="DECIMAL(4,2)")
	private BigDecimal value;

	@OneToOne
	@JoinColumn(name = "TARIFF_ID")
	@SuppressWarnings("unused")
	private DepartmentEntity department;

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}
}
