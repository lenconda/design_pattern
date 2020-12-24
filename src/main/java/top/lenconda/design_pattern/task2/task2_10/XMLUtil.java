package top.lenconda.design_pattern.task2.task2_10;

import java.io.File;
import javax.xml.parsers.*;
import org.w3c.dom.*;

public class XMLUtil {
    public static Object getBean(String args) {
        try {
            DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc=builder.parse(new File("config.xml"));
            NodeList n1 = doc.getElementsByTagName("coffee");
            Node classnode = null;
            String className = null;
            if (args.equals("Milk")) {
                classnode = n1.item(0).getFirstChild();
            } else if (args.equals("Cup")) {
                classnode = n1.item(1).getFirstChild();
            }
            className = classnode.getNodeValue();
            Class c = Class.forName("top.lenconda.design_pattern.task2.task2_10." + className);
            return c.newInstance();
        } catch (Exception e) {
            e.getStackTrace();
            return null;
        }
    }
}
