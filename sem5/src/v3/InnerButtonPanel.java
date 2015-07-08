package v3;

public class InnerButtonPanel extends Buttons{


	public InnerButtonPanel(int buttonVal) {
		this.buttonVal = buttonVal;
	}

	public int getButtonVal() {
		return buttonVal;
	}

	public void setButtonVal(int buttonVal) {
		this.buttonVal = buttonVal;
	}

	@Override
	void push(int floorNum) {	
		System.out.println("You pressed button "+floorNum);
		e1.getTo(floorNum);						//ones the button is pressed,take the user to that floor..>get the elevator moving
	}
}
