package v3;

/********************************************PATTERN 3:Facade design pattern *****************************************************/

public class BuildingElevatorFacade {

	int TotalFloors=8;
	int destination;
	Elevator e1=Elevator.getInstance();												//implementing singleton pattern

	Floors f0 = new Floors(0);
	Floors f1 = new Floors(1);
	Floors f2 = new Floors(2);
	Floors f3 = new Floors(3);
	Floors f4 = new Floors(4);
	Floors f5 = new Floors(5);
	Floors[] arrayFloors = {f0, f1, f2, f3, f4, f5};                                 //array of floors in the building


	//function to manage the elevator
	public int requestElevator(int from,int to) {

		//Call elevator simulation
		System.out.print("\nCall Elevator to floor"+from+".It is currently at floor "+e1.getCurrentLocation());
		arrayFloors[from].pressToCall.push(arrayFloors[from].floorNum);              	//press the button on the respective floor to call the lift to your location 
		//Entry in the elevator simpulation
		arrayFloors[from].floorDoor.Switch("Floor");									//Open the floor door at the elevator entrance
		System.out.println("\n********I enter in at floor "+from+"!");
		e1.elevatorDoor.Switch("Elevator");												//Close the elevator door
		arrayFloors[from].floorDoor.Switch("Floor");									//close the floor door from where you just entered the elevator
		System.out.println("\n ");

		//Inside the elevator actions
		e1.displayButtonPanel(TotalFloors);												//display the buttons indicating the floor inside the lift
		System.out.println(" ");
		if(to!=6 && to!=7){																//to check whether a floor button or direction button is pressed
			e1.arrayPanel[to].push(e1.arrayPanel[to].buttonVal);						//press the floor button you want to go to now(capture the value from the button)
			destination = e1.arrayPanel[to].buttonVal;
		}
		else{
			e1.arrayPanel[to].push(e1.arrayPanel[from].buttonVal);						//if up or down pressed we pass the current location as the "to" value is only represenation of direction
			destination = e1.arrayPanel[from].buttonVal;
		}

		//Getting out of the elevator to destination
		System.out.print(" ");
		arrayFloors[from].floorDoor.Switch("Floor");									//open the destination floor door when the lift reaches there
		System.out.println("\n********I get off at floor "+destination);								
		arrayFloors[from].floorDoor.Switch("Floor");									//floor door closes
		e1.elevatorDoor.Switch("Elevator");												//elevator door closes
		System.out.println("\n\n ^^^^^^^^^^^^^^^^^^^^^^REQUEST SERVICED^^^^^^^^^^^^^^^^^^^^^^ ");

		return Elevator.currentLocation;
	}
}
