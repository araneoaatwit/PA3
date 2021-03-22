package edu.wit.cs.comp1050;
/*Austin Araneo
 * Pa 3c
 * Description: calculates distance between two points 
 * Input:point 1 and point 2  Output: distance between the two points or error if not inputed correctly 
 * */
public class PA3c {
	
	
	// * Error to display if the command-line arguments are invalid
	public static final String ERR_USAGE = "Please supply 2 numbers (x y).";
	
	/* Computes the distance using three methods from the origin to a point supplied via command-line arguments
	 * 
	 * @param args command-line args: x y
	 */
	public static void main(String[] args) {
		Point2D p = new Point2D();
		try{
            try{
            p = new Point2D(Double.parseDouble(args[0]),Double.parseDouble(args[1]));
            }
            catch (IndexOutOfBoundsException ex){
                System.out.println(ERR_USAGE);
                System.exit(0);
            }
        }catch (NumberFormatException ex){
            System.out.println(ERR_USAGE);
            System.exit(0);
        }
		final Point2D o = new Point2D();
		System.out.printf("Point 1: %s%n", o);
		System.out.printf("Point 2: %s%n", p);
		System.out.printf("Static method distance: %.3f%n", Point2D.distance(o, p));
		System.out.printf("Distance from P1: %.3f%n", o.distanceTo(p));
		System.out.printf("Distance from P2: %.3f%n", p.distanceTo(o));
	}
}