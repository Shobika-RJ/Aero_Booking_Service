import java.util.*;
public class BookTicket {
 static int price =0;
    
    static List<Integer> ticketPrices = new ArrayList<>();
    static List<Integer> numtickets = new ArrayList<>();
    static ArrayList<Integer> id1 = new ArrayList<>();

    static void booktickets(Flight currentFlight,int passengerID,int num_tickets)
    {
        System.out.println("Tickets Booked:"+num_tickets);
        System.out.println("Price :"+(num_tickets*currentFlight.startingprice));
        price = num_tickets*currentFlight.startingprice;

        ticketPrices.add(price);
        numtickets.add(num_tickets);
        id1.add(passengerID);
        /*for(int i =0 ;i<ticketPrices.size();i++)
        {
            System.out.println(ticketPrices.get(i));
        }*/
        /*  for(int i =0 ;i<id1.size();i++)
        {
            System.out.println(id1.get(i));
        }*/

        System.out.println("-------------------Booked Successfully-----------------------");
        String passenger = "";
        passenger = "FlightID : "+currentFlight.flightID +" PassengerID : "+passengerID+" Number of Tickets :"+num_tickets+" Cost :"+price;
        currentFlight.passengerdetails.add(passenger);
        currentFlight.availabletickets = currentFlight.availabletickets-num_tickets;
        currentFlight.startingprice = currentFlight.startingprice+(num_tickets*200);

        System.out.println("Starting Price :" +currentFlight.startingprice);
        System.out.println("Remaining Tickets :" +currentFlight.availabletickets);
   
       
        //currentFlight.printpassengerdetails();
    }  

    static void cancelticket(Flight currentFlight , int passengerID)
    {
        int index = passengerID-1;
         /*String refund = currentFlight.passengerdetails.get(price);
         System.out.println(refund);
         System.out.println("Tickets cancelled successfully"); */
         if (index >= 0 && index < ticketPrices.size()) {
            int refund = ticketPrices.get(index); // Remove and get the ticket price
            System.out.println("Refund amount for PassengerID " + passengerID + ": " + refund);
            System.out.println("Ticket for PassengerID " + passengerID + " cancelled successfully.");

            int members = numtickets.get(index);
            currentFlight.availabletickets = currentFlight.availabletickets+members;

           // currentFlight.availabletickets++; // Increase available tickets upon cancellation
            currentFlight.startingprice = currentFlight.startingprice-(numtickets.get(index)*200);
            System.out.println("Updated Starting price : "+currentFlight.startingprice);
            currentFlight.passengerdetails.remove(index); // Remove passenger details from the list
           // id1.remove(index);
        } 

    }
    public static void main(String[] args) {
        int num_tickets;
        int choice = 0,fid;
        Scanner scan = new Scanner(System.in);
        int passengerID = 1;
        ArrayList<Flight> flights = new ArrayList<>();
        //Flight f = new Flight();
        for(int i = 1 ; i<=2 ; i++)
        {
            flights.add(new Flight());
        }


        System.out.println("Enter flight id :");
                fid = scan.nextInt();
                Flight currentFlight = null;
                if(fid>flights.size())
                {
                    System.out.println("Invalid Flight ID");
                }
                
                for(Flight f : flights)
                {
                    if(f.flightID == fid)
                    {
                        //System.out.println(f.flightID);
                        currentFlight = f;
                        currentFlight.printdetails();
                        break;
                    }
                }



            

        while(choice<=3)
        {
        System.out.println("Enter choice :");
        choice = scan.nextInt();

        switch(choice)
        {
            case 1 : {
                    System.out.println("Enter number of tickets :");
                     num_tickets = scan.nextInt();
                    if(num_tickets > currentFlight.availabletickets)
                    {
                        System.out.println("Ticket limit exceeded");
                    }
                    else
                    {
                     booktickets(currentFlight,passengerID,num_tickets);
                     passengerID = passengerID+1;
                    }
                     break;

                    }       
            case 2 : {
                     System.out.println("Enter PassengerID : ");
                     int pid = scan.nextInt();
                     //int index1 = pid-1;
                    
                    
                        if(id1.contains(pid))
                        {
                        
                        cancelticket(currentFlight,pid);
                        }
                    

                    else
                    {
                        System.out.println("Invalid PassengerID");
                    }
                    
                     break;
                    }
            case 3 : {
                    currentFlight.printpassengerdetails();

                     break;
            }
            default :System.out.println("Invalid choice");
                     break;

        }
        }

        scan.close();
    }
}

