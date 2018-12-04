package org.brit.tests;



import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JavaToJSON_Convert extends Resources {

    private static final Object Resources = org.brit.tests.Resources;

    // I have little to no idea what the heck I'm doing.  Unsure of what Object Resources should be equal to. -CS

    public static void main(String[] args) {
        JavaToJSON_Convert obj = new JavaToJSON_Convert();
        obj.run();
    }

    private void run() {
        ObjectMapper mapper = new ObjectMapper();
        Resources staff = createDummyObject();

        try {
            mapper.writeValue(new File("/Users/user/rest-assured-example/src/test/java/org/brit/tests/Resources.java"), Resources);

            String jsonInString =  mapper.writeValueAsString(staff);
            System.out.println(jsonInString);

            jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff);
            System.out.println(jsonInString);

        } catch (IOException e) {
            e.printStackTrace();

        }




    }

    private static Resources createDummyObject() {
        Resources staff = new Resources();

        staff.setName("Glarester");
        staff.setAge(30);
        staff.setPosition("Amateur_Automator");
        staff.setSalary(new BigDecimal("7500"));

        List<String> skills = new ArrayList<>();
        skills.add("java");
        skills.add("jackson");

        staff.setSkills(skills);

        return staff;
    }


}
