package v3;

public class Open extends DoorState {

	public Open(){
		currentState="Open";
	}
	
	@Override
	public void SwitchState(DoorContext context,String type) {
		// TODO Auto-generated method stub
		System.out.print("The "+type+ " Door is "+currentState);
		Close c=new Close();
		context.setDoorState(c);
		System.out.print(" ."+context.getDoorState().currentState+" the Door!!\t");
	}

}
