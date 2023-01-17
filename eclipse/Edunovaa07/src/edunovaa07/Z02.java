package edunovaa07;

public class Z02 {
	public static void main(String[] args) {
		String ime1=Pomocno.obavezanUnosStringa("Unesite svoje ime");
		String ime2=Pomocno.obavezanUnosStringa("Unesite ime svoje simpatije");
		
		int slucajniBroj= Pomocno.slucajniBrojURasponu(10, 90);
		
		System.out.println(ime1 + " i " +ime2+ " se vole "+ slucajniBroj +"%.");
		
	}

}
