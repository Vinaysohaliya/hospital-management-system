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

class Admin {
    String name;
    int age;
    String password;
    String email;

    

    
}

interface Database {

    // void loginDatabaseForPatient(){
    // List<Patient> L1=new LinkedList<Patient>;
    // }

}

class PatientDatabase implements Database {
    static List<Patient> L1 = new LinkedList<Patient>();
    static List<String> passwordlist = new LinkedList<String>();
    static List<String> emaillist = new LinkedList<String>();

    String addToDatabase(Patient p) {
        L1.add(p);
        return "You Are Succesfully Register Your self";
    }

}
class DoctorDatabase implements Database {
    static List<Doctor> L2 = new LinkedList<Doctor>();
    static List<String> passwordlist = new LinkedList<String>();
    static List<String> emaillist = new LinkedList<String>();

    String addToDatabase(Doctor p) {
        L2.add(p);
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
                    Scanner scr = new Scanner(System.in);
                    Scanner scrr = new Scanner(System.in);

                    System.out.println("Plese Give Your name");
                    String pname = scr.nextLine();

                    System.out.println("Plese Give Your Age");

                    int page = scr.nextInt();
                    System.out.println("Plese Set Your Password");
                    String Ppassword = scrr.nextLine();
                    PatientDatabase.passwordlist.add(Ppassword);
                    System.out.println("Plese Set Your Email");
                    String Pemail = scrr.nextLine();
                    PatientDatabase.emaillist.add(Pemail);
                    Patient p = new Patient();
                    p.setName(pname);
                    p.setAge(page);
                    p.setPassword(Ppassword);
                    p.setEmail(Pemail);
                    PatientDatabase pd = new PatientDatabase();
                    pd.addToDatabase(p);
                    System.out
                            .println("<--------------------------Plese Login Your Self----------------------------->");

                }
                case 1: {
                    Scanner scr = new Scanner(System.in);
                    System.out.println("Plese Give Your Password");
                    String Ppassword = scr.nextLine();
                    System.out.println("Plese Give Your Email");
                    String Pemail = scr.nextLine();
                    if (PatientDatabase.passwordlist.contains(Ppassword)
                            && PatientDatabase.emaillist.contains(Pemail)) {
                        System.out.println("Your are in the app ");
                        System.out.println("Plese Choose an Options");

                        Boolean looping = true;
                        while (looping) {
                            System.out.println("1.Book Appoinment With  Doctor");
                            System.out.println("2.Laboratory");
                            System.out.println("3.Medicine");
                            System.out.println("4.Exit");
                            int patientOption = scr.nextInt();
                            if (patientOption == 1) {

                                System.out.println("Your Appoinment Time is 10:00 AM ");
                                System.out.println("1.Previous Menu");
                                System.out.println("2.Exit");
                                int patientOption2 = scr.nextInt();
                                if (patientOption2 == 1) {
                                    looping = true;
                                } else if (patientOption2 == 2) {
                                    break;
                                }
                            } else if (patientOption == 2) {

                                boolean labloop = true;
                                while (labloop) {
                                    System.out.println("1.Bood Test");
                                    System.out.println("2.Full body Checkup");
                                    System.out.println("3.Previous Menu");
                                    int patientOption2 = scr.nextInt();

                                    if (patientOption2 == 1) {
                                        System.out.println("Your Amount of Bill is 500/-");
                                        System.out.println("1.Previous Menu");
                                        int lab = scr.nextInt();
                                        if (lab == 1) {
                                            break;
                                        }
                                    } else if (patientOption2 == 2) {
                                        System.out.println("Your Amount of Bill is 1500/-");
                                        System.out.println("1.Previous Menu");
                                        int lab = scr.nextInt();
                                        if (lab == 1) {
                                            break;
                                        }

                                    } else if (patientOption2 == 3) {
                                        break;
                                    }
                                }

                            } else if (patientOption == 3) {
                                System.out.println("Your MEdicine Bill is 150/-");
                                System.out.println("1.Previous Menu");
                                System.out.println("2.Exit");
                                int patientOption2 = scr.nextInt();
                                if (patientOption2 == 1) {
                                    looping = true;
                                } else if (patientOption2 == 2) {
                                    break;
                                }

                            } else if (patientOption == 4) {
                                break;
                            }
                        }

                    } else {
                        System.out.println("Error! Wrong Password or Email");

                    }
                    break;

                }

            }

        } else if (login_choise == 2) {
            System.out
                    .println("IF you are New in this platform Kindly Register Your Self other wise Login Your self !");
            System.out.println("1.Login As Doctor");
            System.out.println("2.Register As Doctor");
            int login_choise2 = sc.nextInt();

            switch (login_choise2) {
                case 2: {
                    Scanner scr = new Scanner(System.in);
                    Scanner scrr = new Scanner(System.in);

                    System.out.println("Plese Give Your name");
                    String dname = scr.nextLine();

                    System.out.println("Plese Give Your Age");

                    int dage = scr.nextInt();
                    System.out.println("Plese Set Your Password");
                    String dpassword = scrr.nextLine();
                    PatientDatabase.passwordlist.add(dpassword);
                    System.out.println("Plese Set Your Email");
                    String demail = scrr.nextLine();
                    PatientDatabase.emaillist.add(demail);
                    Doctor d = new Doctor();
                    d.setName(dname);
                    d.setAge(dage);
                    d.setPassword(dpassword);
                    d.setEmail(demail);
                    DoctorDatabase dd = new DoctorDatabase();
                    dd.addToDatabase(d);
                    System.out
                            .println("<--------------------------Plese Login Your Self----------------------------->");

                }
                case 1: {
                    Scanner scr = new Scanner(System.in);
                    System.out.println("Plese Give Your Password");
                    String dpassword = scr.nextLine();
                    System.out.println("Plese Give Your Email");
                    String demail = scr.nextLine();
                    if (DoctorDatabase.passwordlist.contains(dpassword)
                            && DoctorDatabase.emaillist.contains(demail)) {
                        System.out.println("Your are in the app ");
                        System.out.println("Plese Choose an Options");

                        Boolean looping = true;
                        while (looping) {
                            System.out.println("1.View Appoinment");
                            System.out.println("2.Exit");
                           
                            int patientOption = scr.nextInt();
                            if (patientOption == 1) {

                                System.out.println(PatientDatabase.L1);
                            } else if (patientOption == 2) {
                                break;
                            }
                        }

                    } else {
                        System.out.println("Error! Wrong Password or Email");

                    }
                    break;

                }

            }


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
        Hospital h = new Hospital();
        h.dips();
        try {
            h.choise();

        } catch (Exception e) {
            System.out.println("exception");
        }
    }
}
