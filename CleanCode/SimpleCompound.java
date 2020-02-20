package Task4.Task;

import java.io.*;
import java.util.*;
import java.lang.Math;

public class SimpleCompound 
{
	 public static void main(String args[])  throws IOException
	    {
	    	
	BufferedWriter out=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out),"ASCII"),512);
	Scanner s=new Scanner(System.in); 
	out.write("Enter principal amt,time,rate of intrest");
	out.flush();
	int p=s.nextInt();
	int t=s.nextInt();
	int r=s.nextInt();
	
	float si;
	si=(p*t*r)/100;
	Double ci=(p* Math.pow(1 + (r / 100), t));
	String SimpInt=Float.toString(si);
	String CompInt=Double.toString(ci);
	out.write("Simple Intrest:"+SimpInt+'\n');
	out.flush();
	out.write("Compound Intrest:"+CompInt);
	out.flush();
	    }
}
