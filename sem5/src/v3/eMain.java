package v3;



public class eMain {
	public static void main(String[] args) {
		
		BuildingElevatorFacade EverGreenApartments=new BuildingElevatorFacade();
		
		EverGreenApartments.requestElevator(3,0);
		EverGreenApartments.requestElevator(5,0);
		EverGreenApartments.requestElevator(2,5);
		EverGreenApartments.requestElevator(3,0);
		EverGreenApartments.requestElevator(0,4);
		
	}
}
