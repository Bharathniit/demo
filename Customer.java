import java.util.*;

public class Customer
{
	public static void main(String []args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Employee Name: ");
		String name = obj.next();
		System.out.println("Number of Products bought by " +name);
		int a = obj.nextInt();
		
		int n = a;
		int salary = 10000;	
		float b=0;
		for (int i = 1; i<= n; i++)
        {
			Scanner sc=new Scanner(System.in);
			System.out.print("Product Name " +i+ " is: ");
			String name1 = sc.next();
			System.out.print("The Product " +i+ " Cost is Rs: ");
			int c= sc.nextInt();
			b= b+c;
	}
		System.out.println("The amount spent by " +name+ " is Rs." + b);
		System.out.println("The Percentage of expense by "+name+ " is " + ((b/salary)*100));
}
}