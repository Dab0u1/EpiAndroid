package eu.epitech.boulan_d.epiandroid.json;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonMappingException;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by boulan_d on 12/01/2015.
 */
public class JacksonLoginMapper {

    /*
    public static void main(String[] args) throws IOException, NullPointerException {
        String genreJson = readFile("C:\\Users\\David\\Desktop\\logintest.txt");

        // create an ObjectMapper instance.
        ObjectMapper mapper = new ObjectMapper();
        // use the ObjectMapper to read the json string and create a tree
        JsonNode node = mapper.readTree(genreJson);

        // lets see what type the node is
        System.out.println(node.getNodeType()); // prints OBJECT
        // is it a container
        System.out.println(node.isContainerNode()); // prints true
        // lets find out what fields it has
        Iterator<String> fieldNames = node.fieldNames();
        while (fieldNames.hasNext()) {
            String fieldName = fieldNames.next();
            System.out.println(fieldName);
        }

        // we now know what elemets the container has. lets get the value for
        // one of them
        System.out.println();
        System.out.print("login: ");
        System.out.println(node.get("login").asText());

        System.out.println();
        JsonNode dataset = node.get("picture");

        // what is its type?
        System.out.print("picture data type: ");
        System.out.println(dataset.getNodeType()); // Prints ARRAY

        System.out.println();
        dataset = node.get("promo");

        // what is its type?
        System.out.print("promo data type: ");
        System.out.println(dataset.getNodeType()); // Prints ARRAY
    }*/

    public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException, NullPointerException {
        JsonFactory f = new JsonFactory();
        JsonParser jp = f.createParser(new File("C:\\Users\\David\\Desktop\\logintest2.json"));
        Login user = new Login();
        jp.nextToken(); // will return JsonToken.START_OBJECT (verify?)
        while (jp.nextToken() != JsonToken.END_OBJECT) {
            String fieldname = jp.getCurrentName();
            System.out.println(fieldname);
            jp.nextToken(); // move to value, or START_OBJECT/START_ARRAY
            if ("id".equals(fieldname)) // contains an object
                user.setId(jp.getText());
            else if ("login".equals(fieldname))
                user.setLogin(jp.getText());
            else if ("promo".equals(fieldname))
                user.setPromo(jp.getIntValue());
            else if ("admin".equals(fieldname))
                user.setAdmin(jp.getBooleanValue());

        }
        jp.close(); // ensure resources get cleaned up timely and properly
        System.out.println(user.getId());
        System.out.println(user.getLogin());
        System.out.println(user.getPromo());
        System.out.println(user.isAdmin());
    }

    private static String readFile(String pathname) throws IOException {

        File file = new File(pathname);
        StringBuilder fileContents = new StringBuilder((int) file.length());
        Scanner scanner = new Scanner(file);
        String lineSeparator = System.getProperty("line.separator");

        try {
            while (scanner.hasNextLine()) {
                fileContents.append(scanner.nextLine() + lineSeparator);
            }
            return fileContents.toString();
        } finally {
            scanner.close();
        }
    }


}
