
package com.study.med.pojo;

import java.util.HashMap;
import java.util.Map;


public class Quantity {

    private Numerator numerator;
    private Denominator denominator;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Numerator getNumerator() {
        return numerator;
    }

    public void setNumerator(Numerator numerator) {
        this.numerator = numerator;
    }

    public Denominator getDenominator() {
        return denominator;
    }

    public void setDenominator(Denominator denominator) {
        this.denominator = denominator;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
