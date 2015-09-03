package model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Class to access the xml file for the clients and clans stats
 * @author Xcreed
 */
@SuppressWarnings("unused")
public class XML{

    
    public void read() throws Exception {
        
        //Get the DOM Builder Factory
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        //Get the DOM Builder
        DocumentBuilder builder = factory.newDocumentBuilder();

        //Load and Parse the XML document
        //document contains the complete XML as a Tree.
        Document document = 
                (Document) builder.parse(new File("src/res/DuckStats.xml"));
   
        
        //Iterating through the nodes and extracting the data.
        NodeList nodeList = document.getDocumentElement().getChildNodes();
        
        for (int i = 0; i < nodeList.getLength(); i++) {
            
            //Finds an element
            Node node = nodeList.item(i);
            
            //For every element in the xml
            if (node instanceof Object) {
                String content = node.getTextContent().trim();
                switch (node.getNodeName()) {
                    
                    //If the name of the stat is:
                    
                    
                }
                
            }
        }
 
    }
}
