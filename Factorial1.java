import java.util.*;
class Factorial1
{  
 public static void main(String args[])
{  
  int i,fact=1;  
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number");
  int num=sc.nextInt();    
  for(i=1;i<=num;i++)
{    
      fact=fact*i;    
  }    
  System.out.print(fact);    
 }  
}