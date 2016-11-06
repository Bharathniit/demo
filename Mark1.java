import java.util.Scanner;

class Mark1
{
    public static void main(String args[])
    {
Scanner sc = new Scanner(System.in);

System.out.println("student name");
String s1=sc.next();
Scanner scan = new Scanner(System.in);
        int mark[] = new int[5];
        int i;
        float sum=0;
        float avg, perc;
        
        System.out.print("Enter marks Obtained in 5 Subjects : ");
        for(i=0; i<5; i++)
        {
            mark[i] = scan.nextInt();
            sum = sum + mark[i];
        }
        			
        avg = sum/5;
        perc = (sum/500) * 100;


		
        System.out.print("Average Marks = " +avg);
		
        System.out.print("\nPercentage = " +perc+ "%");
if(avg>=85)
{
System.out.print("A grade");
}
else if(avg<=84 && avg>=75)
{
System.out.print("B grade");
}
else if(avg<=74 && avg>=65)
{
System.out.print("C grade");
}
if(avg<=64 && avg>=50)
{
System.out.print("D grade");
}
if(avg<50)
{
System.out.print("Fail");
}
    }
}