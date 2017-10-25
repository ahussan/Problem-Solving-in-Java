package Sorting;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by anjalhussan on 5/15/17.
 */
public class UnsortedString {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        // your code goes here
        List<Integer> unsortedint = new ArrayList<Integer>();
        for (int i = 0; i <unsorted.length ; i++) {
            unsortedint.add(Integer.parseInt(unsorted[i]));
        }

        List<Integer> sorted = new ArrayList<Integer>();
        for (Integer x:unsortedint) {


        }
    }
}

/*
for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
 */