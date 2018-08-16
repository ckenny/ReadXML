
package com.study.med.pojo;

import java.util.HashMap;
import java.util.Map;







public class Subject {

    
    private ManufacturedProduct manufacturedProduct;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    
    public ManufacturedProduct getManufacturedProduct() {
        return manufacturedProduct;
    }

    
    public void setManufacturedProduct(ManufacturedProduct manufacturedProduct) {
        this.manufacturedProduct = manufacturedProduct;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
