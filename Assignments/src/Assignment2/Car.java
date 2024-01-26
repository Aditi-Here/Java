package Assignment2;

public class Car extends Vehicle{

	double distance=10;
	double gasCapacity;
	void fuelEfficiency(double distance , double gasCapacity)
	{
		System.out.println(" The fuel efficiency of Car is : "+distance/gasCapacity);
	}
	void displayDetails()
	{
		System.out.println("car");
	}
}
