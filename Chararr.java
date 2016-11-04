import java.util.*;
class Chararr
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string");
String s1=sc.next();	
char ch[]=s1.toCharArray();
for(int i=0;i<ch.length;i++)
{
System.out.println(ch[i]);
}
}
}
