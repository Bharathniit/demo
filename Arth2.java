import java.util.*;
class Arth2
{
int a=10,c;
int b=0;
void sum()
{
try
{
c=a/b;
}
catch(ArithmeticException e)
{
System.out.println("This is my exception handling");
}
}
void display()
{
System.out.println(c);
}
public static void main(String args[])
{
Arth2 obj=new Arth2();
obj.sum();
obj.display();
}
}