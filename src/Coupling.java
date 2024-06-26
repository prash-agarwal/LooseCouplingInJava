public class Coupling {

	public static void main(String[] args) {
	
		Keyboard kb=new DellKeyboard();  //Assigning the reference variable of Interface to 
		//the class which is implementing it here is type of Dynamic Binding.
		//When type of the object is determined at run-time, it is known as dynamic binding.
		//Dynamic binding helps us to make the classes Loosely Coupled.
		//if a class is implementing interface and it is not implementing all of it's methods
		//and it is abstract
		//if we create object of it, then it will give compile error.
		
		Computer com=new Computer();
		com.keyboardUsed(kb);
		
		//we can create object of LenovoKeyboard and DellKeyboard individually as given below
		//instead of using interface reference variable.
		
		// creating an object of the class LenovoKeyboard  
		//LenovoKeyboard lk = new LenovoKeyboard();  
		  //com.keyboardUsed(lk);  
		  
		// creating an object of the class DellKeyboard  
		//DellKeyboard dk = new DellKeyboard();  
		 //com.keyboardUsed(dk);  
		
			
	}
	//Another Architecture of the above class Using Constructor
	//Constructor makes it purely loosely coupled.
	
	//Computer com=new Computer(new DellKeyboard());
	//com.keyboardUsed();
	
}
