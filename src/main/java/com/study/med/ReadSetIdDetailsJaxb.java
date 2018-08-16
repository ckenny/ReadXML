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
            File file = new File(classLoader.getResource("setid_sample_2/28ac5a7d-9a25-4194-86bd-ca89cc0a1373.xml").getFile());

            JAXBContext jaxbContext = JAXBContext.newInstance(Document.class);

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            document = (Document) unmarshaller.unmarshal(file);

            List<Component> components = document.getComponent().getStructuredBody().getComponent();


            System.out.println("Title: " + document.getTitle());
            System.out.println("Represented Organization: " + document.getAuthor().getAssignedEntity().getRepresentedOrganization().getName());

            for(Component component : components) {
                if(component.getSection()!=null
                        && component.getSection().getTitle()!=null
                        && component.getSection().getTitle().equals("DESCRIPTION")) {
                    System.out.println("DESCRIPTION: " + component.getSection().getText());
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
