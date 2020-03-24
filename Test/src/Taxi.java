import ExamFiles.Car;
public class Taxi extends Car
{
	private double feePerMile;
    private boolean hasPassenger;
	private double totalIncome;
	private int milesDriven;
	public void drive(int miles)
	{	
		milesDriven += miles;
		if(hasPassenger)
			totalIncome += miles * feePerMile;
		super.drive(miles);
	}
	public void fillTank()
	{
		super.fillTank();
		this.totalIncome -= milesDriven *.20;
		milesDriven = 0;
	}
	public Taxi(int milesOnATank, double feePerMile)
    {
        super(milesOnATank);
		this.feePerMile = feePerMile;
		this.milesOnATank = milesOnATank;
		totalIncome = 0;
    }
	public void pickUpPassenger(int miles)
	{
		hasPassenger = true;
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
