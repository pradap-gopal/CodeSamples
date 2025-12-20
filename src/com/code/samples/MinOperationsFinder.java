package com.code.samples;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class MinOperationsFinder {


    /*
     * Complete the 'minOperations' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr
     *  2. INTEGER threshold
     *  3. INTEGER d
     */

    public static int minOperations(List<Integer> arr, int threshold, int d) {

    int operationCounter = 0;
    boolean foundMinOperations = false;
    while(!foundMinOperations){
        //for(int i=0; i < arr.size(); i++){
            arr.sort(Collections.reverseOrder());
            int divident = arr.get(0);
            int result = Math.floorDiv(divident, d);
            arr.remove(0);
            arr.add(0, result);            
         
 //           System.out.println(arr);
            operationCounter++;
            int thresholdCouter = 1;
            for(int j=0; j < arr.size(); j++){                
                for(int k = j+1; k< arr.size(); k++){
                if(arr.get(j) == arr.get(k)){
                    thresholdCouter++;
                }
                if(thresholdCouter >= threshold){
                    foundMinOperations = true;
                    break;
                }
              }
              if(thresholdCouter >= threshold){
                    foundMinOperations = true;
                    break;
              }
            }
            if(thresholdCouter >= threshold){
                foundMinOperations = true;
                break;
            }
        }       
    //}
        return operationCounter;
    }
    
    public static void main(String[] args) throws IOException {

    	List <Integer> arr = new ArrayList<Integer> ();
    	arr.add(61);
    	arr.add(33);
    	arr.add(24);
    	arr.add(32);
        int result = minOperations(arr, 2, 2);
        System.out.println(result);

    }

}

