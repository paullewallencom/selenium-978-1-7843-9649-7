package MyFirstPackage;

class ThisKeyword{
	int id;  
	String name;  

	//Constructor method
	ThisKeyword(int id, String name){
		//constructor variable and instance variable names are same
		this.id = id;  
		this.name = name;  
	} 

	void display(){
		System.out.println(id + " " + name);
	}  

	public static void main(String args[]){  
		ThisKeyword objThis1 = new ThisKeyword(1234,"John");  
		ThisKeyword objThis2 = new ThisKeyword(2456,"Smith");  
		objThis1.display();  
		objThis2.display();  
	}  
} 