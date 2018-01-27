import java.util.LinkedList;
import java.util.Random;

public class Executor {
	 static LinkedList<Integer> value = new LinkedList<Integer>();

	    public static void main(String[] args){
	        for (int i = 0; i < 1000; i++) {
				value.add(new Random().nextInt(200 - 1 + 1) + 1);
			}
			System.out.println(value);
			long startTime = System.currentTimeMillis();
			SortingCollection.pancakeSort(value);
			long endTime = System.currentTimeMillis();
			System.out.println(value);
			System.out.print("Execution Time : ");
			System.out.println((endTime - startTime) + " milliseconds");
			
	    }
}
