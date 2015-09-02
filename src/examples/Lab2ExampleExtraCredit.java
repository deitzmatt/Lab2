package examples;
import java.util.Random;

public class Lab2ExampleExtraCredit 
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
				float f = random.nextFloat();
				if (f<.12)
				{
					threeMer +="A";
				}
				else if (f < .50)
				{
					threeMer += "C";
				}
				else if (f < .89)
				{
					threeMer += "G";
				}
				else
				{
					threeMer += "T";
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
	 * PN = probability of N being an A = .12
	 * = .12*.12*.12*1000 = 1.728
	 */
	
	
	}

}
