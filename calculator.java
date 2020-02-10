class calculator{
	public void calculate(int m,int n,int c)
	{
		switch(c)
		{	
			case 1:addition(m,n);
			       break;
			case 2:subtraction(m,n);
			       break;
			case 3:multiplication(m,n);
			       break;
			case 4:division(m,n);
			       break;
			default:System.out.println("SPECIFY WITHIN MENTIONED OPTIONS ONLY");
		}
}
	public void addition(int a,int b)
	{
		System.out.println(a+b);
	}
	public void subtraction(int a,int b)
	{
		if(a>b)
		{
			System.out.println(a-b);
		}
		else
		{
			System.out.println(b-a);
		}
	}
	public void multiplication(int a,int b)
	{
		System.out.println(a*b);
	}
	public void division(int a,int b)
	{
		System.out.println(a/b);
	}

}
