package spring_package;
//IMPLEMENTING THE CLASS BY TRAVEL INTERFACE
public class Bus implements Travel{
	String TravelBy;

	//SIMPLE CONSTRUCTOR
	public Bus() {
		System.out.println("Bus object is created");
	}

	public String getTravelBy() {
		return TravelBy;
	}

	public void setTravelBy(String travelBy) {
		TravelBy = travelBy;
	}

	@Override
	public String toString() {
		return "Bus [TravelBy=" + TravelBy + "]";
	}

	@Override
	public void journey() {
		System.out.println("Time takes to travel in bus from hyderabd to tirupati is 10 hrs");
		
	}

	@Override
	public void cost() {
		System.out.println("Travelling in bus costs 1000rs");
		
	}
	

	
	

}
