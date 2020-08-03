package pkg;
import java.util.Scanner;

public class App
{
	public static void main(String[] args)
	{
		Scanner k = new Scanner(System.in);

		System.out.print("Enter first number: ");

		int firstNum = k.nextInt();

		System.out.println();
		System.out.print("Enter second number: ");

		int secondNum = k.nextInt();

		int bigNum=0, smallNum=0;

		if (firstNum < secondNum)
		{
			bigNum = secondNum;
			smallNum = firstNum;
		}
		else if (secondNum < firstNum)
		{
			smallNum = secondNum;
			bigNum = firstNum;
		}
		else {
			smallNum = secondNum;
			bigNum = firstNum;
		}
		
//		System.out.println("b"+bigNum);
//		System.out.println("b"+smallNum);
		
		for (int i = bigNum; i >= smallNum; i--)

		{
			System.out.println(i);

		}

	}

}
