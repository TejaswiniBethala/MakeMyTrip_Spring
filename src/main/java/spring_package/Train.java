package spring_package;
//IMPLEMENTING THE CLASS BY TRAVEL INTERFACE
public class Train implements Travel{
	String TravelBy;

	//SIMPLE CONSTRUCTOR
	public Train() {
		//System.out.println("");
		System.out.println("Train object is created");
	}

	public String getTravelBy() {
		return TravelBy;
	}

	public void setTravelBy(String travelBy) {
		TravelBy = travelBy;
	}

	@Override
	public void journey() {
		System.out.println("Time takes to travel in train from Hyderabad to Karimnagar takes 7 hrs");
		
	}

	@Override
	public void cost() {
		System.out.println("Travelling  cost is 700rs");
		
		
	}

	@Override
	public String toString() {
		return "Train [TravelBy=" + TravelBy + "]";
	}

	
	

}
