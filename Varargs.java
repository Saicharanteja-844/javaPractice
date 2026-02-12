//Write a meathod public int max(int... nums) that returns the largest number passed
public class Varargs{
    public int max(int... nums){
        int max = Integer.MIN_VALUE;
        for(int num:nums){
            if(num>max){
                max=num;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Varargs v = new Varargs();
        System.out.println(v.max(6,9,56,89,9,1,2,3,4,5));
        
    }
}
