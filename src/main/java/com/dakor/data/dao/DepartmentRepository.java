package com.dakor.data.dao;

import com.dakor.data.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * .
 *
 * @author dkor
 */
@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity, String> {

	DepartmentEntity getByName(String name);
}
