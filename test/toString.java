public class toString
{
	public static void main(String[] args)
	{
		int i = 1;
		String str = i + " " + i;
		System.out.println(str);

		Test t = new Test();
	}
}

class Test
{
	public Test()
	{
		// System.out.println(getName());
		System.out.println(getClass().getName());
	}
}