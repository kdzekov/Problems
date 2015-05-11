
public class FoodCorporation {
	
	public static double Pay(int hours, int min_wage, double q_overtime)
	{
		double pay;
		int overtime_hours;
		
		if (hours>40)
		{
			overtime_hours = hours - 40;
			pay = (double)(40*min_wage + overtime_hours*min_wage*q_overtime);
		}
		else
		{
			pay=(double)(hours*min_wage);
		}
		
		return pay;
	}
	
	public static void main(String[] args)
	{
		int h=43;
		int mw=8;
		double q_t=1.5;
		System.out.println("The overall salary would be: "+Pay(h,mw,q_t));
	}

}
