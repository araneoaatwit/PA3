package edu.wit.cs.comp1050;
import java.util.*;
/*Austin Araneo
 * Pa 3b
 * Description:Does linear equation for find x and y when given 6 ints
 * Input:integers,  Outputs x and y after put through linear equation 
 * */
public class PA3b {
	
	//* Error to display if the command-line arguments are invalid
	public static final String ERR_USAGE = "Please supply 6 numbers (a-f).";
	
	// * Error to display if the equation has no solution
	public static final String ERR_NOSLTN = "The equation has no solution.";
	
	// * Number of required parameters (a-f)
	public static final int NUM_PARAMS = 6;
	
	/* Validates command-line arguments and returns parameters if valid
	 * 
	 * @param args command-line arguments
	 * @return if valid an array of parameters, else null
	 */
	public static double[] validateArgs(String[] args) {
		double[] a = new double[6];
		if(args.length == 6) {
			for(int i = 0; i< 6; i++) {
				if ((args[i].matches("[--9]+")))
					a[i] = Double.valueOf(args[i]);
				else
					return null;
			}
			return a;
		}
		return null;
	}
	
	/* Uses command-line arguments to create an instance of the linear equation, and reports the outcome
	 * 
	 * @param args command-line arguments, interpreted as equation parameters
	 */
	public static void main(String[] args) {
		if(validateArgs(args)!= null) {
			LinearEquation a = new LinearEquation(validateArgs(args));
			if (a.isSolvable())
				System.out.printf("Solution: x=%.3f, y=%.3f%n", a.getX(), a.getY());
			else
				System.out.println(ERR_NOSLTN);
		}else
			System.out.println(ERR_USAGE);
	}
}