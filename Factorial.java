class Factorial
{
	static int fact =1;
	public static void main (String args[])
	{
		int no=5;
		Factorial ob = new Factorial ();
		ob.CalcFact (no);
		System.out.println ("Factorial of "+ no +" is " + fact);

	}

	void CalcFact(int no)
	{
		if (no>=1)	
		{
			fact=fact*no;
			CalcFact(no-1);
		}
	}
}