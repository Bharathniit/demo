import java.util.*;
class Greatestno
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a num1");
System.out.println("Enter a num2");
System.out.println("Enter a num3");
int s1=sc.nextInt();
int s2=sc.nextInt();	
int s3=sc.nextInt();
if(s1>s2 && s1>s3)
{
System.out.print("S1 is greater");
}
else if(s2>s1 && s2>s3)
{
System.out.print("S2 is greater");
}
else
{
System.out.print("S3 is greater");
}
}
}
