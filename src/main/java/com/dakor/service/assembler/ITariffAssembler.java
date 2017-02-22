package com.dakor.service.assembler;

import com.dakor.data.entity.TariffEntity;
import com.dakor.service.dto.TariffDto;

/**
 * .
 *
 * @author dkor
 */
public interface ITariffAssembler {
	TariffDto assembly(TariffEntity entity);
	TariffEntity assembly(TariffDto dto);
}
