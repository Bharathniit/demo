import java.util.*;
class Palindrome5
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter a String");
String s1= sc.next();
StringBuffer s2=new StringBuffer(s1);
s2.reverse();
if(s1.equals(s2.toString()))
{
System.out.println("Palindrome");
}
else
{
System.out.println("not a palindrome");
}
}
}