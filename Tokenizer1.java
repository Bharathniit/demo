import java.util.StringTokenizer;  
public class Tokenizer1
{  
 public static void main(String args[])
{  
   StringTokenizer st = new StringTokenizer("Today is good day"," ");  
System.out.println("Total tokens : " + st.countTokens());  
     while (st.hasMoreTokens())
 {  
         System.out.println(st.nextToken());  
     
 
     
  }  
}  
}