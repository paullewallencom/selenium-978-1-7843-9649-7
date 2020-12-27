package MyFirstPackage;

 class SampleClass4 {
	 SampleClass4(){
	 System.out.println("excecuting sample meathod");
}
 }
class SampleClass3 extends SampleClass4 {
		 SampleClass3(){
			 System.out.println("excecuting sample method 2");
		}
	 }

public  class Constructors {
	public static void main(String[] args) {
		new SampleClass3();	
}
 }
