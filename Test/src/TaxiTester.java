public class TaxiTester
{
    public static void main(String[] args)
    {
        Taxi taxi = new Taxi(250, 3.00);
        System.out.println(taxi);  // Can drive 250 miles farther; No passenger; Income: $0.0
        taxi.pickUpPassenger(10);
        taxi.dropOffPassenger();
        taxi.drive(10);
        System.out.println(taxi);  // Can drive 230 miles farther; No passenger; Income: $30.0
        taxi.fillTank();
        System.out.println(taxi);  // Can drive 250 miles farther; No passenger; Income: $26.0
		taxi.pickUpPassenger(10);        
    	System.out.println(taxi);
		taxi.drive(10);
		System.out.println(taxi);
		// You may wish to test other situations and methods.
    }
}


