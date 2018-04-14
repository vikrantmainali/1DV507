package vm222cv_assign1.FerryInheritance;

import java.util.ArrayList;
import java.util.Iterator;

import vm222cv_assign1.FerryInheritance.Ferry;
import vm222cv_assign1.FerryInheritance.Passenger;
import vm222cv_assign1.FerryInheritance.Vehicle;

public class FerryImplementation implements Ferry 
{
	ArrayList<Vehicle> v = new ArrayList<Vehicle>();
	ArrayList<Passenger> psg = new ArrayList<Passenger>();

	@Override
	public int countPassengers()
	{	
		int counter = 0;
		
		for (Vehicle v : v)
		{
			counter = v.vehiclePassengers();
		}
			
			counter = counter + psg.size();
			
			return counter;
	}

	@Override
	public int countVehicleSpace() 
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countMoney() 
	{
		return 0;
	}

	@Override
	public Iterator<Vehicle> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void embark(Vehicle v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void embark(Passenger p) 
	{
		if (!psg.contains(p))
		{
			psg.add(p);
		}
		{	
			
		}
	}

	@Override
	public void disembark() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasSpaceFor(Vehicle v) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasRoomFor(Passenger p) {
		// TODO Auto-generated method stub
		return false;
	}

}
