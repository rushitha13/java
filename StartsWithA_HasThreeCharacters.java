package Question2;

import java.util.*;
import java.util.stream.*;

public class StartsWithA_HasThreeCharacters 
{
	public List<String> returnExpected(ArrayList<String> list)
	{
		List<String> result = list.stream().filter(s->(s.startsWith("a") && s.length()==3)).collect(Collectors.toList());
		return result;
	}
}
