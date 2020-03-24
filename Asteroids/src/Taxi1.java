import ExamFiles.Car;
public class Taxi extends Car
{
	private double feePerMile;
    private boolean hasPassenger;
	private double totalIncome;
	private int firstDrive = 0;
	private int milesDriven = 0;
	private int milesOnATank;
	public void drive(int miles)
	{
		if (super.milesRemaining()  == milesOnATank)
		{	
			totalIncome -= milesDriven * .20;
			milesDriven = 0;
		}
		milesDriven += miles;
		super.drive(miles);
	}
	public Taxi(int milesOnATank, double feePerMile)
    {
        super(milesOnATank);
		this.feePerMile =  feePerMile;
		this.milesOnATank = milesOnATank;
		totalIncome = 0;
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
