package org.brit.tests;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;


public class JavaToJSON_Convert {

    private static final Object Resources = org.brit.tests.Resources;


    public static void main(String[] args) {

        @SuppressWarnings("deprecation")
        Resources resources = new Resources(1, "John", "Doe", new Date(1981, 8, 18));
        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.writeValue(new File("/Users/user/rest-assured-example/src/test/java/org/brit/tests/Resources.java"), Resources);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }







    }


