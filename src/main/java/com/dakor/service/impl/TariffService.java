package com.dakor.service.impl;

import com.dakor.data.dao.TariffRepository;
import com.dakor.service.ITariffService;
import com.dakor.service.assembler.ITariffAssembler;
import com.dakor.service.dto.TariffDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * .
 *
 * @author dkor
 */
@Service
@Transactional
class TariffService implements ITariffService {
	private TariffRepository tariffDao;
	private ITariffAssembler tariffAssembler;

	@Autowired
	public void setTariffDao(TariffRepository tariffDao) {
		this.tariffDao = tariffDao;
	}

	@Transactional(readOnly = true)
	@Autowired
	public void setTariffAssembler(ITariffAssembler tariffAssembler) {
		this.tariffAssembler = tariffAssembler;
	}

	@Override
	public List<TariffDto> getAll() {
		return tariffDao.findAll().stream().map(entity -> tariffAssembler.assembly(entity)).collect(
				Collectors.toList());
	}

	@Override
	public TariffDto save(TariffDto dto) {
		tariffDao.save(tariffAssembler.assembly(dto));
		return null;
	}

	@Override
	public void delete(TariffDto dto) {
		if (dto.getId() != null) {
			tariffDao.delete(dto.getId());
		}
	}
}
