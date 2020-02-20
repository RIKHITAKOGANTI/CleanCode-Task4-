package Task4.Task;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Construction 
{

	public static void main(String args[])  throws IOException
    {
    	
    	BufferedWriter out=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out),"ASCII"),512);
    	Scanner sc=new Scanner(System.in);
    	out.write("Construction cost estimation:- ");
    	out.flush();
		out.write("Available Materials:- ");
		out.flush();
		out.write("1. Standard materials");
		out.flush();
		out.write("2. Above standard materials");
		out.flush();
		out.write("3.High standard materials");
		out.flush();
		out.write("4. High standard materials and fully automated home");
		out.flush();
		out.write("Choose(1-4): ");
		out.flush();
		try {
			int choice = sc.nextInt();
			double area, cost;
			switch(choice) {
				case 1:
					out.write("Enter the area of house: ");
					out.flush();
					area = sc.nextDouble();
					cost = (1200 * area);
					out.write("Cost = " +cost+" Rupees");
					out.flush();
					break;
				case 2:
					out.write("Enter the area: ");
					out.flush();
					area = sc.nextDouble();
					cost = (1500 * area);
					out.write("The total cost to build the house = " +cost+" Rupees");
					out.flush();
					break;
				case 3:
					out.write("Enter the area: ");
					out.flush();
					area = sc.nextDouble();
					cost = (1800 * area);
					out.write("The total cost to build the house = " +cost+ " Rupees");
					out.flush();
					break;
				case 4:
					out.write("Enter the area: ");
					out.flush();
					area = sc.nextDouble();
					cost = (2500 * area);
					out.write("The total cost to build the house = " +cost+ " Rupees");
					out.flush();
					break;
				default:
					out.write("Please enter a valid input!!! ");
					out.flush();
				}
		} catch (Exception e) {
			out.write("Please enter a valid input!");
			
		}
		
    }
	
}
