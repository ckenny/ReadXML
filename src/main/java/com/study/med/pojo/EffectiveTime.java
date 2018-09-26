
package com.study.med.pojo;

public class EffectiveTime {


    private String value;
    
    private Low low;


    public String getValue() {
        return value;
    }


    public void setValue(String value) {
        this.value = value;
    }

    
    public Low getLow() {
        return low;
    }

    
    public void setLow(Low low) {
        this.low = low;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("value:'").append(value).append('\'');
        if(low != null) sb.append(", low:").append(low);
        sb.append('}');
        return sb.toString();
    }
}
