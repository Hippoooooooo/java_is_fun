package one.javaprojects;
import java.util.List;
import java.util.ArrayList;

/**
 * create a list of patatients
 *
 */
public class Patient{
    /**
     * @param args
     */
    private String firstName;
    private String lastName;


    public Patient(String firstName,String lastName ){
        this.firstName = firstName;
    } 
    public static void main( String[] args )
    {
        List<Patient> patient = new ArrayList<Patient>();
        Patient patient1 = new Patient();
        patient.add(patient1);
        Patient patient2 = new Patient("Jone", "lI");
  
   
        
        

    }
}
