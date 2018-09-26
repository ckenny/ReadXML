
package com.study.med.pojo;

public class Subject {

    
    private ManufacturedProduct manufacturedProduct;


    public ManufacturedProduct getManufacturedProduct() {
        return manufacturedProduct;
    }

    
    public void setManufacturedProduct(ManufacturedProduct manufacturedProduct) {
        this.manufacturedProduct = manufacturedProduct;
    }

    @Override
    public String toString() {
        return "{" + "manufacturedProduct:" + manufacturedProduct + '}';
    }
}
