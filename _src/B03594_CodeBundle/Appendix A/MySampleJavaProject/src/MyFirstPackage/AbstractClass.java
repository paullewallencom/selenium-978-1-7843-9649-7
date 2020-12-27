package MyFirstPackage;

abstract  class sample_abs {
	
	abstract void abstr_method ();
	abstract void abstr_method1 ();
	abstract void abstr_method2 ();
	abstract void abstr_method3 ();
	abstract void abstr_method4 ();
	
	void nonabstr (){
	}
}

abstract  class sample_abs1 extends sample_abs {
	
	void abstr_method () {
	}

	void abstr_method1 () {
	}

	void abstr_method2 () {
	}

	void abstr_method3 () {	  
	}
}

  public class AbstractClass extends sample_abs1 {
	  
		void abstr_method1 () {	  
		}
	 
	   void abstr_method4 () {		  
	  }  
	   
	public static void main(String[] args) {
		System.out.println("Abstract class demo");
	}
}
