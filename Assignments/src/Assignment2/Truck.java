package Assignment2;

public class Truck extends Vehicle{

	double distance;
	double gasCapacity;
	void fuelEfficiency(double distance , double gasCapacity)
	{
		System.out.println(" The fuel efficiency of Car is : "+distance/gasCapacity);
	}
	void displayDetails()
	{
		System.out.println("truck");
	}
}
