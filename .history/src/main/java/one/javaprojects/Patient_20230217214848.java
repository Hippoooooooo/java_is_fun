
package one.javaprojects.M;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Patient {
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

    public Patient(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

class Booking {
    private LocalTime startingTime;
    private LocalTime endTime;
    private Patient patient;

    public Booking(LocalTime startingTime, LocalTime endTime,Patient patient) {
        this.startingTime = startingTime;
        this.endTime = endTime;
        this.patient = patient;
    }

    public LocalTime getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(LocalTime startingTime) {
        this.startingTime = startingTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }    

    public Duration getDuration(){
        return Duration.between(startingTime, endTime);
    }
}

class Main {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<Patient>();
        List<Booking> bookings = new ArrayList<Booking>();
        Patient patient1 = new Patient("Evelyn", "Zhang");
        patients.add(patient1);
        Patient patient2 = new Patient("Milly", "Li");
        patients.add(patient2);
        Patient patient3 = new Patient("Sandy", "D");
        patients.add(patient3);

        patient3.setFirstName("Drew");
        patient3.setLastName("P");

        Booking booking1 = new Booking(LocalTime.of(10, 15, 0), LocalTime.of(11, 20, 0),patient1);
        bookings.add(booking1);   
        Booking booking2 = new Booking(LocalTime.of(12, 12, 0), LocalTime.of(13, 12, 0),patient2);
        bookings.add(booking2);
        Booking booking3 = new Booking(LocalTime.of(14, 20, 0), LocalTime.of(15, 10, 0),patient3);
        bookings.add(booking3);        
        if (patients.isEmpty()) {
            System.out.println("There is no patients waiting today.");
        } else {
            System.out.println("The patients waiting are :");
            System.out.println("**************************************************");
            // for (int k = 0; k < patient.size(); k++) {
            //     System.out.println(patient.get(k).getFirstName() + " " + patient.get(k).getLastName());
            //     for(int j = k; j<= k;j++){
            //        Duration bookingTime = Duration.between(booking.get(j).getStartingTime(),booking.get(j).getEndTime());  
            //        System.out.println("Your actual booking duration is "+ bookingTime);
            //        System.out.println("**************************************************");
            //     }     
            // }
            for(Patient patient: patients){
                System.out.println(patient.getFirstName() +" " + patient.getLastName());
                for(Booking booking: bookings){
                    if(booking.getPatient()==patient){
                        System.out.println("Your actual booking durating is  " + booking.getDuration());
                        System.out.println("**************************************************");
                    }
                }
            }
        }
    }
}
