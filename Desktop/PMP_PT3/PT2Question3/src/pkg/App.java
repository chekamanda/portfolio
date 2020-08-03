package pkg;

public class App
{
	public static void displayLiters(int quartz) {
		
		double l=quartz/1.05669;
		System.out.println(quartz+ " quarts = "+l+" liters");
		l=0;
	}

	public static void main(String[] args)
	{
		for(int i=100;i>=10;i=i-10) {
		displayLiters(i);
		}
	}

}
