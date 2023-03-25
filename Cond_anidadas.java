public class Cond_anidadas{
  public static void main(String args[]){
   int operacion = 3;
   int num_uno = 8;
   int num_dos = 4;
   int resultado = 0;

   if(operacion == 1){
        resultado = num_uno + num_dos;
 	  System.out.println("El resultado de la operacion " + operacion + " es: " + resultado);
	}
   else if(operacion == 2){
        resultado = num_uno - num_dos;
 	  System.out.println("El resultado de la operacion " + operacion + " es: " + resultado);
	}
   else if(operacion == 3){
        resultado = num_uno * num_dos;
 	  System.out.println("El resultado de la operacion " + operacion + " es: " + resultado);
	}
   else if(operacion == 4){
        resultado = num_uno / num_dos;
 	  System.out.println("El resultado de la operacion " + operacion + " es: " + resultado);
	}
   else{
	  System.out.println("La " + operacion + " que elegiste no existe. ");
  }
 }
}