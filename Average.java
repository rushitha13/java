package Question1;
import java.util.*;
import java.util.stream.*;

public class Average 
{
	
	public Double findAverage(ArrayList<Integer> list)
	{
		
		OptionalDouble average = list.stream().mapToInt(i->i).average();
		
		return average.getAsDouble();
		
		
	}
	
}
