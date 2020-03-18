public class TestStach extends ImpAbstract
{
	@Override
	public void printMain()
	{
		System.out.println("This is an important abstract function");

	}
	public static void main(String args[])
	{
		System.out.println("Hello from main")	;
		TestStach t = new TestStach();
		t.printMain();
	}
	
}

