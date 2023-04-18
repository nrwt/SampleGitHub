package DemoTests;

public class AircraftAirInd extends ParentAirCraft{

	public static void main(String[] args) {
		
		AircraftAirInd ac = new AircraftAirInd();
		ac.safetyGuideLines();
		ac.aircraftColour();

	}

	@Override
	public void aircraftColour() {
		
		System.out.println("Colour is white");
		
	}

}
