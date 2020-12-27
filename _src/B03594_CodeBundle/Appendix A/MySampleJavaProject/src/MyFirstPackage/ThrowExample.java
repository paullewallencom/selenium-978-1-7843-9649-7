package MyFirstPackage;

public class ThrowExample {  
	
	   private int calculateDivision(int number1, int number2){
	     if(number2 == 0){
		//throw exception
		throw new ArithmeticException("Division not possible, denominator should be greater than zero.");
	     } else{
		    //calculate division and return result
		    return number1/number2;
	     }
	  }
		
	  public static void main(String args[]){ 
	     try {
		   ThrowExample obj = new ThrowExample();
		   //call calculateDivision method
		   System.out.println(obj.calculateDivision(10, 0));
	     } catch (Exception e) {
		  //if any exception catch and print the message
		  System.out.println(e.getMessage());
	    }
	  }  
	}
