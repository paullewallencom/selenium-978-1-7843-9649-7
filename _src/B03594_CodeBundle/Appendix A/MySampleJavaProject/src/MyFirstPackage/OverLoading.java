package MyFirstPackage;

class SampleClass10 {
	void sampleMethod(){
		System.out.println("excecuting sample meathod");
	}
	void sampleMethod(float b){
		System.out.println("excecuting sample meathod" + b);
	}
}

class SampleClass20 extends SampleClass10 {
	void sampleMethod1(){
		System.out.println("excecuting sample method 2");
	}
	void sampleMethod1(int a){
		System.out.println("excecuting sample method 2" + a);
	}

}

public  class OverLoading {


	public static void main(String[] args) {
		SampleClass20 methodcall = new SampleClass20();
		methodcall.sampleMethod1();
		methodcall.sampleMethod();
		methodcall.sampleMethod1(12);
		methodcall.sampleMethod(1);
	}
}
