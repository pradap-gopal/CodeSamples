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

public class UserNamePossibleChange {

    /*
     * Complete the 'possibleChanges' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY usernames as parameter.
     */

    public static List<String> possibleChanges(List<String> usernames) {
    // Write your code here
    List<String> returnList = new ArrayList<String> ();
    for(String userName : usernames){
        char [] nameChars = userName.toCharArray();
        boolean isYes = false;
        for(int j=0; j< nameChars.length; j++){
            for(int i = j+1; i <nameChars.length; i++){            
                if(nameChars[i]<nameChars[j]){
                    //System.out.println(nameChars[i]);
                    //System.out.println(nameChars[j]);
                    isYes =true;
                    break;
                }
            }
            if(isYes){
                break;
            }
        }
        if(isYes){
            returnList.add("YES");
        } else {
            returnList.add("NO");
            System.out.println(userName);
            System.out.println("NO");
        }
       // System.out.println(returnList);
    }
    
    return returnList;
    }

	
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int usernamesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> usernames = IntStream.range(0, usernamesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<String> result = possibleChanges(usernames);

        bufferedWriter.write(
            result.stream()
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}