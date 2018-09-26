package com.study.med;

import com.google.gson.Gson;
import com.study.med.pojo.Document;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class ReadSetIdDetailsJson {
    public static void main(String[] args) {
        try {
            ClassLoader classLoader = ClassLoader.getSystemClassLoader();
            File file = new File(classLoader.getResource("setid_sample_2/28ac5a7d-9a25-4194-86bd-ca89cc0a1373.xml").getFile());
            //File file = new File(classLoader.getResource("setid_sample/3f3183df-3ecf-42a0-970d-f7b3669d9c74.xml").getFile());

            String xml = new String(Files.readAllBytes(Paths.get(file.toURI())));

            xml = xml.replace('↵', ' ');

            JSONObject jsonObj = XML.toJSONObject(xml);
            jsonObj = (JSONObject)jsonObj.get("document");
            Document document = new Gson().fromJson(jsonObj.toString(), Document.class);
            System.out.println("Document.title = " + document.getTitle());
            System.out.println("Document.title = " + jsonObj.get("title"));
            System.out.println(document);

        } catch (JSONException | IOException e) {
            e.printStackTrace();
        }
    }
}
