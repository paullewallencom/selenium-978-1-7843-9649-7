package MyFirstPackage;

 class SampleClass1 {
	 void sampleMethod(){
	 System.out.println("excecuting sample method");
}
 }
 
class SampleClass2 extends SampleClass1 {
		 void sampleMethod1(){
		 System.out.println("excecuting sample method 2");
	}
	 }

	 
	 
public  class Inheritance {
	public static void main(String[] args) {
		SampleClass2 methodcall = new SampleClass2();
		methodcall.sampleMethod1();
		methodcall.sampleMethod();
}
 }
