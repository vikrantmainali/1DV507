package vm222cv_assign1.FerryInheritance;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthSeparatorUI;

import vm222cv_assign1.FerryInheritance.TypeOfVehicle.typeOfVehicle;

public abstract class Vehicle 
{
	ArrayList<Passenger> passengers;
	protected int vehicleSize;
	protected int vehicleCost;
	protected int maxPassengers;
	protected int amountOfPassengers;
	
	public Vehicle()
	{		
	}

    public abstract int getSize();
    public abstract int getTotalPrice();
    public abstract typeOfVehicle getType();
    public abstract int getMaxPassengers();
    
    public void addPassenger(Passenger p)
    {
        if (passengers.size()<getMaxPassengers())
        {
            passengers.add(p);
        }
        else
        {
        	System.out.println("No more room left!");
        	System.exit(0);
        }
    }
    
    public int vehiclePassengers()
    {
        return passengers.size();
    }
}	