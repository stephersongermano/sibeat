package com.sibeat.stockproduction.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.sibeat.stockproduction.domain.model.RawMaterial;
import com.sibeat.stockproduction.service.RawMaterialService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/rawMaterial")
public class RawMaterialController {

    private final RawMaterialService rawMaterialService;

    public RawMaterialController(RawMaterialService rawMaterialService) {
        this.rawMaterialService = rawMaterialService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<RawMaterial> findById(@PathVariable Long id) {
        var rawMaterial = rawMaterialService.findById(id);
        return ResponseEntity.ok(rawMaterial);
    }

    @PostMapping
    public ResponseEntity<RawMaterial> create(@RequestBody RawMaterial rawMaterial) {
        rawMaterialService.create(rawMaterial);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(rawMaterial.getId())
                .toUri();

        return ResponseEntity.created(location).body(rawMaterial);
    }

}
