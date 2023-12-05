package com.sibeat.stockproduction.service;

import com.sibeat.stockproduction.domain.model.RawMaterial;

public interface RawMaterialService {

    RawMaterial findById(Long id);

    RawMaterial create(RawMaterial rawMaterialToCreate);
}
