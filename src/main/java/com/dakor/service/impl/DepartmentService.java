package com.dakor.service.impl;

import com.dakor.data.dao.DepartmentRepository;
import com.dakor.data.entity.DepartmentEntity;
import com.dakor.service.IDepartmentService;
import com.dakor.service.assembler.IDepartmentAssembler;
import com.dakor.service.dto.DepartmentDto;
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

	@Autowired
	public void setDepartmentDao(DepartmentRepository departmentDao) {
		this.departmentDao = departmentDao;
	}

	@Autowired
	public void setDepartmentAssembler(IDepartmentAssembler departmentAssembler) {
		this.departmentAssembler = departmentAssembler;
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
	public DepartmentDto getByName(String name) {
		return departmentAssembler.assembly(departmentDao.getByName(name));
	}
}
