package edunova06;

public class Z04 {
	
	public static int zbroji(int[] brojevi) {
	
		int zbroj=0;
		for(int i: brojevi) {
			if(i%2!=0) {
				continue;
			}
			zbroj+=i;
		}
		return zbroj;
	}
	

}
