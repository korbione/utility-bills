package com.dakor.data.dao;

import com.dakor.data.entity.TariffEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * .
 *
 * @author dkor
 */
@Repository
public interface TariffRepository extends JpaRepository<TariffEntity, String> {
}
