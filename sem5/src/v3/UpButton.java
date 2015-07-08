package v3;

public class UpButton extends Decorator{


	public UpButton(int i) {
		super(i);
	}

	@Override
	void push(int floorNum) {
		// TODO Auto-generated method stub
		System.out.println("You pressed \"up button \".So floor "+(floorNum+1));
		e1.getTo(floorNum+1);	
	}

}
