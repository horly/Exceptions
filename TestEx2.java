
public class TestEx2 extends Exception 
{
	public TestEx2()
	{
		System.out.println("le solde r�sultat est inf�rieur au decouvert max");
	}
	public TestEx2(String s)
	{
		super(s);
	}

}
