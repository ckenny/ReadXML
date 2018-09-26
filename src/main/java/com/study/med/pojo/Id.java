
package com.study.med.pojo;

public class Id {

    
    private String extension;
    
    private String root;


    public String getExtension() {
        return extension;
    }

    
    public void setExtension(String extension) {
        this.extension = extension;
    }

    
    public String getRoot() {
        return root;
    }

    
    public void setRoot(String root) {
        this.root = root;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        if(extension != null) {
            sb.append("extension:'").append(extension).append('\'');
        }
        if(root != null) {
            if(sb.length()>1) {
                sb.append(',');
            }
            sb.append(" root:'").append(root).append('\'');
        }
        sb.append('}');
        return sb.toString();
    }

}
