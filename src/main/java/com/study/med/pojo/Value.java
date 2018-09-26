
package com.study.med.pojo;

public class Value {

    private String code;
    private String codeSystem;
    private String displayName;
    private String xsiType;
    private Reference reference;
    private String mediaType;
    private String originalText;
    private String unit;

    private String value;
    private String text;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeSystem() {
        return codeSystem;
    }

    public void setCodeSystem(String codeSystem) {
        this.codeSystem = codeSystem;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getXsiType() {
        return xsiType;
    }

    public void setXsiType(String xsiType) {
        this.xsiType = xsiType;
    }

    public Reference getReference() {
        return reference;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public String getOriginalText() {
        return originalText;
    }

    public void setOriginalText(String originalText) {
        this.originalText = originalText;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }


    public String getValue() {
        return value;
    }


    public void setValue(String value) {
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        if(code!=null) sb.append("code:'").append(code).append('\'');
        if(codeSystem!=null) sb.append(", codeSystem:'").append(codeSystem).append('\'');
        if(displayName!=null) sb.append(", displayName:'").append(displayName).append('\'');
        if(xsiType!=null) sb.append(", xsiType:'").append(xsiType).append('\'');
        if(reference!=null) sb.append(", reference:").append(reference);
        if(mediaType!=null) sb.append(", mediaType:'").append(mediaType).append('\'');
        if(originalText!=null) sb.append(", originalText:'").append(originalText).append('\'');
        if(unit!=null) sb.append(", unit:'").append(unit).append('\'');
        if(value!=null) sb.append(", value:'").append(value).append('\'');
        if(text!=null) sb.append(", text:'").append(text).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
