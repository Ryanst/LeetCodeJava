import java.util.*;

public class SwitchAndBreak
{
	public static void main(String args[])
	{
		read_data:
		{
			while(true)
			{
				System.out.println("input a number:");
				Scanner in = new Scanner(System.in);
				int n = in.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("1");
						break;
					case 2:
						System.out.println("1");
						break;
					default:
						break read_data;//只有这个可以跳出循环
				}
			}
		}
	}
}