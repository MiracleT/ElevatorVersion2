package v3;

//Parent class

public abstract class Buttons {
	Elevator e1=Elevator.getInstance();
	int buttonVal;	

	abstract void push(int floorNum);

}