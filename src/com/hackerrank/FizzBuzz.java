package com.hackerrank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



class Result {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
    // Write your code here
    for(int i = 1; i <= n; i++){
    String ans = "";
        if(i%3 == 0)
            ans += "Fizz";
        if(i%5 == 0)
            ans+="Buzz";
        if(ans.equals("")){
            System.out.println(i);
        } else {
            System.out.println(ans);
            
        }
        
    }

    }

}

public class FizzBuzz {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

        bufferedReader.close();
    }
}
