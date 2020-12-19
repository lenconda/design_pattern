package top.lenconda.design_pattern.task2.task2_2;

import java.io.File;
import javax.xml.parsers.*;
import org.w3c.dom.*;

public class XMLUtil {
    public static Object getBean(String args) {
        try {
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc = builder.parse(new File("config.xml"));
            NodeList n1 = doc.getElementsByTagName("className");
            Node classnode = null;
            String className = null;
            if (args.equals("Output")) {
                classnode = n1.item(0).getFirstChild();
            } else if (args.equals("OperatingSystem")) {
                classnode = n1.item(1).getFirstChild();
            } else if (args.equals("EncodingLanguage")) {
                classnode = n1.item(2).getFirstChild();
            }
            className = classnode.getNodeValue();
            Class c = Class.forName("top.lenconda.design_pattern.task2.task2_2." + className);
            Object obj = c.newInstance();
            return obj;
        } catch(Exception e) {
            e.getStackTrace();
            return null;
        }
    }
}
