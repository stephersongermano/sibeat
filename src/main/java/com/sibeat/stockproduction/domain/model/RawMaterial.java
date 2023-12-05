package com.sibeat.stockproduction.domain.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "tb_stockfeed")
public class RawMaterial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rawMaterialName;
    private int quantityInStock;
    private Date purchaseDate;

    // private Supplier supplier;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Supplier> supplier;

    // private int supplierID;
    // private SupplierAddress supplierAddress;

    public List<Supplier> getSupplier() {
        return supplier;
    }

    public void setSupplier(List<Supplier> supplier) {
        this.supplier = supplier;
    }

    public String getRawMaterialName() {
        return rawMaterialName;
    }

    public void setRawMaterialName(String rawMaterialName) {
        this.rawMaterialName = rawMaterialName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

}
