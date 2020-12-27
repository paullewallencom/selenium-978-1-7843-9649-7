package MyFirstPackage;

public class ExceptionHandlingExample {  
	
	   public static void main(String args[]){  
		try{ 
		   //code that might throw an exception in try block
		   System.out.println("Try block executing...");
		   int i = 10/0;  
	   	   System.out.println(i);  
		}  
		catch(ArithmeticException e){
		   //handles ArithmeticException
		   System.out.println("Arithmetic Exception catch block executing...");
		   System.out.println(e);
		} 
		catch(NullPointerException e){
		   //handles NullPointerException
		   System.out.println("Null Pointer Exception catch block executing...");
		   System.out.println(e);
		}
		finally{
			System.out.println("finally block is always executed");
		}  
	   }  
	}

