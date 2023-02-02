package studio2;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int startAmount = 100;
	double winChance = Math.random();
	double winChance2 = Math.round(winChance);
	int winLimit = 105;
	int totalSimulations = 5;
	int simulationDay = 1;
	int simulationPlays= 1;
	
	
	for(totalSimulations = 5; totalSimulations > 0; totalSimulations-- )
	{
		while (startAmount != 0 && startAmount != winLimit)
		{
			simulationPlays++;
			if (winChance2 == 1)
			{
				startAmount ++;
				
			}
			else
			{
				startAmount--;
			}
				winChance = Math.random();
				winChance2 = Math.round(winChance);
				
		}
		 
		if (startAmount == 0)
		
		System.out.println("Simulation Completed: " + startAmount + " also the simulation day is " + simulationDay++ +" also we played it " +simulationPlays + " times lol" + " also you failed :(");
		else 
			System.out.println("Simulation Completed: " + startAmount + " also the simulation day is " + simulationDay++ +" also we played it " +simulationPlays + " times lol" + " also it was a success");
		startAmount = 100;
				
		
	}
		
			
	}
}

