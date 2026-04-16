// interface Inter {
//     int sum(int a, int b); 
// }

// class FunInterface {
//     public static void main(String[] args){
//         Inter obj = (a, b) -> a + b;
//         int result = obj.sum(5, 10);
//         System.out.println("The sum is: " + result);
//     }
// }

class FunInterface {
    public static void main(String[] args){
        int a = 2;
        switch(a){
            case 1,2,3:
                System.out.println("Value is 1");
                break;
            case 5,6:
                System.out.println("Value is 5");
                break;
            default:
                System.out.println("Value is not 1 or 5");
        }
    }
}
