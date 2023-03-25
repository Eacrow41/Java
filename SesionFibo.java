public class SesionFibo{
  public static void main(String args[]){
   
  int i= 0, a=0, b=1, c=0;
  System.out.println("Serie con For: ");
  for( i = 0; i < 10; i++){
   if(i < 9 ){
     System.out.print(a + ",");
   } else { 
     System.out.print(a);
   }
   
   c = a + b;
   a = b;
   b = c;
  }
  i=0;
  a=0;
  b=1;
  c=0;
  System.out.println("");
  System.out.println("Serie con While: ");
  while( i < 10){
	   if(i < 9 ){
           System.out.print(a + ",");
           c = a + b;
   	     a = b;
           b = c;
         } else { 
           System.out.print(a);
         }
	i++;
   }
   System.out.println("");
   System.out.println("Serie con Do While: ");
   i=0;
   a=0;
   b=1;
   c=0;
   do {
       if(i < 9){
          System.out.print(a + ",");
	    c = a + b;
   	    a = b;
          b = c;
   	 } else {
   	   System.out.print(a);
	 }
       i++;
    } while(i < 10);
 }
}