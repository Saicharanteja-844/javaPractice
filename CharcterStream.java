import java.io.*;
public class CharcterStream{
    public static void main(String[] args){
        try {
            FileWriter fw = new FileWriter("sample.txt");
            String s = "this is the sample string in from the Character Stream";
            fw.write(s);
            fw.close();
            FileReader fr = new FileReader("sample.txt");
            int data;
            while((data = fr.read())!=-1){
                System.out.print((char)data);
            }
            fr.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}