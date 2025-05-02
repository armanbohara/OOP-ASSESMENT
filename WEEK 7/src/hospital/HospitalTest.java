package hospital;

//Driver class
public class HospitalTest {
 public static void main(String[] args) {
     Doctor doc = new Doctor(1, "Dr. Arman");
     Nurse nurse = new Nurse(2, "AB");
     Receptionist receptionist = new Receptionist(3, "CD");
     Cleaner cleaner = new Cleaner(4, "EF");

     doc.diagnose();
     nurse.assist();
     receptionist.answerCalls();
     cleaner.clean();
 }
}


