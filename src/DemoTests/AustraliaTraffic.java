package DemoTests;

import JavaConcepts.CentralTraffic;
import JavaConcepts.ContinentTraffic;

public class AustraliaTraffic implements CentralTraffic, ContinentTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		CentralTraffic aus = new AustraliaTraffic();
		aus.redLightStop();
		System.out.println(aus.Light);
		
		AustraliaTraffic aus1 = new AustraliaTraffic();
		aus1.NoTrafficRulesToEmergencyservices();
		
	}

	@Override
	public void redLightStop() {
		// TODO Auto-generated method stub
		System.out.println("Traffic should stops as soon as Red Light appreas on Traffic lights");
		System.out.println("Emergency Services (Ambulance, Police and Firebrigades ) do not follow these rules");
	}

	@Override
	public void greenLightGo() {
		// TODO Auto-generated method stub
		System.out.println("Traffic should start and move as soon as Green Light appreas on Traffic lights");
		
	}

	@Override
	public void flasingYellowLightWait() {
		// TODO Auto-generated method stub
		System.out.println("Traffic should wait as soon as flashing yellow Light appreas on Traffic lights");
		System.out.println("Emergency Services (Ambulance, Police and Firebrigades ) do not follow these rules");
	}

	@Override
	public void yellowLightReadytoGo() {
		// TODO Auto-generated method stub
		System.out.println("Traffic should ready to go as soon as yellow Light appreas on Traffic lights");
		System.out.println("Emergency Services (Ambulance, Police and Firebrigades ) do not follow these rules");
		
	}

	@Override
	public void NoTrafficRulesToEmergencyservices() {
		// TODO Auto-generated method stub
		System.out.println("Emergency Services (Ambulance, Police and Firebrigades ) do not follow these rules");
	}

}
