import java.util.*;
import java.io.Console;
public class inputouput
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("input times and name");
		int times = in.nextInt();
		String name = in.next();
		System.out.printf("第%d次输入，name=%s \n",times,name);

		Console cons = System.console();
		String name1 = cons.readLine();
		System.out.printf("name1:%s \n",name1);
	}
}

//建议用Scanner