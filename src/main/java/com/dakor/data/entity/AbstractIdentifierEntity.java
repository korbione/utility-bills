package com.dakor.data.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * .
 *
 * @author dkor
 */
@MappedSuperclass
abstract class AbstractIdentifierEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name = "ID", nullable = false, unique = true, insertable = false)
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
