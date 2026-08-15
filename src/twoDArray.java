// 1.	Add two matrices.
//2.	Find the transpose of a matrix.

import java.util.Scanner;

public class twoDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the row1 size: ");
        int r1 = input.nextInt();
        System.out.print("Enter the column1 size: ");
        int c1 = input.nextInt();
        System.out.print("Enter the row2 size: ");
        int r2 = input.nextInt();
        System.out.print("Enter the column2 size: ");
        int c2 = input.nextInt();

        int[][] array1 = twoDArrayInput(r1,c1);
        int[][] array2 = twoDArrayInput(r2,c2);
        System.out.println("Array1:");
        printTwoDArray(array1);
        System.out.println("Array2:");
        printTwoDArray(array2);

        int[][] addTwoArray = addTwoArray(array1,array2);
        System.out.println("Added Array:");
        printTwoDArray(addTwoArray);

        int[][] transposeArray = transposeArray(array1);
        System.out.println("Transpose Array:");
        printTwoDArray(transposeArray);
    }

    public static int[][] twoDArrayInput(int row, int column){
        int[][] array = new int[row][column];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the element: ");
                int el = input.nextInt();
                array[i][j] = el;
            }
        }
        return array;
    }

    public static void printTwoDArray(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                System.out.printf("%d\t",array[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] addTwoArray(int[][] array1,int[][]array2){
        int[][] addTwoArray = new int[array1.length][array1[0].length];
        if((array1.length == array2.length) && (array1[0].length == array2[0].length)){
            for(int i = 0; i < array1.length; i++){
                for(int j = 0; j < array1[0].length; j++){
                    addTwoArray[i][j] = array1[i][j] + array2[i][j];
                }
            }

        }
        else{
            System.out.println("Operation can not be done !");
        }
        return addTwoArray;
    }

    public static int[][] transposeArray(int[][] array){
        int[][] transposeArray = new int[array[0].length][array.length];
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                transposeArray[i][j] = array[j][i];
            }
        }
        return transposeArray;
    }
}
