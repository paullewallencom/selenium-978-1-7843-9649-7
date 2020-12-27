package MyFirstPackage;


class encap {
	
	private int salary ;

	public int getI() {
		return salary;
	}

	public void setI(int i) {
		// encap thiExmp = new encap();
		// thiExmp.salary = i * 10;
			
		this.salary = i * 10;
	}
}


public class encapsulation {
	public static void main(String[] args) {
		encap vara = new encap();
		vara.setI(10);
		System.out.println(vara.getI());	
	}
}
