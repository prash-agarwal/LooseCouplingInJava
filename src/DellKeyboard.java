
public class DellKeyboard implements Keyboard{

	@Override
	public String display() {
		
		return "the Dell keyboard";
	}

//	@Override
//	public String input() {
//		// TODO Auto-generated method stub
//		return "the HP mouse";
//	}
}
//we cannot create an object of an abstract class in Java. 
//Abstract classes are meant to be extended by concrete (non-abstract) subclasses, 
//and they may contain abstract methods that need to be implemented by the subclasses.