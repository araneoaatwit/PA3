package edu.wit.cs.comp1050;

/*Austin Araneo
 * Pa 3B
 * Description: determines if the numbers are a linear Equation 
 * */
public class LinearEquation {
	double a,b,c,d,e,f,x,y;
	
	/* Initialize the linear equation of form:
	 * ax + by = e
	 * cx + dy = f
	 * 
	 * @param a parameter a
	 * @param b parameter b
	 * @param c parameter c
	 * @param d parameter d
	 * @param e parameter e
	 * @param f parameter f
	 */
	public LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	
	/* Convenience constructor to initialize the linear equation via array THIS CONSTRUCTOR CALLS THE CONSTRUCTOR ABOVE USING THE ARRAY CONTENTS
	 * 
	 * @param p parameter array, assumed to be length 6 (a-f, in order)
	 */
	public LinearEquation(double[] p) {
		this(p[0],p[1],p[2],p[3],p[4],p[5]);
	}
	
	
	//* Returns parameter a
	public double getA() {
		return a;
	}
	
	//* Returns parameter b
	public double getB() {
		return b;
	}
	
	//* Returns parameter c
	public double getC() {
		return c;
	}
	
	//* Returns parameter d
	public double getD() {
		return d;
	}
	
	//* Returns parameter e
	public double getE() {
		return e;
	}
	
	//* Returns parameter f
	public double getF() {
		return f;
	}
	
	/* Returns true if the parameterized equation is solvable (i.e. denominator ad-bc is not 0)
	 * 
	 * @return true if solvable, false otherwise
	 */
	public boolean isSolvable() {
		if((a*d)-(b*c)!= 0)
			return true;
		return false;
	}
	
	/* Returns solution for x if solvable, null otherwise
	 * 
	 * @return x if solvable, null otherwise
	 */
	public Double getX() {
		if(isSolvable())
			return ((e*d)-(b*f))/((a*d)-(b*c));
		return null;
	}
	
	/* Returns solution for y if solvable, null otherwise
	 * 
	 * @return y if solvable, null otherwise
	 */
	public Double getY() {
		if(isSolvable())
			return ((a*f)-(e*c))/((a*d)-(b*c));
		return null;
	}
}