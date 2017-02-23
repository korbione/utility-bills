package com.dakor.service;

import com.dakor.service.dto.DepartmentDto;

/**
 * .
 *
 * @author dkor
 */
public interface IDepartmentService extends IService<DepartmentDto> {

	DepartmentDto getByName(String name);
}
