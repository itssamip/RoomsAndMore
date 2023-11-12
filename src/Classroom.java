/**
 * @author Samip Khanal
 * 
 * Class room class that extends from  room
 */
public class Classroom extends Room{

    /**
     * instance variable for number of chairs
     */
    private int numberOfChairs;

    /**
     * 
     * @param area
     * 
     * it takes parameter area and passes it to superclass
     */
    public Classroom(int area){
        super(area);
    }

    /**
     * 
     * @param area
     * it takes parameter area and passes it to superclass
     * 
     * @param numberOfChairs
     * this constructor is used when there are two arguments
     * this  takes the number of chair of the room as a second  parameter
     */

    public Classroom(int area, int numberOfChairs){
        super(area);
        this.numberOfChairs = numberOfChairs;
    }

    /**
     * @return int return the numberOfChairs
     */
    public int getNumberOfChairs() {
        return numberOfChairs;
    }

    /**
     * @param numberOfChairs the numberOfChairs to set
     */
    public void setNumberOfChairs(int numberOfChairs) {
        this.numberOfChairs = numberOfChairs;
    }

    /**
     * it override the getcapacity method from the room class and returns the number of chairs 
     */
    @Override
    public int getCapacity(){
        return getNumberOfChairs();
    }

    /**
     * it overrides the toString method and prints the capacity and number of the chairs in the room
     */
    @Override
    public String toString(){
        return("The capacity of the room is "+ getCapacity() + "and the number of chairs is "+ getNumberOfChairs());
    }

}
