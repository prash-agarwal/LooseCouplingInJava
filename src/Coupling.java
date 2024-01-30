
public class Coupling {

	public static void main(String[] args) {
	
		Keyboard kb=new DellKeyboard();  //Assigning the reference variable of Interface to 
		//the class which is implementing it here is type of Dynamic Binding.
		//When type of the object is determined at run-time, it is known as dynamic binding.
		
		Computer com=new Computer();
		com.keyboardUsed(kb);
		
		//we can create object of LenovoKeyboard and DellKeyboard individually as given below
		//instead of using interface refernce variable.
		
		// creating an object of the class LenovoKeyboard  
		//LenovoKeyboard lk = new LenovoKeyboard();  
		  //com.keyboardUsed(lk);  
		  
		// creating an object of the class DellKeyboard  
		//DellKeyboard dk = new DellKeyboard();  
		 //com.keyboardUsed(dk);  
		
		//question - do we have dynamic binding in interface	
	}
}
