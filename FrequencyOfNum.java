package Grooming;
import java.util.*;
import java.util.function.Function;
import java.util.stream.*;
public class FrequencyOfNum {
	public static void main(String[] args) {
		int arr[]= {2,4,5,2,3,4,5,6,6,7};
		for(int i=0;i<arr.length;i++) {
			boolean  visited=false;
			for(int j=0;j<i;j++) {
				if (arr[i]==arr[j]) {
					visited=true;
					break;
				}
			}
			if(!visited) {
				int count=1;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						count++;
					}				
				}
				System.out.println(arr[i]+" -> "+count);
			}
		}
		int arr1[]= {3,3,5,2,3,1,5,6,6,5};
		        // Use streams to box the array and count frequencies
		        Map<Integer, Long> freqMap = Arrays.stream(arr1)
		                                           .boxed()
		                                           .collect(Collectors.groupingBy(
		                                               num -> num,
		                                               Collectors.counting()
		                                           ));	      
		        freqMap.forEach((key, value) -> 
	            System.out.println(key + " occurs " + value + " times"));
		        System.out.println("---------------------------------");
		        
		        // Print the frequency map	
		        System.out.println("programming");
		                String input = "programming";		              
		                Map<Character, Long> freqMap1 = input.chars() 
		                                                    .mapToObj(c -> (char) c) 
		                                                    .collect(Collectors.groupingBy(
		                                                        ch -> ch,
		                                                        Collectors.counting()
		                                                    ));		              
		                freqMap1.forEach((key, value) -> 
		                    System.out.println(key + " occurs " + value + " times"));
		            }		        
		    }
		

	


