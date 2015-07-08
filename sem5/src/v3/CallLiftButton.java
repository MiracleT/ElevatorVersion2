package v3;

//class representing the button on the floor used to call the lift
public class CallLiftButton extends Buttons{

	void push(int floorNum) {
		System.out.println(".   Button pressed to Call Elevator!");
		e1.getTo(floorNum);								//since button pressed,get the elevator moving to pick up the user

	}

}
