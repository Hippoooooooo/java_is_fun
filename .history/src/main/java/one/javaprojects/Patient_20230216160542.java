package one.javaprojects;
import java.util.List;
import java.util.ArrayList;


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
    
  
    /**
     * @param args
     */
    public static void main( String[] args )
    {
        List<Patient> patient = new ArrayList<Patient>();
        Patient patient1 = new Patient("Evelyn","Zhang");
        patient.add(patient1);
        Patient patient2 = new Patient("Jone", "Li");
        patient.add(patient2);
        Patient patient3 = new Patient("H", "D");
        patient.add(patient3);

        patient3.setFirstName("Drew");
        patient3.setLastName("Pawley");
        // System.out.println("The first patient is " + patient.get(0).getFirstName() + " " + patient.get(0).getLastName());
        // System.out.println("The second patient is " + patient.get(0).getFirstName() + " " + patient.get(0).getLastName());
        if(patient.isEmpty()){
            System.out.println("There is no patients waiting today.");
        }else{
            System.out.println("The patients waiting are :");
            for(int i = 0;i <= patient.size(); i++){
                System.out.println(patient.get(i).getFirstName() + " " + patient.get(i).getLastName());
            }
        System.out.println();
        }
    }
} 
