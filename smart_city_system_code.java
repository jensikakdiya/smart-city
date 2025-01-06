import java.io.*;
import java.util.*;
public class SmartCity
{
    public static double calculateFare(String mode, int distance) {
        double fareAmount = 0.0;
        if (mode.equalsIgnoreCase("bus")) {
            fareAmount = distance * 0.5;
        } else if (mode.equalsIgnoreCase("taxi")) {
            fareAmount = distance *2.0;
        } else if (mode.equalsIgnoreCase("metro")) {
            fareAmount = distance *1.0;
        } else {
            System.out.println("Invalid transport mode selected");
            return 0.0;
        }
        // Calculate distance
        return fareAmount;
    }
   
	public static void main(String []args)
	{
        	int ch;
		do
		{
			
			System.out.println("Select:");
			System.out.println("1.City Transportation:");
			System.out.println("2.Electricity Billing:");
			System.out.println("3.Hotel Booking:");
			System.out.println("4.Exit");
			System.out.println("enter your choice: ");
			Scanner sc = new Scanner(System.in);
			ch = sc.nextInt();
			switch(ch)
			{
				case 1:
					CityTransportation ct = new CityTransportation();
					break;	
				case 2:
					ElectricityBillingSystem eb = new ElectricityBillingSystem();
					break;
				case 3:
					HotelBookingSystem hb = new HotelBookingSystem();
					break;
				case 4:
                    		System.out.println("Exiting program...");
                    		break;
				default:
					System.out.println("Invalid Choice");
                    break;
			}
			 
		}while(ch!=4);
	}

 
static class CityTransportation 
{{
    try 
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Get user details
      int i=1;
        
        // Get transport details
  	  System.out.print("Enter distance traveled in km: ");	
        int distance =Integer.parseInt(br.readLine());
         System.out.println("Select mode of transport (bus, metro, or taxi):");
        String transportMode = br.readLine();
            
        // Calculate fare amount
        double fareAmount = calculateFare(transportMode, distance);
    
        // Print fare details
        System.out.println("\n\n\nTransportation Fare\n");
        System.out.println("Transport Mode: " + transportMode);
        System.out.println("distance traveled: " + distance);
        System.out.println("Fare Amount (in Rs.): " + fareAmount);
            
        // Save fare details to file
        String filename = i+"_"+transportMode + ".txt";
	  i++;
        PrintWriter writer = new PrintWriter(filename);
        writer.println("Transport Mode: " + transportMode);
        writer.println("distance traveled: " + distance);
        writer.println("Fare Amount (in Rs.): " + fareAmount);
        writer.close();
            
    } 
	catch(IOException e) 
	{
        System.out.println("IOException occurred: " + e.getMessage());
    }
}
}
static class ElectricityBillingSystem 
{
    {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            
            // Get meter reading details
            System.out.print("Enter units consumed: ");
            int unitsConsumed  = Integer.parseInt(br.readLine());
            
            // Calculate bill amount
            double billAmount = calculateBill(unitsConsumed);
            
            // Print bill details
            System.out.println("\n\n\nElectricity Bill\n");
            System.out.println("Units Consumed: " + unitsConsumed);
            System.out.println("Bill Amount (in Rs.): " + billAmount);
            
            // Save bill details to file
            String filename ="Electricity Bill" + unitsConsumed + ".txt";
            PrintWriter writer = new PrintWriter(filename);
            
            writer.println("Units Consumed: " + unitsConsumed);
            writer.println("Bill Amount (in Rs.): " + billAmount);
            writer.close();
            
        } catch(IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
    // Function to calculate bill amount
    public static double calculateBill(int unitsConsumed) {
	double unitPrice = 8.0;
      double fixedCharge = 100.0;
	double totalAmount;
	double surcharge;
     	double grandTotal;
      if (unitsConsumed <= 300)
	{
		totalAmount = unitsConsumed * unitPrice + fixedCharge;
		surcharge = 0;
	}
      else if (unitsConsumed <= 500)
      {
            totalAmount = 300 * unitPrice + fixedCharge + (unitsConsumed - 300) * (unitPrice * 1.2);
            surcharge = totalAmount * 0.15;
        }
        else 
        {
            totalAmount = 300 * unitPrice + fixedCharge + 200 * (unitPrice * 1.2) + (unitsConsumed - 500) * (unitPrice * 1.5);
            surcharge = totalAmount * 0.15;
        }
        
        return grandTotal = totalAmount + surcharge;

    }
}
static class HotelBookingSystem 
{
    {try 
    {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            // Get booking details
            System.out.println("Enter your name:");
            String customerName = br.readLine();
            System.out.println("Enter check-in date (dd/mm/yyyy):");
            String checkInDate = br.readLine();
            System.out.println("Total Days of Stay:");
            int stay = Integer.parseInt(br.readLine());
            System.out.println("Enter room type (single/double):");
            String roomType = br.readLine();
            System.out.println("Enter number of guests:");
            int numGuests = Integer.parseInt(br.readLine());
            
            // Calculate booking amount
            double bookingAmount = calculateBookingAmount(roomType, numGuests, stay);
            
            // Print booking details
            System.out.println("\n\n\nHotel Booking Details\n");
            System.out.println("Customer Name: " + customerName);
            System.out.println("Check-in Date: " + checkInDate);
            System.out.println("Total Days of Stay: " + stay);
            System.out.println("Room Type: " + roomType);
            System.out.println("Number of Guests: " + numGuests);
            System.out.println("Booking Amount (in Rs.): " + bookingAmount);
            
            // Save booking details to file
            String filename = customerName + "_" + checkInDate + "_" + roomType + ".txt";
            PrintWriter writer = new PrintWriter(filename);
            writer.println("Customer Name: " + customerName);
            writer.println("Check-in Date: " + checkInDate);
            writer.println("Total Days of Stay: " + stay);
            writer.println("Room Type: " + roomType);
            writer.println("Number of Guests: " + numGuests);
            writer.println("Booking Amount (in Rs.): " + bookingAmount);
            writer.close();
            
        } 
        catch(IOException e) 
        {
            System.out.println("IOException occurred: " + e.getMessage());
        }
        
    }
     // Function to calculate booking amount based on room type and number of guests
     public static double calculateBookingAmount(String roomType, int numGuests , int stay) {
        double roomRate = 0.0;
        if (roomType.equalsIgnoreCase("single")) {
            roomRate = 1200.0;
        } else if (roomType.equalsIgnoreCase("double")) {
            roomRate = 1000.0;
        } else {
            System.out.println("Invalid room type selected");
            return 0.0;
        }
	  
        double bookingAmount = roomRate * numGuests*stay;
        return bookingAmount;
    }
}
}
