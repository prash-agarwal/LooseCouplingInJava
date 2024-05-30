
public class Computer {
									
	public void keyboardUsed(Keyboard k)  
	{  
	System.out.println("The computer is using " + k.display());  
	}  	
	
	//Another Architecture of the above class Using Constructor
	//Constructor makes it purely loosely coupled.
//	private Keyboard k;
//	
//	public Computer(Keyboard k) {
//		this.k=k;		}
//	
//	public void keyboardUsed()  
//	{  
//	System.out.println("The computer is using " + k.display());  
//	}  	
	
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
