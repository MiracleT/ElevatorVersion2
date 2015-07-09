package v3;

/**Version 3
 * 
 * @author 1303:Melroy Fernandes
 * 		   1309:Miracle D'souza
 * ________________________________________________________________________________________________________________________________
 * design patterns used:
 * 
 * Singleton pattern: Elevator class----------------------------------------->To Restrict only one elevator at any point in time.
 * State pattern: Door(DoorContext,Open,Close,DoorState classes)------------->to make the door switch between open and close.
 * Facade pattern: BuildingElevatorFacade class------------------------------>To hide the complexity of calling various elevator 
 * 																			   units work from user.He gets the work done by simply
 * 																			   using the method of the facade.
 * Decorator pattern:Decorator,UpButton,DownButton classes------------------->Added the direction buttons(addditional functionality)
 *																			  inside the lift for +1 or -1 tracking of destination.
 *__________________________________________________________________________________________________________________________________
 */

public class eMain {
	public static void main(String[] args) {
		
		BuildingElevatorFacade EverGreenApartments=new BuildingElevatorFacade();
		
		EverGreenApartments.requestElevator(3,0);
		EverGreenApartments.requestElevator(5,0);
		EverGreenApartments.requestElevator(2,5);
		EverGreenApartments.requestElevator(3,0);
		EverGreenApartments.requestElevator(0,4);
		EverGreenApartments.requestElevator(4,6); //indicating press of "down button" from inside the elevator
	}
}
