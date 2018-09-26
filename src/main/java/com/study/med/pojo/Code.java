
package com.study.med.pojo;

public class Code {

    private String code;
    private String codeSystem;
    private String displayName;

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


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        if(code != null) sb.append("code:'").append(code).append('\'');
        if(codeSystem != null) sb.append(", codeSystem:'").append(codeSystem).append('\'');
        if(displayName != null) sb.append(", displayName:'").append(displayName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
