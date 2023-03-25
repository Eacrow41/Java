public class DemoTres{
  public static void main(String[] args){
   String a = args[0], b = args[1], c = args[2];
   
   String msg = setMessage(a, b, c);
   System.out.println(msg);
 }
 public static String setMessage(String txt1, String txt2, String txt3){
   StringBuffer message = new StringBuffer();
   
   if(!txt1.isEmpty()){
	message.append(txt1);
  }
   if(!txt2.isEmpty()){
	message.append(txt2);
  }
   if(!txt3.isEmpty()){
	message.append(txt3);
  }
  return message.toString();
 }

}