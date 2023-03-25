public class DemoDos{
  public static void main(String[] args){
   StringBuffer stringBuffer = new StringBuffer();
   stringBuffer.append("hola");
   setMessage(stringBuffer);
   System.out.println(stringBuffer);  
 }
 
 private static void setMessage(StringBuffer stringBuffer){
   stringBuffer.append(" mundo");
 }
}