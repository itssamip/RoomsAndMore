/**
 * @author Samip Khanal
 * 
 *         Room class
 */
public class Room {
    private int area;

    /**
     * empty Default constroctor
     */
    public Room() {

    }

    /**
     * 
     * @param area
     * 
     *             Room Constructor that takes the area of the room as a parameter
     */
    public Room(int area) {
        this.area = area;
    }

    /**
     * 
     * @return the area of room in squre feet
     */
    public int getSqureFeet() {
        return area;
    }

    /**
     * 
     * @param area
     *             set the area in of the room in squre feet
     */
    public void setSquareFeet(int area) {
        this.area = area;
    }

    /**
     * 
     * @return the capacity of the room
     */
    public int getCapacity() {
        return (area / 9);
    }

    /**
     * This method overrides the String method to print the area and capicity of the
     * room
     */
    @Override
    public String toString() {
        return ("This room is " + this.area + "square feet and the capacity of " + getCapacity());
    }

}