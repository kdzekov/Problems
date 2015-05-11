
public class ExpClass1
{

	public static void PrintSquare(int x)
	{
		int sq;
		sq = x*x;
		System.out.println(sq);
	}
	
	private int Cube(int x)
	{
		return x*x*x;
	}
	
	private static void PrintSqRoot(int x)
	{
		double r;
		
		r = (double)Math.sqrt(x);
		System.out.println(r);
	}
	
	public static void main(String args[])
	{
		int value;
		int result;
		
		PrintSquare(6);
		value = 44;
		PrintSquare(value);
		
		ExpClass1 ec = new ExpClass1();
		result = ec.Cube(value);
		System.out.println(result);
		
		
		System.out.println("Square root estimation from value "+ value+ " is:");
		PrintSqRoot(value);
			
	}
	
}
