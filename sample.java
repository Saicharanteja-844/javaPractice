
import java.util.Scanner;


// public class sample {
//     public static void main(String[] args) {
//         int  a = 5,b = 10, c = 15;
//         System.out.println(a++ + ++a);
//         System.out.println(a);
//         int max = (a>b)?(a>c)?a:c:(b>c)?b:c;
//         System.out.println(max);
//     }
// } 

class sample{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char c=sc.next().charAt(0);
        if(c=='/'&&b==0)
        {
            System.out.println("Error");
            System.exit(0);
        }
        int ans=switch(c)
        {
            case '+'->a+b;
            case'-'->a-b;
            case'*'->a*b;
            case'/'->a/b;
            default->0;
        };
        System.out.println("Answer:"+ans);
    }}