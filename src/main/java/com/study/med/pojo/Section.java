
package com.study.med.pojo;

public class Section {

    
    private Id id;

    private Code code;
    
    private EffectiveTime effectiveTime;
    
    private Object subject;
    
    private Object title;
    
    private Text text;
    
    private String iD;

    private Object component = null;


    public Id getId() {
        return id;
    }

    
    public void setId(Id id) {
        this.id = id;
    }


    public Code getCode() {
        return code;
    }


    public void setCode(Code code) {
        this.code = code;
    }

    
    public EffectiveTime getEffectiveTime() {
        return effectiveTime;
    }

    
    public void setEffectiveTime(EffectiveTime effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    
    public Object getSubject() {
        return Text.getObjectDetails(subject);
    }

    
    public void setSubject(Object subject) {
        this.subject = subject;
    }

    
    public String getTitle() {
        return Text.getObjectDetails(title);
    }

    
    public void setTitle(Object title) {
        this.title = title;
    }

    
    public Text getText() {
        return text;
    }

    
    public void setText(Text text) {
        this.text = text;
    }

    
    public String getID() {
        return iD;
    }

    
    public void setID(String iD) {
        this.iD = iD;
    }


    public Object getComponent() {
        return Text.getObjectDetails(component);
    }

    public void setComponent(Object component) {
        this.component = component;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        if(id != null) {
            sb.append("id:").append(id);
        }
        if(code != null) {
            if(sb.length()>1) {
                sb.append(',');
            }
            sb.append(" code:").append(code);
        }
        if(effectiveTime != null) {
            if(sb.length()>1 && sb.charAt(sb.length()-1) != ',') {
                sb.append(',');
            }
            sb.append(" effectiveTime:").append(effectiveTime);
        }
        if(subject != null) {
            if(sb.length()>1 && sb.charAt(sb.length()-1) != ',') {
                sb.append(',');
            }
            sb.append(" subject:").append(Text.getObjectDetails(subject));
        }
        if(title != null) {
            if(sb.length()>1 && sb.charAt(sb.length()-1) != ',') {
                sb.append(',');
            }
            sb.append(" title:").append(Text.getObjectDetails(title));
        }
        if(text != null) {
            if(sb.length()>1 && sb.charAt(sb.length()-1) != ',') {
                sb.append(',');
            }
            sb.append(" text:").append(text);
        }
        if(iD != null) {
            if(sb.length()>1 && sb.charAt(sb.length()-1) != ',') {
                sb.append(',');
            }
            sb.append(" iD:'").append(iD).append('\'');
        }
        if(component != null) {
            if(sb.length()>1 && sb.charAt(sb.length()-1) != ',') {
                sb.append(',');
            }
            sb.append(" component:").append(Text.getObjectDetails(component));
        }
        sb.append('}');
        return sb.toString();
    }
}
