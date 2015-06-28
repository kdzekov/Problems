
public class Problem5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] numbers = new String[9];
		numbers[0] = "1";
		numbers[1] = "2";
		numbers[2] = "3";
		numbers[3] = "4";
		numbers[4] = "5";
		numbers[5] = "6";
		numbers[6] = "7";
		numbers[7] = "8";
		numbers[8] = "9";
		
		String operators =  "";
		String expression = "";
		char[] op = null;
		int sum =0;
		
		
		/*String dd="4+5-1+100";
		sum = parse_expression(dd);
		System.out.println(sum);*/
		
		
		for (int i1 = 1; i1 <=3; i1++)
		{
			for (int i2 = 1; i2 <=3; i2++)
			{
				for (int i3 = 1; i3 <=3; i3++)
				{
					for (int i4 = 1; i4 <=3; i4++)
					{
						for (int i5 = 1; i5 <=3; i5++)
						{
							for (int i6 = 1; i6 <=3; i6++)
							{
								for (int i7 = 1; i7 <=3; i7++)
								{
									for (int i8 = 1; i8 <=3; i8++)
									{
										operators = return_sign(i1)+return_sign(i2)+return_sign(i3)+return_sign(i4)+return_sign(i5)+return_sign(i6)+return_sign(i7)+return_sign(i8);
										op = operators.toCharArray();
										
										expression = merge_strings(numbers, op);
										sum = parse_expression(expression);
										if (sum==100)
										{
											System.out.println(expression);
										}
										
										//System.out.println(expression);
										
									}
									//break;
								}
								//break;
							}
							//break;
						}
						//break;
					}
					//break;
				}
				//break;
			}
			//break;
		}

	}
	
	private static String return_sign(int s)
	{
		if (s==1)
			return "+";
		else if (s==2)
			return "-";
		else return "#";
	}
	
	private static String merge_strings(String[] numbers, char[] operators)
	{
		int explen = numbers.length + operators.length; 
		String expression = "";
		
		int ncount = 0;
		int ocount = 0;
		
		for (int i =1; i<=explen; i++)
		{
			if ((i%2)==1)
			{
				expression += numbers[ncount];
				ncount++;
			}
			else
			{
				if(operators[ocount]!='#')
				{
					expression += operators[ocount];
				}
				ocount++;
			}
		}
		
		return expression;
	}
	
	private static int parse_expression(String expression)
	{
		String[] nm = expression.split("[+-]");		
		String[] ops = expression.split("[1-9]+");
		int sum = Integer.parseInt(nm[0]);
				
		for (int j=1;j<ops.length;j++)
		{
			if (ops[j].equals("+"))
			{
				sum = sum + Integer.parseInt(nm[j]);
			}
			else if(ops[j].equals("-"))
			{
				sum = sum - Integer.parseInt(nm[j]);
			}
		}
		return sum;
	}

}
