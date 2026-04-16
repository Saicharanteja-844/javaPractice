class StringBuilder{
    public static void main(String args[]){
        int n = 67,r;
        int count = 0;
        while(n>0){
            r = n%2;
            n = n/2;
            if(r == 1){
                count++;
            }
            System.out.print(r);
        }
        System.out.println(" "+count);
    }
}