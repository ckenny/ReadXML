
package com.study.med.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Text {

    //private java.util.List<Paragraph> paragraph = null;
    private Object paragraph = null;
    private Object list = null;
    private Object renderMultiMedia = null;

    public Object getParagraph() {
        return paragraph;
    }

    public void setParagraph(Object paragraph) {
        this.paragraph = paragraph;
    }

    public Object getList() {
        return list;
    }

    public void setList(Object list) {
        this.list = list;
    }

    public Object getRenderMultiMedia() {
        return renderMultiMedia;
    }

    public void setRenderMultiMedia(Object renderMultiMedia) {
        this.renderMultiMedia = renderMultiMedia;
    }

    static String getObjectDetails(Object object) {
        StringBuilder stringBuilder = new StringBuilder();
        if(object != null) {
            if (object instanceof String) {
                stringBuilder.append("\"").append(object).append("\"");
            } else if (object instanceof List) {
                List<Object> objectList = (List<Object>) object;
                String [] strings = new String[objectList.size()];
                int i = 0;
                for (Object subObject : objectList) {
                    String objString = getObjectDetails(subObject);
                    if(objString.startsWith("{")) {
                        strings[i++] = "\n" + objString;
                    } else {
                        strings[i++] = "\n{content:" + objString+"}";
                    }
                }
                stringBuilder.append(Arrays.toString(strings));
//                stringBuilder.append("[");
//                for (Object subObject : objectList) {
//                    stringBuilder.append("\n").append(getObjectDetails(subObject));
//                }
//                stringBuilder.append("\n").append("]");
            } else if (object instanceof Map) {
                Map<String, Object> objectMap = (Map<String, Object>) object;
                Set<String> keys = objectMap.keySet();
                stringBuilder.append("{");
                boolean addComma = false;
                for (String k : keys) {
                    if(!k.equalsIgnoreCase("listType") && !k.equalsIgnoreCase("xsi:type")) {
                        Object subObject = objectMap.get(k);
                        if(addComma) {
                            stringBuilder.append(",");
                        }
                        stringBuilder.append("\n").append(k).append(":").append(getObjectDetails(subObject));
                        addComma = true;
                    }
                }
                stringBuilder.append("\n").append("}");
            } else if(object instanceof Number) {
                stringBuilder.append("\n").append("\"").append(object).append("\"");
            } else {
                System.out.println("pending to implement: " + (object.getClass().getSimpleName()));
            }
        }
        return (stringBuilder.length() > 0) ? stringBuilder.toString() : "''";
    }

    public String toString() {
        String result;
        if(paragraph != null) {
            result = getObjectDetails(paragraph);
        } else {
            result = "''";
        }

        return result;
    }
}
