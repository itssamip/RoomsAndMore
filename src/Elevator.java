/**
 * @author Samip Khanal
 * 
 *         class elevator that inherits from room
 */
public class Elevator extends Room {
    private int currentFloor;

    /**
     * 
     * @param area
     * 
     *             Elevator constructor that takes the area as the parameter and,
     *             passes it to its parent class room
     *
     */
    public Elevator(int area) {
        super(area);
    }

    /**
     * 
     * @return the current floor of the elevator
     */
    public int getCurrentFloor() {
        return currentFloor;
    }

    /**
     * 
     * @param floor
     * 
     *              increases the current floor by the parameter
     */
    public void up(int floor) {
        currentFloor += floor;
    }

    /**
     * 
     * @param floor
     * 
     *              decreases the current floor by the parameter
     */
    public void down(int floor) {
        currentFloor -= floor;

    }

    /**
     * this overrides to string method
     * which prints square feet and capacity of the elevator, as well as its current
     * floor.
     */
    @Override
    public String toString() {
        return ("the squre feet of the elvlator is " + getSqureFeet() + " ,its capacity is " + getCapacity()
                + " ,and its floor is " + getCurrentFloor());
    }

}
