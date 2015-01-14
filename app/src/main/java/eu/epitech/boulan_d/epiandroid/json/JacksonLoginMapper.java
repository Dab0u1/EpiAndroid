package eu.epitech.boulan_d.epiandroid.json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by boulan_d on 12/01/2015.
 */
public class JacksonLoginMapper {

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
