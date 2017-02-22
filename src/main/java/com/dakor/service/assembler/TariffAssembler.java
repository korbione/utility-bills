package com.dakor.service.assembler;

import com.dakor.data.entity.TariffEntity;
import com.dakor.service.dto.TariffDto;
import org.springframework.stereotype.Component;

/**
 * .
 *
 * @author dkor
 */
@Component
class TariffAssembler implements ITariffAssembler {
	@Override
	public TariffDto assembly(TariffEntity entity) {
		TariffDto dto = null;
		if (entity != null) {
			dto = new TariffDto();
			dto.setId(entity.getId());
			dto.setValue(entity.getValue());
		}

		return dto;
	}

	@Override
	public TariffEntity assembly(TariffDto dto) {
		TariffEntity entity = null;
		if (dto != null) {
			entity = new TariffEntity();
			entity.setId(dto.getId());
			entity.setValue(dto.getValue());
		}

		return entity;
	}
}
