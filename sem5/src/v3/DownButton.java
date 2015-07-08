package v3;

public class DownButton extends Decorator{

	public DownButton(int i) {
		super(i);
	}

	void push(int floorNum) {
		System.out.println("You pressed \"Down \" button.So floor "+(floorNum-1));   //down means floor just below currentLocation 
		e1.getTo(floorNum-1);	
	}

}