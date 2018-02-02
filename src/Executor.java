import java.util.LinkedList;
import java.util.Random;

public class Executor {
	 static LinkedList<Integer> value = new LinkedList<Integer>();

	    public static void main(String[] args){
	        for (int i = 0; i < 10; i++) {
				value.add(new Random().nextInt(200 - 1 + 1) + 1);
			}
			System.out.println("Data before sorted :");
			System.out.println(value);
			long startTime = System.nanoTime();    
			//SortingCollection.pancakeSort(value);
			//SortingCollection.shellSort(value);
			//SortingCollection.oyelamiSort(value, value.size());
			SortingCollection.aviSort(value);
			long endTime = System.nanoTime();
			System.out.println("Data after sorted :");
			System.out.println(value);
			System.out.println("Execution Time : ");
			System.out.println("- " + (endTime - startTime) + " nanoseconds");
			
			
	    }
}
