class Reversenum
{
public static void main(String args[])
{
int sum=0,a=1934;
while(a>0)
{
sum=(sum*10)+(a%10);
a=a/10;
}
System.out.println(sum);
}
}
