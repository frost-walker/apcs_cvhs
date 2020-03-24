/**
 * @author      : xander (xander@Xanders-MacBook-Air.local)
 * @file        : Taxi
 * @created     : Thursday Feb 13, 2020 13:55:01 PST
 */
import ExamFiles.Car;
public class Taxi extends Car
{
	private double feePerMile;
    private boolean hasPassenger;
	private double totalIncome;
	private int milesDriven;
	public Taxi(int milesOnATank, double feePerMile)
    {
        super(milesOnATank);
		this.feePerMile =  feePerMile;
		totalIncome = 0;
		milesDriven = 0;
    }
	public void drive(int miles)
	{
		milesDriven += miles;
		super.drive(miles);
	}
	public void fillTank()
	{
		totalIncome -= milesDriven * .20;
		milesDriven = 0;
	}
	public void pickUpPassenger(int miles)
	{
		hasPassenger = true;
		totalIncome += feePerMile * miles;
		drive(miles);
	}

	public void dropOffPassenger()
	{
		hasPassenger = false;
	}
	
	public double getIncome()
	{
		return totalIncome;
	}

	public String toString()
	{
		return "Remaining Miles " + super.toString() + 
		"\nhas Passenger: " + hasPassenger + "\nTotal Income: " + totalIncome; 
	}
}


