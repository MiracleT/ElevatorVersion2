package V2;

/******************************************** Controller Class*****************************************************/

public class Building {
		
	int TotalFloors=5;
	Elevator e1=new Elevator();
	Floors f0 = new Floors(0);
	Floors f1 = new Floors(1);
	Floors f2 = new Floors(2);
	Floors f3 = new Floors(3);
	Floors f4 = new Floors(4);
	Floors f5 = new Floors(5);
	Floors[] arrayFloors = {f0, f1, f2, f3, f4, f5};                                 //array of floors in the building
	

	//function to manage the elevator
	
	
	public void requestLift(int from,int to) {
		System.out.println("Calling Elevator to floor "+from+" Lift is currently at floor "+e1.getCurrentLocation());
		
		arrayFloors[from].pressToCall.push(arrayFloors[from].floorNum);              //press the button on the respective floor to call the lift to your location 
		arrayFloors[from].floorDoor.open("Floor");									//Open the floor door at the elevator entrance
		
		System.out.println("*******************************************\nI enter in at floor "+from+"!");
		
		e1.elevatorDoor.close("Elevator");											//Close the elevator door
		arrayFloors[from].floorDoor.close("Floor");									//close the floor door from where you just entered the elevator
		
		System.out.println("*******************************************\n ");
		
		e1.displayButtonPanel(TotalFloors);											//display the buttons indicating the floor inside the lift
		System.out.println();
		e1.arrayPanel[to].push(e1.arrayPanel[to].buttonVal);						//press the floor button you want to go to now(capture the value from the button)
		
		System.out.println("*******************************************\n ");
		
		arrayFloors[from].floorDoor.open("Floor");									//open the destination floor door when the lift reaches there
		System.out.println("I get off at floor "+to);								
		arrayFloors[from].floorDoor.close("Floor");									//floor door closes
		e1.elevatorDoor.close("Elevator");											//elevator door closes
		
		System.out.println("^^^^^^^^^^^^^^^^^^REQUEST SERVICED^^^^^^^^^^^^^^^^^^\n ");
		
	return;
	
	}
}
