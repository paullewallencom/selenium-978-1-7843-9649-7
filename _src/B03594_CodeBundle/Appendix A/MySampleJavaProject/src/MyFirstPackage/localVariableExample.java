package MyFirstPackage;

public class localVariableExample {

	public void broAge(){
	      int age = 0;
	      age = age + 7;
	      System.out.println("My younger brother's age is : " + age);
	   }
	   
	   public static void main(String args[]){
		   localVariableExample localVariableExample = new localVariableExample();
		   localVariableExample.broAge();
	   }
}
