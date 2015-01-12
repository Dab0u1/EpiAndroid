package eu.epitech.boulan_d.epiandroid.json;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * Created by boulan_d on 12/01/2015.
 */
public class JacksonLoginMapper {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        try {

            // read from file, convert it to user class
            Login user = mapper.readValue(new File("C:\\Users\\David\\Desktop\\logintest.txt"), Login.class);

            // display to console
            System.out.println(user);

        } catch (JsonGenerationException e) {

            e.printStackTrace();

        } catch (JsonMappingException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }
    }
}
