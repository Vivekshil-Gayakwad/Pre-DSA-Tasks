package Collection;//1.	Store student names with marks.
//2.	Count the frequency of characters in a string.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> student = new HashMap<>();
        for(int i = 1; i <= 5; i++){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the name: ");
            String name = input.next();
            System.out.print("Enter the marks: ");
            int marks = input.nextInt();
            student.put(name,marks);
        }
        for(Map.Entry<String,Integer> st: student.entrySet()){
            System.out.println(st.getKey()+" : "+st.getValue());
        }

    }
}
