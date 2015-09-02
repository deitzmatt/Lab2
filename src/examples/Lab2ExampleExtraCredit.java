package examples;
import java.util.Random;

public class Lab2ExampleExtraCredit 
{

	public static void main(String[] args) 
	{
		Random random = new Random();
		int[] totalCount = new int[10000];
		
		for (int l =0;l<10000;l++)
		{
			int counter = 0;
			
			for(int n=0;n<10000;n++)
			{
				String threeMer = "";
				for(int m = 0; m<3;m++)
				{
					float f = random.nextFloat();
					if (f<=.12)
					{
						threeMer +="A";
					}
					else if (f <= .50)
					{
						threeMer += "C";
					}
					else if (f <= .89)
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
			}
			totalCount[l]=counter;
	/*
	 * Theoretical value should be around 17-18 Times
	 * P1*P2*P3*10000
	 * PN = probability of N being an A = .12
	 * = .12*.12*.12*10000 = 17.28
	 */
		System.out.println("Run #"+(l+1)+" has "+totalCount[l]+" times AAA occured");	
		}
	}

}
