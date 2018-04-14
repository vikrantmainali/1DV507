package vm222cv_assign1.FerryInheritance;

import vm222cv_assign1.FerryInheritance.TypeOfVehicle.typeOfVehicle;
import vm222cv_assign1.FerryInheritance.Vehicle;

public class Bicycle extends Vehicle
{
	private typeOfVehicle r = typeOfVehicle.BICYCLE;
	
	Bicycle(int amountOfPassengers)
	{
		vehicleSize = 1;
		vehicleCost = 40;
		maxPassengers = 1;
		super.amountOfPassengers = amountOfPassengers;	
	}

	@Override
	public int getSize() 
	{	
		return r.getSize();
	}

	@Override
	public int getTotalPrice()
	{
		return 40;
	}

	@Override
	public typeOfVehicle getType()
	{
		return r;
	}

	@Override
	public int getMaxPassengers() 
	{
		return 1;
	}

}
