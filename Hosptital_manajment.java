import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Welcome {
    void display() {
        System.out.println("<-------Hope You Fine, Welcome our Hospital-------->");
    }
}

interface MainDisplay {
    void choise();
}

class Manegment implements MainDisplay, Database {
    int val;
    String pname;
    int page;
    String pnumber;

    public void showData() {
        System.out.println(ll);
    }

    public void choise() {
        System.out.println("Plese Choose Option");
        System.out.println("1. Entry");
        System.out.println("2. Show Record");
        System.out.println("3. Exit");
        Scanner sc = new Scanner(System.in);
        val = sc.nextInt();

        while (val != 3) {
            if (val == 1) {
                Patiunt p = new Patiunt();
                pname = p.infoname();
                page = p.infoage();
                pnumber = p.infonum();

                ll.add(p);
                System.out.println("<------------------------------------------------>");
                System.out.println("1. Entry");
                System.out.println("2. Show Record");
                System.out.println("3. Exit");
                val = sc.nextInt();

            } else if (val == 2) {
                showData();
                System.out.println("<------------------------------------------------>");
                System.out.println("1. Entry");
                System.out.println("2. Show Record");
                System.out.println("3. Exit");
                val = sc.nextInt();

            }

        }
    }
}

interface Database {

    List ll = new LinkedList();

    void showData();
}

class Patiunt {
    String name;
    int age;
    String number;

    String infoname() {
        System.out.println("====>>>>plese give your name<<<<====");
        Scanner sc = new Scanner(System.in);

        this.name = sc.nextLine();
        return name;
    }

    int infoage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("====>>>>plese give your Age<<<<====");
        this.age = sc.nextInt();
        return age;
    }

    String infonum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("====>>>>plese give your Phonr number<<<<====");
        this.number = sc.nextLine();
        return number;
    }

    public String toString() {
        return "Name:" + name + " Age:" + age + " Number:2" + number;
    }
}

public class Hosptital_manajment {
    public static void main(String[] args) {
        Welcome w = new Welcome();
        w.display();
        Manegment m = new Manegment();
        m.choise();

    }

}