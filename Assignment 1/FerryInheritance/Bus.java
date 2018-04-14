package vm222cv_assign1.FerryInheritance;

import vm222cv_assign1.FerryInheritance.TypeOfVehicle.typeOfVehicle;

public class Bus extends Vehicle
{
	private typeOfVehicle r = typeOfVehicle.BUS;

	@Override
	public int getSize()
	{
		return r.getSize();
	}

	@Override
	public int getTotalPrice() 
	{
		return 200 + passengers.size()*10;
	}

	@Override
	public typeOfVehicle getType() 
	{
		return r;
	}

	@Override
	public int getMaxPassengers() 
	{
		return 20;
	}

}
