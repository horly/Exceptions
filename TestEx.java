
public class TestEx extends Exception
{  
	public TestEx()
	{
		System.out.println("le decouvert max atteint");
	}
	public TestEx(String s)
	{
		super(s);
	}
}
