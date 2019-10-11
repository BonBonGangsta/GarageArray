
package garagever2;

// Imports needed for this tester Class
import java.util.Scanner ;
import java.io.File ;
import java.io.IOException ;
import java.io.PrintWriter ;

public class ValetInDoral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
      // Create the output file before I forget
      PrintWriter output = new PrintWriter(new File("output.txt") ) ;
      
      // create the scanner file of a text file
      Scanner fileScan = new Scanner(new File("garage.txt")) ;
      
      // Open the Garage for business
      Garage laCarreta = new Garage() ;
      
      // while there is still strings in the file do
      while (fileScan.hasNext())
      {
          String licensePlate = fileScan.next() ; // store the plate
          String action = fileScan.next() ; // store the action
          
          // accept the car for valet (create the car)
          Car valetCar = new Car(licensePlate) ;
          
          //test the action
          if (action.equals("ARRIVE"))
          {
              output.println(laCarreta.arrive(valetCar)) ;
          }
          else
          {
              output.println(laCarreta.Depart(valetCar)) ;
          }
          
      }
      
      // close the shop by saying good bye!
      output.println("We are closed for the day! Thank you!") ;
      
      // DO NOT FORGET TO CLOSE THE FILE!
      output.close() ;
    }
}
