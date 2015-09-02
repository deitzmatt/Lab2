package examples;
import java.util.Random;

public class Lab2Example 
{

	public static void main(String[] args) 
	{
		Random random = new Random();
		int counter = 0;
		
		for(int n=0;n<1000;n++)
		{
			String threeMer = "";
			for(int m = 0; m<3;m++)
			{
				switch (random.nextInt(4))
				{
					case 0: threeMer += "A";
					break;
					case 1: threeMer += "C";
					break;
					case 2: threeMer += "G";
					break;
					case 3: threeMer += "T";
					break;					
				}
			}
			if (threeMer.equals("AAA"))
			{
				counter++;
			}
			System.out.println(threeMer);
			
		}
		System.out.println("The three-mer AAA appears "+counter+" times.");
	/*
	 * Theretical value should be around 15-16 Times
	 * P1*P2*P3*1000
	 * PN = probability of N being an A = .25
	 * = .25*.25*.25*1000 = 15.625
	 */
	
	
	}

}
