//imprime los valores enteros que encuentre en la secuencia
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            int number = scan.nextInt();
            System.out.println(number);
        }
        scan.close();
                
    }
}

//Se utiliza un limite en la cantidad de caracteres que se pueden imprimir se espera un valor string
//y un valor entero
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");

            
            while (sc.hasNext()) {
            String str = sc.next();
            int num = sc.nextInt();
            System.out.printf("%-15s%03d%n", str, num);
            }
            
            System.out.println("================================");

    }
}
