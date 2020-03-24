import java.util.ArrayList;
public class RemotestCity
{
    public static void main(String[] args)
    {
        ArrayList<String> cityNames = new ArrayList<>();
        cityNames.add("Atlanta");
        cityNames.add("Boston");
        cityNames.add("Cleveland");
        cityNames.add("Dallas");
        cityNames.add("Washington");

        int[][] distances = {
                {0,     936,   550,   719,   540},
                {936,     0,   554,  1547,   396},
                {550,	  554,     0,  1018,   309},
                {719,	 1547,  1018,     0,  1181},
                {540,	  396,   309,  1181,     0}};

        System.out.println(findRemotestCity(cityNames, distances));
		// Should print: Dallas
    }
	public static String findRemotestCity(ArrayList<String> cityNames,
			int[][] distances)
	{
		int bigIndex = 0, bigDistance = 0, totalDistance = 0;
		for(int r = 0; r < distances.length; r++)
		{
			for(int c = 0; c < distances[0].length; c++)
				totalDistance += distances[r][c];
			if(totalDistance > bigDistance)
			{
				bigDistance = totalDistance;
				bigIndex = r;
			}
			totalDistance = 0;
				
		}
		return cityNames.get(bigIndex);
	}

    /*  Your method goes here  */
}


