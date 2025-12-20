package com.code.samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActiveCustomerList {
	
	/*Find the list of customers who are contributing more the 5% of total volume and arrange them in alphabetical order*/
	
	public static List<String> activeCustomers(List<String> customers){
		List <String> returnList = new ArrayList<String>();
		Map <String, Integer> CustomerCountMap = new HashMap<String, Integer> ();
		Collections.sort(customers);
		int total = customers.size();
		
		for(String customer: customers) {		
			if(CustomerCountMap.containsKey(customer)) {
				int count =  CustomerCountMap.get(customer);
				count += 1;
				CustomerCountMap.put(customer, count);
			} else {
				CustomerCountMap.put(customer, 1);
			}
		}
		
		for(String customer: CustomerCountMap.keySet()) {
			int count =  CustomerCountMap.get(customer);
			double activityPercentage = (double)count/total * 100;
			System.out.println(customer);
			System.out.println(activityPercentage);
			if(activityPercentage >= 5) {
				returnList.add(customer);
			}
		}
		
		Collections.sort(returnList);
		return returnList;
		
	}
	
	public static void main(String[] args) {
		String [] arr = {"Omega",
				"Alpha",
				"Omega",
				"Alpha",
				"Omega",
				"Alpha",
				"Omega",
				"Alpha",
				"Omega",
				"Alpha",
				"Omega",
				"Alpha",
				"Omega",
				"Alpha",
				"Omega",
				"Alpha",
				"Omega",
				"Alpha",
				"Omega",
				"Beta",
				"Teta"};
		List<String> customers = Arrays.asList(arr); 
		System.out.println(activeCustomers(customers));
	}

}
