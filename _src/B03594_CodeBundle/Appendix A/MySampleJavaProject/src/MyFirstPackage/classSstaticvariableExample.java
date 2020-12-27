package MyFirstPackage;

public class classSstaticvariableExample {

	   // salary  variable is a private static variable
	   private static double salary;

	   // DEPARTMENT is a constant
	   public static final String DEPT = "Engg ";

	   public static void main(String args[]){
	      salary = 100000;
	      System.out.println(DEPT+"average salary:"+salary);
	   }

}
