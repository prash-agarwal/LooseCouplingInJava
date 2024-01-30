
public class Computer {

	public void keyboardUsed(Keyboard k)  
	{  
	System.out.println("The computer is using " + k.display());  
	}  	
}

//Architecture in Tight Coupling.	

	//						   ------->DellKeyboard	
	//						  |
	//Coupling ------>Computer
	//						  |	
	//						   ------->LenovoKeyboard



//Architecture in Loose Coupling with the help of Abstraction.

	//										  ------->DellKeyboard	
	//										 |
	//Coupling ------>Computer------>Keyboard
	//							 (Interface) |	
	//										  ------->LenovoKeyboard

