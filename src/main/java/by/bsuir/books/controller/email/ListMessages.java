package by.bsuir.books.controller.email;


import by.bsuir.books.util.GetPath;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 28.03.2017.
 */
public class ListMessages {
    private static List<Message> list = initialize();

    public static List<Message> initialize(){
        List<Message> messageList = new ArrayList<>();

        try {
            File fXmlFile = new File(new GetPath().getPath()+"/../classes/message.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            //optional, but recommended
            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("message");

            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;
                    Message message = new Message();
                    message.setName(eElement.getElementsByTagName("name").item(0).getTextContent());
                    message.setTheme(eElement.getElementsByTagName("theme").item(0).getTextContent());
                    message.setText(eElement.getElementsByTagName("text").item(0).getTextContent());
                    messageList.add(message);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return messageList;
    }

    public static List<Message> getList() {
        return list;
    }
}
