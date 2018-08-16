package com.study.med;

import com.study.med.pojo.Component;
import com.study.med.pojo.Document;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class ReadSetIdDetailsJaxb {

    public static void main(String[] args) {
        try {
            Document document;
            // Read the student.xml
            ClassLoader classLoader = ClassLoader.getSystemClassLoader();
            File file = new File(classLoader.getResource("setid_sample/3f3183df-3ecf-42a0-970d-f7b3669d9c74.xml").getFile());

            JAXBContext jaxbContext = JAXBContext.newInstance(Document.class);

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            document = (Document) unmarshaller.unmarshal(file);

            System.out.println("Title: " + document.getTitle());
            System.out.println("Represented Organization: " + document.getAuthor().getAssignedEntity().getRepresentedOrganization().getName());

            List<Component> components = document.getComponent().getStructuredBody().getComponent();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
