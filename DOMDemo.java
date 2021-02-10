import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.File;
import java.util.*;
public class DOMDemo
{
    public static void main(String argv[]) 
   {
       try 
      {
         //Get Document Builder
         DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
         DocumentBuilder builder = factory.newDocumentBuilder();
 
        //Build Document
        Document doc = builder.parse(new File("user.xml"));
 
        //Normalize the XML Structure
       doc.getDocumentElement().normalize();

       //Input the User Id 
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter user id: ");
       String id=sc.next();

       //Get the root node
       Element root = doc.getDocumentElement();
      
      // Get user details
      NodeList nList = doc.getElementsByTagName("user");
      
     for (int temp = 0; temp < nList.getLength(); temp++)
     {
        Node node = nList.item(temp);
        if (node.getNodeType() == Node.ELEMENT_NODE)
       {
           Element e = (Element) node;
           String str=e.getAttribute("id");
           if(str.equals(id))
          {
              System.out.println("The Root Element :"    +root.getNodeName());
              System.out.println("======================");

              System.out.println("User id : " + e.getAttribute("id"));
              System.out.println("User Name : " +e.getElementsByTagName("username").item(0).getTextContent());
               System.out.println("Address : "   + e.getElementsByTagName("address").item(0).getTextContent());
               System.out.println("Phone No: "    + e.getElementsByTagName("phone").item(0).getTextContent());
           }
        }
    }//for
 } 
  catch (Exception e){    e.printStackTrace();  }
}
}