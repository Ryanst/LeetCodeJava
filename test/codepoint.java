

public class codepoint
{

	public static void main(String args[])
	{
		String str = "你好hello";
		int n = str.length();
		int cpCount = str.codePointCount(0,str.length());
		System.out.printf("length: %d  cpCount: %d",n,cpCount);
	}
}
