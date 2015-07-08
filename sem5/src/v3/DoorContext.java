package v3;

public class DoorContext {

	private State doorState;

	public DoorContext(State doorState) {
		this.doorState = doorState;
	}

	public State getDoorState() {
		return doorState;
	}

	public void setDoorState(State doorState) {
		this.doorState = doorState;
		//Switch(type);
		
	}
	
	public void Switch(String type){
	doorState.SwitchState(this, type);
	}

}
