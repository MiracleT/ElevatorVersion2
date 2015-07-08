package v3;

//Design pattern 1:singleton pattern-------------->only one elevator per building


public class Elevator {

	private static Elevator instance;
	static int currentLocation;
	DoorContext elevatorDoor=new DoorContext(new Close());
	Buttons[] arrayPanel = new Buttons[8];

	//getter - setter
	public int getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(int currentLocation) {
		Elevator.currentLocation = currentLocation;
	}

	//singleton pattern
	private Elevator(){

	}

	public static Elevator getInstance() {
		if(instance == null)
			instance = new Elevator();
		return instance;
	}

	//to monitor elevator movement
	void getTo(int from){
		int beginat = this.getCurrentLocation();

		if(beginat==from)
			System.out.println("Elevator At Floor "+this.getCurrentLocation()+" itself");

		else if(this.getCurrentLocation()<from){
			for(int i=beginat;i<=from;i++){
				this.setCurrentLocation(i);
				System.out.println("\tFloor "+this.getCurrentLocation());
			}
		}
		else if(this.getCurrentLocation()>from){
			for(int i=beginat;i>=from;i--){
				this.setCurrentLocation(i);
				System.out.println("\tFloor "+this.getCurrentLocation());
			}
		}
		System.out.println("---------------------------------------------------------------------------------------------");
		elevatorDoor.Switch("Elevator");         //once you reach the destination open the Elevatordoor

	}

	public void displayButtonPanel(int totalFloors) {			//display the buttons each for every existing floor

		InnerButtonPanel b0 = new InnerButtonPanel(0);
		InnerButtonPanel b1 = new InnerButtonPanel(1);
		InnerButtonPanel b2 = new InnerButtonPanel(2);
		InnerButtonPanel b3 = new InnerButtonPanel(3);
		InnerButtonPanel b4 = new InnerButtonPanel(4);
		InnerButtonPanel b5 = new InnerButtonPanel(5);
		UpButton up = new UpButton(6); 
		DownButton down = new DownButton(7); 

		arrayPanel[0] = b0;
		arrayPanel[1] = b1;
		arrayPanel[2] = b2;
		arrayPanel[3] = b3;
		arrayPanel[4] = b4;
		arrayPanel[5] = b5;
		arrayPanel[6]=  up;
		arrayPanel[7] = down;
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.print("Inside lift-Panel: \tFloors:  ");
		for(int i=0;i<6;i++)
			System.out.print(arrayPanel[i].buttonVal+" ");
		System.out.print("\t6:Up 7:Down\n");
		
	}
}
