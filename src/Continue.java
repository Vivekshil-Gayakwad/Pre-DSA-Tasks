//1.	Print only odd numbers from 1 to 100.
//2.	Skip multiples of 3 while printing numbers.

public class Continue {
    public static void main(String[] args) {
        int i = 1;
        while(i<=100){
            if(i % 2 == 0){
                i++;
                continue;

            }
            System.out.println(i);
            i++;
        }
    }
}
