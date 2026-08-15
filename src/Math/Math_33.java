// 43.	Star patterns

package Math;

import java.util.Scanner;

class pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        hallowSquare(num);
        System.out.println();
        diamond(num);
    }

    public static void hallowSquare(int num){
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if(i == 1 || i == num){
                    System.out.print("*  ");
                }
                else{
                    if(j == 1 || j == num){
                        System.out.print("*  ");
                    }
                    else{
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int num){
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1; i <= num; i++){
            for (int j = i; j >= 1; j--) {
                System.out.print(" ");
            }
            for(int j = num - i; j >= 1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
