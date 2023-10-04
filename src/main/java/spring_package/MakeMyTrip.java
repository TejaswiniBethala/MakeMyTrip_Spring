//Program on planning a trip by considering the manual wiring
package spring_package;

public class MakeMyTrip {
	Travel travel;

	//simple constructer
	public MakeMyTrip() {
		
		System.out.println("MakeMyTrip object created");
	}

	//SETTERS AND GETTERS
	public Travel getTravel() {
		return travel;
	}

	public void setTravel(Travel travel) {
		this.travel = travel;
	}

	//TOSTRING() METHOD
	@Override
	public String toString() {
		return "MakeMyTrip [travel=" + travel + "]";
	}
	

}
