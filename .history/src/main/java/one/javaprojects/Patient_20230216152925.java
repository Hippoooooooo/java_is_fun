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
    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

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
        patient.set(02, patient2)
        System.out.println("The first patient is " + patient1.getFirstName() + " " + patient1.getLastName());
        System.out.println("The second patient is " + patient2.getFirstName() + " " + patient2.getLastName());
    }


}
