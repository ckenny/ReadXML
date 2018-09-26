
package com.study.med.pojo;

public class ObservationMedia {


    private String text;

    private Value value;

    private String iD;


    public String getText() {
        return text;
    }


    public void setText(String text) {
        this.text = text;
    }


    public Value getValue() {
        return value;
    }


    public void setValue(Value value) {
        this.value = value;
    }


    public String getID() {
        return iD;
    }


    public void setID(String iD) {
        this.iD = iD;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        if(text != null) sb.append("text:'").append(text).append('\'');
        if(value != null) sb.append(", value:").append(value);
        if(iD != null) sb.append(", iD:'").append(iD).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
