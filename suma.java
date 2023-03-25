import java.util.Scanner;

public class Suma{
 public static void main(String args[]){
  Scanner in = new Scanner(System.in);
  String nombre = ""; 
  int numUno = 0, numDos = 0, resultado = 0;
  
  System.out.println("Cual es tu nombre ");
  nombre = in.nextLine();
  
  System.out.println("Primer valor para la suma: ");
  numUno = in.nextInt();

  System.out.println("Segundo valor para la suma: ");
  numDos = in.nextInt();

  resultado = numUno + numDos; 

  System.out.println("Hola " + nombre + " el resultado de tu suma es: " + resultado);
 }
}