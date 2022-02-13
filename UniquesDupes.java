import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.ArrayList;
import static java.lang.System.*;

public class UniquesDupes
{
	public static Set<String> getUniques(String input)
	{
		String[] str = input.split(" ");
		Set<String> uniques = new TreeSet<String>();
		for(int i = 0; i < str.length; i++) {
			uniques.add(str[i]);
		}
		return uniques;
	}

	public static Set<String> getDupes(String input)
	{
		String[] str = input.split(" ");
		Set<String> uniques = new TreeSet<String>();
		Set<String> dupes = new TreeSet<String>();
		for(int i = 0; i < str.length; i++) {
			if(uniques.add(str[i])==false)
				dupes.add(str[i]);
		}
		
		return dupes;
	}
}