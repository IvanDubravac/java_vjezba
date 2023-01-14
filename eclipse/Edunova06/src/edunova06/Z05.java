package edunova06;

public class Z05 {
	public static String decimalni(double a, double b) {
		double znamenka1,znamenka2;
		znamenka1 = a%1;
		znamenka2 = b%1;
		
		
		
		return (String.format("%.2f", (znamenka1 + znamenka2)));
	}

}
