package v3;

public class Close extends DoorState {
	
	public Close(){
		currentState="Close";
	}
	
	@Override
	public void SwitchState(DoorContext context,String type) {
		// TODO Auto-generated method stub
		System.out.print("The "+type+" Door is "+currentState);
		Open o=new 	Open();
		context.setDoorState(o);
		System.out.print(" ."+context.getDoorState().currentState+" the Door!!\t");
	}
}
