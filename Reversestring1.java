import java.util.*;
class Reversestring1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string");
String s1=sc.next();	
char ch[]=s1.toCharArray();
for(int i=s1.length()-1;i>=0;i--)
{
System.out.print(ch[i]);
}
}
}
