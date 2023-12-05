package com.sibeat.stockproduction.service.impl;

import org.springframework.stereotype.Service;
import java.util.NoSuchElementException;

import com.sibeat.stockproduction.domain.model.RawMaterial;
import com.sibeat.stockproduction.domain.repository.RawMaterialRepository;
import com.sibeat.stockproduction.service.RawMaterialService;

@Service
public class RawMaterialServiceImpl implements RawMaterialService {

    private final RawMaterialRepository rawMaterialRepository;

    public RawMaterialServiceImpl(RawMaterialRepository rawMaterialRepository) {
        this.rawMaterialRepository = rawMaterialRepository;
    }

    @Override
    public RawMaterial create(RawMaterial rawMaterialToCreate) {
        if (rawMaterialRepository.existById(rawMaterialToCreate.getId())) {
            throw new IllegalArgumentException("This raw material id already exist.");
        }
        return rawMaterialRepository.save(rawMaterialToCreate);
    }

    @Override
    public RawMaterial findById(Long id) {
        return rawMaterialRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

}
