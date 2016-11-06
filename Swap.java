class Swap
{
	public static void main (String[] args)
	{
	int x=20;
	int y=10;
	System.out.println("Before Swapping: "+x+ " " +y);
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("After Swapping: "+x+ " " +y);
	}
}