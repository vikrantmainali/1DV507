package vm222cv_assign1.FerryInheritance;

import vm222cv_assign1.FerryInheritance.TypeOfVehicle.typeOfVehicle;

public class Car extends Vehicle
{
	private typeOfVehicle r = typeOfVehicle.CAR;
	
	@Override
	public int getSize() 
	{
		r.getSize();
	}

	@Override
	public int getTotalPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public typeOfVehicle getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getMaxPassengers() {
		// TODO Auto-generated method stub
		return 0;
	}

}
