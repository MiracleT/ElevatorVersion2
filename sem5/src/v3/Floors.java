package v3;

public class Floors {
	
	Elevator e=new Elevator();
	int floorNum;
	Door floorDoor=new Door();
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
