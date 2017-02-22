package com.dakor.data.dao;

import com.dakor.data.entity.DepartmentEntity;
import com.dakor.data.entity.TariffEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * .
 *
 * @author dkor
 */
@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity, String> {

	@Modifying
	@Query("UPDATE DepartmentEntity SET tariff = :tariff WHERE id = :id")
	void saveTariff(@Param("id") String departmentId, @Param("tariff") TariffEntity tariff);
}
