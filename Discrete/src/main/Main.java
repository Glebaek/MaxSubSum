package main;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
	
	public static void display(List<Integer> array, int length)
	{
		for (int i = 0; i < length; i++) {
			System.out.print(array.get(i) + " ");
		}
		System.out.println("");
	}
	
	public static void insert(int element, List<Integer> array)
	{
		array.add(element);
	}
	
	public static void delete(int index, List<Integer> array)
	{
		array.remove(index);
	}
	
	public static int maxSubSum(List<Integer> array, int length)
	{
		int maxSum = -10000;
		int sum = 0;
		for (int i = 0; i < length; i++) 
			for(int j = 0; j < length; j++) {
				
				sum = 0;
				for(int k = i; k < j; k++) {
					
					sum += array.get(k);
				}
				if(sum > maxSum)
					maxSum = sum;
			}
		return maxSum;
	}
	
	public static void main(String[] args) throws IOException{
		
		
		List<Integer> array = new ArrayList<Integer>();
		final Random random = new Random();
		int length = 1000; 
	
		for (int i = 0; i < length; i++) 
			array.add(random.nextInt(100) - (100/2));			
		
		display(array, length);
		
		long startTime = System.currentTimeMillis();
		System.out.println(maxSubSum(array, length));
		long timeSpent = System.currentTimeMillis() - startTime;
		
		System.out.println("time in progress: " + timeSpent + " miliseconds");
	}

}
