import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

public class Executor {
	 static ArrayList<Integer> value = new ArrayList<Integer>();
	 static PrintStream outone = null;
	 static String sortName = "Avi_Sort";

	    public static void main(String[] args){
	    	listFilesAndFolders("test_case");
	    //	for (int i = 0; i < 10; i++) {
			//	value.add(new Random().nextInt(200 - 1 + 1) + 1);
		//	}
	    }
	    
	    public static void execute() {
	    	System.out.println("Sort Algorithm Name : "+sortName);
	    	System.out.println("Total of data : "+value.size());
	    	System.out.println("Data Before Sorted :");
	    	System.out.println(value);
			long startTime = System.nanoTime();
			//SortingCollection.pancakeSort(value);
			//SortingCollection.shellSort(value);
			//SortingCollection.oyelamiSort(value, value.size());
			SortingCollection.aviSort(value);
			long endTime = System.nanoTime();
			long estimatedTime = (endTime - startTime);
			System.out.println("Data after sorted :");
			System.out.println(value);
			System.out.println("Execution Time : ");
			System.out.println("- " + estimatedTime + " nanoseconds");
			double milliseconds=(estimatedTime / 1000000.0);
			System.out.println("- " + milliseconds + " milliseconds");
			System.out.println("- " + (double)((milliseconds / 1000)) + " seconds");
			
	    }
	    
	    public static void listFilesAndFolders(String directoryName){
	        File directory = new File(directoryName);
	        //get all the files from a directory
	        File[] fList = directory.listFiles();
	        for (File file : fList){
	        	value.clear();
	        	try {
					outone=new PrintStream(new FileOutputStream("result/"+sortName+"/"+file.getName()+".txt"));
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	        	System.setOut(outone);
	        	System.out.println("File Name :"+file.getName());
	        	FileInputStream fstream=null;
				try {
					fstream = new FileInputStream(file.getAbsolutePath());
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        	BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

	        	String strLine;

	        	//Read File Line By Line
	        	try {
					while ((strLine = br.readLine()) != null)   {
					  // Print the content on the console
					  //System.out.println (strLine);
						value.add(Integer.parseInt(strLine));
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	        	//Close the input stream
	        	try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        	execute();
	            //System.out.println(file.getName());
	        }
	    }
}
