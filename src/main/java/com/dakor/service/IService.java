package com.dakor.service;

import java.util.List;

/**
 * .
 *
 * @author dkor
 */
public interface IService<T> {
	List<T> getAll();

	T save(T dto);

	void delete(T dto);
}
