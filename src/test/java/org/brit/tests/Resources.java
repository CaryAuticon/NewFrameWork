package org.brit.tests;




import java.util.Date;


// Write down json paths here - CS
public class Resources {


    // These lines used to be protected static void [name] { ...  -CS

    private Integer id;
    private String firstName;
    private String lastName;



    public Resources(Integer id, String firstName, String lastName, Date birthDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    //Getters and setters

    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", " + "lastName=" +  lastName + "]";

    }


}




