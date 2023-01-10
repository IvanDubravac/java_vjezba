package edunova05;

public class ForEachPetlja {

	public static void main(String[] args) {

		int niz[] = { 1, 4, 2, 4, 5 };
//		
//		for(int i=0; i<niz.length; i++) {
//			System.out.println(niz[i]);
//		}
//		
//		
//		for(int v: niz) {
//			System.out.println(v);

		for(int i=niz.length-1; i>=0; i--) {
			System.out.println(niz[i]);
		}
		
		
	}

}
