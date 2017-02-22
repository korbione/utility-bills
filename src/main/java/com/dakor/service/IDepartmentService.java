package com.dakor.service;

import com.dakor.service.dto.DepartmentDto;
import com.dakor.service.dto.TariffDto;

/**
 * .
 *
 * @author dkor
 */
public interface IDepartmentService extends IService<DepartmentDto> {

	void saveTariff(String departmentId, TariffDto tariff);
}
