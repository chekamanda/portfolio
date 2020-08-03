package pkg;

public class App
{
	public static void displayRect(int n, int m)
	{
		if (n == 0 || n == m - 1)
		{
			System.out.println("**********");
		}
		else // * 				*
		{
			System.out.println();
			System.out.print("*");
			for (int k = 1; k < 9; k++)
			{
				System.out.print(" "); // for spacing

			}
			System.out.print("*");

			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		for (int x = 0; x < 6; x++)
		{
			displayRect(x, 6);
		}

	}

}
