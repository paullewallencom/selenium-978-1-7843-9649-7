package MyFirstPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIOStreamExample{  
   public static void main(String args[]){  
	try{  
  	   //FileOutputStream create file and connect write mode
	   FileOutputStream fOut = new FileOutputStream("c:\\abc.txt");  
	   String str = "Working with Java FileInputStream and FileOutputStream class";  

	   //Contents of bytes and write to a file
	   byte stringBytes[]=str.getBytes();  
	   fOut.write(stringBytes);  

  	   //Close the file
	   fOut.close();  
	   System.out.println("Written contents to file...");  

	   //FileinputStraem connect read mode
	   FileInputStream fIn = new FileInputStream("c:\\abc.txt");  
	   int i;  
	   while((i = fIn.read())!= -1){
		System.out.print((char)i);  
	   }
		
	   //Close the file
	   fIn.close();  
	   System.out.println();
	   System.out.println("Read contents from file...");  
	}catch(Exception e){
	   System.out.println(e);
	}  
   }  
}
