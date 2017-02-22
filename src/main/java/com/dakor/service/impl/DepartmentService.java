package com.dakor.service.impl;

import com.dakor.data.dao.DepartmentRepository;
import com.dakor.data.entity.DepartmentEntity;
import com.dakor.service.IDepartmentService;
import com.dakor.service.assembler.IDepartmentAssembler;
import com.dakor.service.assembler.ITariffAssembler;
import com.dakor.service.dto.DepartmentDto;
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
class DepartmentService implements IDepartmentService {
	private DepartmentRepository departmentDao;
	private IDepartmentAssembler departmentAssembler;
	private ITariffAssembler tariffAssembler;

	@Autowired
	public void setDepartmentDao(DepartmentRepository departmentDao) {
		this.departmentDao = departmentDao;
	}

	@Autowired
	public void setDepartmentAssembler(IDepartmentAssembler departmentAssembler) {
		this.departmentAssembler = departmentAssembler;
	}

	@Autowired
	public void setTariffAssembler(ITariffAssembler tariffAssembler) {
		this.tariffAssembler = tariffAssembler;
	}

	@Transactional(readOnly = true)
	@Override
	public List<DepartmentDto> getAll() {
		return departmentDao.findAll().stream().map(entity -> departmentAssembler.assembly(entity)).collect(
				Collectors.toList());
	}

	@Override
	public DepartmentDto save(DepartmentDto department) {
		DepartmentEntity savedEntity = departmentDao.save(departmentAssembler.assembly(department));

		return departmentAssembler.assembly(savedEntity);
	}

	@Override
	public void delete(DepartmentDto department) {
		if (department.getId() != null) {
			departmentDao.delete(department.getId());
		}
	}

	@Override
	public void saveTariff(String departmentId, TariffDto tariff) {
		if (departmentId != null) {
			departmentDao.saveTariff(departmentId, tariffAssembler.assembly(tariff));
		}
	}
}
