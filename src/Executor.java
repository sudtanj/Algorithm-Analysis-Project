import java.util.LinkedList;
import java.util.Random;

public class Executor {
	 static LinkedList<Integer> value = new LinkedList<Integer>();

	    public static void main(String[] args){
	        for (int i = 0; i < 10; i++) {
				value.add(new Random().nextInt(50 - 1 + 1) + 1);
			}
			System.out.println(value);
			SortingCollection.pancakeSort(value);
			System.out.println(value);
	    }
}
