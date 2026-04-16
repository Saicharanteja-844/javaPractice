
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStream{
    public static void main(String[] args){
        try {
            FileOutputStream fos = new FileOutputStream("Sample.txt");
            String s = "This is code for ByteStream";
            fos.write(s.getBytes());
            fos.close();
            FileInputStream fis  = new FileInputStream("sample.txt");
            int data;
            while((data = fis.read()) != -1){
                System.out.print((char)data);
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}