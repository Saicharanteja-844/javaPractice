import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class Serilization {

    public static void main(String args[]) {
        Stud ob = new Stud(1, "aman");
        try {
            FileOutputStream fos = new FileOutputStream("a.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ob);
            oos.close();
            fos.close();
            System.out.println("Task Done");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Stud implements Serializable {

    int roll;
    String name;

    Stud(int r, String n) {
        this.roll = r;
        this.name = n;
    }
}