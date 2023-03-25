public class ifelse{
  public static void main(String args[]){ 
   int biologia = 5;
   int matematicas = 5;
   int quimica = 5;
   int promedio = 0;

   promedio = (biologia + matematicas + quimica) / 3;
   if(promedio >= 6){
	System.out.println("El alumno aprobo con: " + promedio);
   } else {
      System.out.println("El alumno reprobo con: " + promedio);
   }		

   
 }
}