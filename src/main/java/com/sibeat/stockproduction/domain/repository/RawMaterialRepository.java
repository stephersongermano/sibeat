package com.sibeat.stockproduction.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sibeat.stockproduction.domain.model.RawMaterial;

public interface RawMaterialRepository extends JpaRepository<RawMaterial, Long> {

    boolean existById(Long rawMaterialId);
}
