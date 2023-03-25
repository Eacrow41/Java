public class Demo{
  public static void main(String[] args){
   String string = new String();
   string = "hola";
   string = setMessage(string);
   System.out.println(string);  
 }
 
 private static String setMessage(String string){
   string = string + " mundo";
   return string;
 }
}