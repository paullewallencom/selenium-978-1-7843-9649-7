package MyFirstPackage;

 class SampleClass100 {
	 void sampleMethod(){
	 System.out.println("excecuting sample meathod");
}
	 void sampleMethod(float b){
		 System.out.println("excecuting sample meathod" + b);
	}
 }
	 class SampleClass200 extends SampleClass100 {
		 void sampleMethod(){
		 System.out.println("overridding is done");
	}
		 void sampleMethod1(int a){
			 System.out.println("excecuting sample method 2" + a);
		}
	 }

public  class OverRidding {
	
public static void main(String[] args) {
		SampleClass200 methodcall = new SampleClass200();
		
		 methodcall.sampleMethod();
}
 }
