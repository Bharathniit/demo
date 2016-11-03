import java.util.*;
class Oddeven1
{
int num;
int i=0,odd=0,even=0;
void oddeven()
{
while(i<10)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
num=sc.nextInt();
if(num%2==0)
{
even=even+1;
}
else
{
odd=odd+1;
}
i++;
}
}
void displayInfo()
{
System.out.println("no of even is" +even);
System.out.println("no of odd is" +odd);
}
public static void main(String args[])
{
Oddeven1 s1=new Oddeven1();
s1.oddeven();
s1.displayInfo();
}
}




