
import java.util.Scanner;

public class Practice {

    public static String x(int a, String b) {
        return a+b;
    }
    
    public static int sum(int a, int b) {
        int Sum = 0;
        for(int i = a; i <= b; i++) {
            Sum = Sum + i;
        }
        return Sum;
    }
    
    public static void main(String[ ] args) {
        String [] studentIds = new String [3];
        studentIds[0] = "Alison";
        studentIds[1] = "Becky";
        studentIds[2] = "Charlie";
        System.out.print(studentIds[0]);
    }
}