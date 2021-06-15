package com.hackerrank;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class ArrayManipulation {
    static long findMaxInArray(long[] arr){
        long tmp = Integer.MIN_VALUE;
        for(long num : arr)
            if(num > tmp)
                tmp=num;
        return tmp;
    }
    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
//size of array - n
//no of queries - m = queries.length
//query - a, b, k - between a and b, ad the value k
        long[] arr = new long[n];
        for(int i = 0; i < queries.length; i++){
            int a = queries[i][0];
            int b = queries[i][1];
            int k = queries[i][2];
            for(int j = a-1; j <= b-1; j++){
                arr[j]+=k;
            }
        }
        return findMaxInArray(arr);
        
        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
            
        }

        long result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
