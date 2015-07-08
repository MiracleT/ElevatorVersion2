package v3;

public class Elevator {

	static int currentLocation;
	Door elevatorDoor=new Door();
	InnerButtonPanel[] arrayPanel = new InnerButtonPanel[6];

//getter - setter
	public int getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(int currentLocation) {
		Elevator.currentLocation = currentLocation;
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
		elevatorDoor.open("Elevator");         //once you reach the destination open the Elevatordoor

	}

	public void displayButtonPanel(int totalFloors) {			//display the buttons each for every existing floor
		
		InnerButtonPanel b0 = new InnerButtonPanel(0);
		InnerButtonPanel b1 = new InnerButtonPanel(1);
		InnerButtonPanel b2 = new InnerButtonPanel(2);
		InnerButtonPanel b3 = new InnerButtonPanel(3);
		InnerButtonPanel b4 = new InnerButtonPanel(4);
		InnerButtonPanel b5 = new InnerButtonPanel(5);
		arrayPanel[0] = b0;
		arrayPanel[1] = b1;
		arrayPanel[2] = b2;
		arrayPanel[3] = b3;
		arrayPanel[4] = b4;
		arrayPanel[5] = b5;
		
		System.out.print("Inside lift-Panel: \t");
		for(int i=0;i<=totalFloors;i++)
			System.out.print(arrayPanel[i].buttonVal+" ");
	}
}
