class Arrayoutofbound
{
public static void main(String args[])
{
int num[]=new int[5];
num[0]= 55;
num[1]= 65;
num[2]= 80;
num[3]= 85;
num[4]= 95;
try
{
for(int i=0;i<=5;i++)
{
System.out.println(num[i]);
}
}
 catch (ArrayIndexOutOfBoundsException e) 
{
System.out.println("this is exception handle");
}
finally
{
System.out.println(num[1]);
}
}
}
