import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.knowm.xchart.BitmapEncoder;
import org.knowm.xchart.BitmapEncoder.BitmapFormat;
import org.knowm.xchart.QuickChart;
import org.knowm.xchart.XYChart;

public class Executor {
	 static ArrayList<Integer> value = new ArrayList<Integer>();
	 static ArrayList<Double> execTime = new ArrayList<Double>();
	 static ArrayList<Double> totalData = new ArrayList<Double>();
	 static PrintStream outone = null;

	    public static void main(String[] args){
	    	listFilesAndFolders("Pancake_Sort");
	    //	for (int i = 0; i < 10; i++) {
			//	value.add(new Random().nextInt(200 - 1 + 1) + 1);
		//	}
	    }
	    
	    public static void execute() {
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
			System.out.println("- " + (double)((milliseconds / 1000) % 60) + " seconds");
			
	    }
	    
	    public static void listFilesAndFolders(String directoryName){
	        File directory = new File(directoryName);
	        //get all the files from a directory
	        File[] fList = directory.listFiles();
	        HashMap<Double,ArrayList<Double>> data=new HashMap<Double,ArrayList<Double>>();
	        for (File file : fList){
	        	value.clear();
	        	try {
					outone=new PrintStream(new FileOutputStream("result/"+file.getName()+".txt"));
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	        	//System.setOut(outone);
	        	//System.out.println("File Name :"+file.getName());
	        	FileInputStream fstream=null;
				try {
					fstream = new FileInputStream(file.getAbsolutePath());
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        	BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

	        	String strLine;
	        	Double tempTotal=(double) 0;
	        	//Read File Line By Line
	        	try {
					while ((strLine = br.readLine()) != null)   {
						if(strLine.indexOf("Total of data : ")>-1) {
							String total=strLine.split(" ")[4];
							//System.out.println(nanoseconds);
							if(!(totalData.indexOf(Double.parseDouble(total))>-1)) {
								totalData.add(Double.parseDouble(total));
							}
							tempTotal=Double.parseDouble(total);
						}
						if(strLine.indexOf("nanoseconds")>-1) {
							String nanoseconds=strLine.split(" ")[1];
							if(data.get(tempTotal) == null) {
								data.put(tempTotal,new ArrayList<Double>());
							}
							data.get(tempTotal).add(Double.parseDouble(nanoseconds));
						}
					  // Print the content on the console
					  //System.out.println (strLine);
						//value.add(Integer.parseInt(strLine));
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
	        	//execute();
	            //System.out.println(file.getName());
	        	//break;
	        }
	        //HashMap<Double,Double> resultData=new HashMap<Double,Double>();
	        Collections.sort(totalData);
	        for(int i=0;i<totalData.size();i++) {
        		ArrayList<Double>temp=data.get(totalData.get(i));
        		Double tempTimeTotal=0.00;
        		for(Double temporary:temp) {
        			tempTimeTotal+=temporary;
        		}
        		tempTimeTotal=tempTimeTotal/(double)temp.size();
        		//resultData.put(totalData.get(i), tempTimeTotal);
        		execTime.add(tempTimeTotal);
        		//System.out.println(totalData.get(i));
        		System.out.println(tempTimeTotal);
	        }
	        double[] totalx=totalData.stream().mapToDouble(Double::doubleValue).toArray();
	        double[] totaly=execTime.stream().mapToDouble(Double::doubleValue).toArray();
        	 XYChart chart = QuickChart.getChart("Shell Sort", "Total Data", "Execution Time", "y(x)", totalx,totaly);
        	
        	// try {
        		  //BitmapEncoder.saveBitmapWithDPI(chart, "./Shell_Sort_300_DPI", BitmapFormat.PNG, 300);
		//	} catch (IOException e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();
		//	}
	    }
	    
	 
}
