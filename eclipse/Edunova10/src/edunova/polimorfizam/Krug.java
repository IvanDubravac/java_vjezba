package edunova.polimorfizam;

public class Krug extends Oblik {
	private double polumjer;

	public Krug(int polumjer) {
		super();
		this.polumjer = polumjer;
	}

	public Krug() {
		super();
	}

	public double getPolumjer() {
		return polumjer;
	}

	public void setPolumjer(int polumjer) {
		this.polumjer = polumjer;
	}

	@Override
	public double povrsina() {

		return polumjer*polumjer*Math.PI;
	}

}
