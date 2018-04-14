package vm222cv_assign1.FerryInheritance;

public class TypeOfVehicle
{
	public enum typeOfVehicle
	{
		BICYCLE(1),
		CAR(5),
		BUS(20),
		LORRY(40);
		
		
		private int size;
		
		private typeOfVehicle (int size)
		{
			this.size = size;
		}
		
		public int getSize()
		{
			return size;
		}
	}

}
