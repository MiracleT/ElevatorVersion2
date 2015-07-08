package v3;

public class Floors {

	Elevator e1 = Elevator.getInstance();	
	int floorNum;
	DoorContext floorDoor = new DoorContext(new Close());
	CallLiftButton pressToCall = new CallLiftButton();

	public Floors(int floorNum) {
		this.floorNum = floorNum;
	}

	public int getFloorNum() {
		return floorNum;
	}

	public void setFloorNum(int floorNum) {
		this.floorNum = floorNum;
	}

}
