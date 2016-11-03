class Forloop3
{
public static void main(String args[])
{
int i,j=5,k,x;
for(i=1;i<=5;i++)
{
for(k=1;k<=j;k++)
{
System.out.print(" ");
}
for(x=1;x<=i;x++)
{
System.out.print("*");
System.out.print(" ");
}
System.out.println();
j=j-1;
}
}
}

