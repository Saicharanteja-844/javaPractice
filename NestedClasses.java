//import java.util.*;
public class NestedClasses{
    private int a = 10;
    class Inner{
        public void access(){
            System.err.println(a);
        }
    }
}

class Main{
    public static void main(String[] args){
        NestedClasses obj = new NestedClasses();
        Nest.Inner in = obj.new Inner();
        obj.in.access();
    }
}