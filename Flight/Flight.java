import java.util.*;
public class Flight{
    
    int num_flights;
    int flightID;
    int availabletickets;
    int remainingtickets;
    int startingprice;
    ArrayList<String> passengerdetails;
    /*static*/ int id = 0;

    Flight()
    {
        num_flights = 2; 
        id = id+1;
        flightID = id;
        availabletickets = 50;
        remainingtickets = 50;
        startingprice = 5000;
        passengerdetails = new ArrayList<>();
    }
 
    public void printpassengerdetails()
    {
        if(passengerdetails.size() == 0)
        {
            System.out.println("No passenger details found");
        }
        else
        {
         for(String p : passengerdetails)
         {
            System.out.println(p);
         }
    }
    }
    public void printdetails()
    {
        System.out.println("FlightID : "+this.flightID +"\n Available Tickets :"+this.availabletickets +"\nStating price :"+this.startingprice );
    }
}

