package edunova;

public class Start {
 private Mjesto m1;
 private Mjesto m2;
	public Start() {
		nacinRadaEquals();
		nacinRadaToString();
	}

	private void nacinRadaToString() {
		
		
	}

	private void nacinRadaEquals() {
		Mjesto m1 = new Mjesto(1, "Osijek");
		Mjesto m2 = new Mjesto(1, "Osijek");
		System.out.println(m1.equals(m2));
		System.out.println(m1);
	}

	public static void main(String[] args) {
		new Start();
	}

}
