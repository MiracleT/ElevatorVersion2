package v3;

//implementation of design pattern 2:State pattern for open close states of door
public abstract class DoorState {

	protected String currentState;
	public abstract void SwitchState(DoorContext context,String type);
}
