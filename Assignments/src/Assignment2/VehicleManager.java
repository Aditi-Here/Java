package Assignment2;
import  Assignment2.*;
import java.util.*;

public class VehicleManager {
	
	
	
	public static void main(String[] args)
	{
		
		ArrayList<Vehicle> vehicleList = new ArrayList<>();
		
		Vehicle v = new Vehicle();
		vehicleList.add(v);
		
		Vehicle c = new Car();
		vehicleList.add(c);
		
		Vehicle t = new Truck();
		vehicleList.add(t);
		
		Vehicle m = new Motorcycle();
		vehicleList.add(m);
		
		
		for(Vehicle v1 : vehicleList)
		{
			v1.fuelEfficiency(100,10);
			v1.displayDetails();
		}
		
		
		
		
		
		
		
		
		
	}
}
