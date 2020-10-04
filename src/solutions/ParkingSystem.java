package solutions;

/**
 * <b>Problem :</b> Design a parking system for a parking lot. The parking lot
 * has three kinds of parking spaces: big, medium, and small, with a fixed
 * number of slots for each size.
 * <p>
 * Implement the ParkingSystem class:
 * <p>
 * ParkingSystem(int big, int medium, int small) Initializes object of the
 * ParkingSystem class. The number of slots for each parking space are given as
 * part of the constructor.
 * <p>
 * bool addCar(int carType) Checks whether there is a parking space of carType
 * for the car that wants to get into the parking lot. carType can be of three
 * kinds: big, medium, or small, which are represented by 1, 2, and 3
 * respectively. A car can only park in a parking space of its carType. If there
 * is no space available, return false, else park the car in that size space and
 * return true.
 *
 */

public class ParkingSystem {
	private int[] parkingSpaces;

	public ParkingSystem(int big, int medium, int small) {
		parkingSpaces = new int[] { 0, big, medium, small };
	}

	public boolean addCar(int carType) {
		if (carType < 1 || carType > 3)
			return false;
		
		if (parkingSpaces[carType] > 0)
			parkingSpaces[carType]--;
		else
			return false;
		
		return true;
	}
}