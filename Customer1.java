import java.util.*;
public class Customer1
{
	public static void main(String []args)
	{
		int n = 10,b=0;
		for (int i = 1; i<= n; i++)
        {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the Customer's Name: ");
			String name = sc.next();
			System.out.print(name+ "'s rating for Android One Mobile is ");
			int a = sc.nextInt();
			b= b+a;
            

        }
		
		System.out.print("Average Mobile rating from 10 Customer is "+ b/10);
	}

}