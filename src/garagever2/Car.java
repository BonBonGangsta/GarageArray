
package garagever2;

import java.util.Random;
/**
 * A Car has a plate number and the numbers of times it has been moved. 
 */
public class Car 
{

    private String tagNumber ; // the license plate number
    private int numberOfMoves ; // the number of times relocated
    
    /**
     * Creates a Car with the specified plateNumber.
     * @param plateNumber License plate number of the car
     */
    public Car(String plateNumber) 
    {
        tagNumber = plateNumber ;
        numberOfMoves = 0 ; // initialize the number of moves to zero
    }

    // Getters
    
    /**
     * Gets the tagNumber from the car.
     * @return tagNumber of the car.
     */
    public String getTagNumber() 
    {
        return tagNumber ;
    }

    /**
     * Gets the number of times the car has been moved.
     * @return numberOfMoves the car has accumulated.
     */
    public int getNumberOfMoves() 
    {
        return numberOfMoves ;
    }

    // Modifiers
    
    /**
     * Add 1 to numberOfMoves counter for the car.
     */
    public void addToMove() 
    {
        numberOfMoves++ ;
    }
}
