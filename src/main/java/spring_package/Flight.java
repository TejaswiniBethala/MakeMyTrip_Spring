package spring_package;
//IMPLEMENTING THE CLASS BY TRAVEL INTERFACE
public class Flight implements Travel{
	String TravelBy;

	//SIMPLE CONSTRUCTOR
	public Flight() {
		System.out.println("Flight object is created");
		System.out.println();
	}

	public String getTravelBy() {
		return TravelBy;
	}

	public void setTravelBy(String travelBy) {
		TravelBy = travelBy;
	}

	@Override
	public String toString() {
		return "Flight [TravelBy=" + TravelBy + "]";
	}

	@Override
	public void journey() {
		System.out.println("Time takes to travel in flight from hyderabad to Delhi is 3 hrs");
		
	}

	@Override
	public void cost() {
		System.out.println("Travelling cost is 5000rs");
		
	}

	
	

}
