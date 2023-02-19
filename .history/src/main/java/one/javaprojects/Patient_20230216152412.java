package one.javaprojects;
import java.util.List;

import javax.annotation.processing.Generated;

import java.util.ArrayList;

/**
 * create a list of patatients
 *
 */
√
public class Patient{
    /**
     * @param args
     */
    private String firstName;
    private String lastName;
    ≈
    public Patient(String firstName,String lastName ){
        this.firstName = firstName;
        this.lastName = lastName ;
    } 
    


    public static void main( String[] args )
    {
        List<Patient> patient = new ArrayList<Patient>();
        Patient patient1 = new Patient("Evelyn","Zhang");
        patient.add(patient1);
        Patient patient2 = new Patient("Jone", "Li");
        patient.add(patient2);
        System.out.println("The first patient is" + patient.ge);

    }
}
