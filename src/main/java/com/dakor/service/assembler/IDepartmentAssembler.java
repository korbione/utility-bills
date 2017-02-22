package com.dakor.service.assembler;

import com.dakor.data.entity.DepartmentEntity;
import com.dakor.service.dto.DepartmentDto;

/**
 * .
 *
 * @author dkor
 */
public interface IDepartmentAssembler {
	DepartmentDto assembly(DepartmentEntity entity);
	DepartmentEntity assembly(DepartmentDto dto);
}
