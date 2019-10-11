/*
 * I certify that this is all my original work.
    Byron De Paz 3999061
 */
package garagever2;

/**
 * Garage is a collection of cars that are parked with one exit and entrance.
 *
 */
public class Garage {
    
    private static final int CAPACITY = 10 ; // maximum capacity of the garage
    private final Car[] bashemin ; // name of the garage is bashemin
    private int count ; // used to know the spots used in the garage
    /**
     * Create the Garage with the an initial capacity.
     */
    public Garage()
    {
        bashemin = new Car[CAPACITY] ;
        count = 0 ;
    }
   
    /**
     * Departs the car if the car is currently parked in the garage.
     * @param valetCar the car that wishes to depart.
     * @return a message of the action that was completed.
     */
    public String Depart(Car valetCar)
   {  
       // temporarily store the valetCar's tag number
      String tempPlate = valetCar.getTagNumber();
      boolean found = false ;  // we need a trigger     
      int index = 0; 
      int numberOfMoves = 0; // place holder for the number of moves if found.
      while (index < count && !found) 
      {
         // temporarily store the license plate for 
         String parkedPlate = bashemin[index].getTagNumber() ;
          // test if the strings equal
         if (parkedPlate.equals(tempPlate)) 
         {
            found = true ;  // trigger the found switch
            numberOfMoves = bashemin[index].getNumberOfMoves() ; //store it
         } 
         else                         
         {
            index++; // try again                
         }
      }
      // check to see if it was found
      if (found)                  
      {
        // for each element from the front to the spot before the index
        for (int i = 0 ; i < index ; i++)
            {
                bashemin[i].addToMove(); // 1 to the move counter
            }
        // for each element from position index+1 to last car spot
        for (int i = index; i < count - 1; i++)
            {
            bashemin[i] = bashemin[i+1]; // move the car up 1 spot
            }
        count--;                      // update size of list
        return (tempPlate + " has departed from the garage with "
              + numberOfMoves + " total number of moves ") ;
            // found and removed
      }
      else
      {
          // the car is not in the list
          return (tempPlate + " is not in this garage") ;
      } 
         
  }
    
    
    /**
    * Parks the car if there is space available.
    * @param valetCar the car that arrives.
    * @return a string if the car was successfully 
    * parked.
    */
   public String arrive(Car valetCar)
   {
      // temporarily store the tag number
      String tempPlate = valetCar.getTagNumber() ; 
      // if array is not full look for the car to make sure it doesn't exist.
      if (count == bashemin.length)   
      {
                  // the garage is full, kindly infrom the customer
        return ("Sorry " + tempPlate + ", the Garage is full!") ;
      }
      else
      {
        // insert new car at index i and update size of list
        bashemin[count] = valetCar ;
        count++;
        // the car already exists in the garage
        return( tempPlate + " is parked sir");
      }
   }
}