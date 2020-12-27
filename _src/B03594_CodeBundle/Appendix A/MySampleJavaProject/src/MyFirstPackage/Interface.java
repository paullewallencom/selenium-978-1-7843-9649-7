package MyFirstPackage;

interface  sample_abs2 {
	void abstr_method ();
	void abstr_method1();
}

abstract  class sample_abs3 implements sample_abs2 {
	abstract void abstr_method2 ();

	void abstr_method2A(){
		System.out.println("Abstact class abstr_method2A");
	}
}

class Interface extends sample_abs3 {	//implements is a keyword used to complete the Interface Class
	public void abstr_method () {
		System.out.println("Interface abstr_method implementation");
	}
	
	public void abstr_method1 () {
		System.out.println("Interface abstr_method1 implementation");
	}  
	
	public void abstr_method2 () {
		System.out.println("Abstact class abstr_method2 implementation");
	}
	
	public static void main(String[] args) {
		System.out.println("interface class demo");
		Interface objI = new Interface();
		objI.abstr_method();
		objI.abstr_method1();
		objI.abstr_method2();
		objI.abstr_method2A();
	}
}
