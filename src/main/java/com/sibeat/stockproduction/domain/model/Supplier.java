package com.sibeat.stockproduction.domain.model;

import jakarta.persistence.*;
import java.util.List;

@Entity(name = "tb_supplier")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String supplierName;
    private List<String> contactPhone;
    private List<String> contactEmail;

    // private List<RawMaterial> suppliedMaterials;
    @OneToMany
    private RawMaterial rawMaterial;

    // private SupplierAddress supplierAddress;
    @OneToMany
    private List<SupplierAdress> supplierAdress;

    public RawMaterial getRawMaterial() {
        return rawMaterial;
    }

    public void setRawMaterial(RawMaterial rawMaterial) {
        this.rawMaterial = rawMaterial;
    }

    public List<SupplierAdress> getSupplierAdress() {
        return supplierAdress;
    }

    public void setSupplierAdress(List<SupplierAdress> supplierAdress) {
        this.supplierAdress = supplierAdress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public List<String> getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(List<String> contactPhone) {
        this.contactPhone = contactPhone;
    }

    public List<String> getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(List<String> contactEmail) {
        this.contactEmail = contactEmail;
    }

}
