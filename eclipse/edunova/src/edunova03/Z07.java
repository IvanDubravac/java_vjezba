package edunova03;

public class Z07 {
	
	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
	
		if(i%2==0 && j%2==0 ) {
			System.out.println(i+j);
		}else {
			System.out.println(i-j);
		}
	
	}

}
