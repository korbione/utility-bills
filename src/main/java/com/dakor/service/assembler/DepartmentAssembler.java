package com.dakor.service.assembler;

import com.dakor.data.entity.DepartmentEntity;
import com.dakor.service.dto.DepartmentDto;
import org.springframework.stereotype.Component;

/**
 * .
 *
 * @author dkor
 */
@Component
class DepartmentAssembler implements IDepartmentAssembler {
	@Override
	public DepartmentDto assembly(DepartmentEntity entity) {
		DepartmentDto dto = null;
		if (entity != null) {
			dto = new DepartmentDto();
			dto.setId(entity.getId());
			dto.setName(entity.getName());
		}

		return dto;
	}

	@Override
	public DepartmentEntity assembly(DepartmentDto dto) {
		DepartmentEntity entity = null;
		if (dto != null) {
			entity = new DepartmentEntity();
			entity.setId(dto.getId());
			entity.setName(dto.getName());
		}

		return entity;
	}
}
