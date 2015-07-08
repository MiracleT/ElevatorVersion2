package v3;

public class DoorContext {

	private DoorState doorState;

	public DoorContext(DoorState doorState) {
		this.doorState = doorState;
	}

	public DoorState getDoorState() {
		return doorState;
	}

	public void setDoorState(DoorState doorState) {
		this.doorState = doorState;
	}

	public void Switch(String type){
		doorState.SwitchState(this, type);
	}

}
