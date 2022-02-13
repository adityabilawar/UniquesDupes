import static java.lang.System.*;
import java.util.*;

public class DupRunner
{
	public static void main( String args[] )
	{
		String list1 = "a b c d e f g h a b c d e f g h i j k";
		String list2 = "one two three one two three six seven one two";
		String list3 = "1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6";
		UniquesDupes a = new UniquesDupes();
		Set<String> uniques1  = a.getUniques(list1);
		Set<String> dupes1  = a.getDupes(list1);
		System.out.println("Original List: " + list1);
		System.out.println("Uniques: " + uniques1);
		System.out.println("Dupes : " + dupes1);
		
		System.out.println("");
		System.out.println("");
		
		UniquesDupes b = new UniquesDupes();
		Set<String> uniques2  = a.getUniques(list2);
		Set<String> dupes2  = a.getDupes(list2);
		System.out.println("Original List: " + list2);
		System.out.println("Uniques: " + uniques2);
		System.out.println("Dupes : " + dupes2);
		
		System.out.println("");
		System.out.println("");
		
		UniquesDupes c = new UniquesDupes();
		Set<String> uniques3  = a.getUniques(list3);
		Set<String> dupes3  = a.getDupes(list3);
		System.out.println("Original List: " + list3);
		System.out.println("Uniques: " + uniques3);
		System.out.println("Dupes : " + dupes3);
		
		System.out.println("");
		System.out.println("");
	}
}