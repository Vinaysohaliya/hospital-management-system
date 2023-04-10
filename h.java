import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Patient {
    String name;
    int age;
    String password;
    String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

class Doctor {
    String name;
    int age;
}

class Admin {
    String name;
    int age;
}

interface Database {

    // void loginDatabaseForPatient(){
    // List<Patient> L1=new LinkedList<Patient>;
    // }

}

class PatientDatabase implements Database {
   static List<Patient> L1 = new LinkedList<Patient>();
   static List<String> passwordlist=new LinkedList<String>();
   static List<String> emaillist=new LinkedList<String>();

    String addToDatabase(Patient p) {
        L1.add(p);
        return "You Are Succesfully Register Your self";
    }

}

class Hospital {
    void dips() {
        System.out.println("Welcome to Hospital Have A good day");
    }

    void choise() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Plese select an Option");
        System.out.println("1.Patient");
        System.out.println("2.Doctor");
        System.out.println("3.Admin");
        int login_choise = sc.nextInt();

        if (login_choise == 1) {
            System.out
                    .println("IF you are New in this platform Kindly Register Your Self other wise Login Your self !");
            System.out.println("1.Login As Patient");
            System.out.println("2.Register As Patient");

            int login_choise2 = sc.nextInt();

            switch (login_choise2) {
                case 2: {
                    System.out.println("DVsfssfg");
                    System.out.println("Plese Give Your name");
                    String pname = sc.nextLine();
                    System.out.println("Plese Give Your Age");
                    int page = sc.nextInt();
                    System.out.println("Plese Set Your Password");
                    String Ppassword = sc.nextLine();
                    PatientDatabase.passwordlist.add(Ppassword);
                    System.out.println("Plese Set Your Email");
                    String Pemail = sc.nextLine();
                    PatientDatabase.emaillist.add(Pemail);
                    Patient p = new Patient();
                    p.setName(pname);
                    p.setAge(page);
                    p.setPassword(Ppassword);
                    p.setEmail(Pemail);
                    PatientDatabase pd = new PatientDatabase();
                    pd.addToDatabase(p);
                    System.out.println("<--------------------------Plese Login Your Self----------------------------->");

                }
                case 1: {                   
                    System.out.println("Plese Give Your Password");
                    String Ppassword = sc.nextLine();
                    System.out.println("Plese Give Your Email");
                    String Pemail = sc.nextLine();
                   if (PatientDatabase.passwordlist.contains(Ppassword)&&PatientDatabase.emaillist.contains(Pemail)) {
                    System.out.println("Your are in login");
                   } else {
                    System.out.println("Error");
                    
                   }

                   
                
                }

                

            }

        } else if (login_choise == 2) {
            System.out
                    .println("IF you are New in this platform Kindly Register Your Self other wise Login Your self !");
            System.out.println("1.Login As Doctor");
            System.out.println("2.Register As Doctor");

        } else if (login_choise == 3) {
            System.out
                    .println("IF you are New in this platform Kindly Register Your Self other wise Login Your self !");
            System.out.println("1.Login As Admin");
            System.out.println("2.Register As Admin");

        }
        {

        }

    }
}

public class h {
    public static void main(String[] args) {
        Hospital h=new Hospital();
        h.dips();
        h.choise();
    }
}
