package com.hackerrank;
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



public class LeftRotation {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.rotateLeft(d, arr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
    static class Result {

        /*
         * Complete the 'rotateLeft' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts following parameters:
         *  1. INTEGER d
         *  2. INTEGER_ARRAY arr
         */

        public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        int size = arr.size();
        List<Integer> sol = new ArrayList<>(size);
        System.out.println(size);
        for(int i = 0; i < size; i++)
        	sol.add(i, 0);
        System.out.println();
        sol.forEach(System.out::print);
        
        System.out.println();
        System.out.println(sol.size());
        System.out.println();
        for(int i = 0; i < size; i++){
        	System.out.println((i+(size-d))%size);
            sol.set((i+(size-d))%size, arr.get(i));
        
        }
        System.out.println();
        sol.forEach(System.out::print);
        System.out.println();
        return sol;
        }

    }
}
