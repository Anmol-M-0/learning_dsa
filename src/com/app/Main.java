package com.app;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		Object o = (Object)new String("asjdflkja;lfj");
		System.out.println(o.toString());//runtime polymorphism
		System.out.println(16 << 1);
		Double tmp= Math.pow(4, 2);
		int loopLen = tmp.intValue() + 1;
		System.out.println(loopLen);
		
		Function<Integer, Integer> func = (x)-> x*2;
		System.out.println(func.apply(2));
		BiFunction<Integer, Integer, Integer> adderFunc = (x, y) -> x+y;
		System.out.println(adderFunc.apply(2,  4));
//		try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")))){//null ptr exception
//		int arCount = Integer.parseInt(scanner.nextLine().trim());
//
//        int[] ar = new int[arCount];
//
//        String[] arItems = scanner.nextLine().split(" ");
//
//        for (int arItr = 0; arItr < arCount; arItr++) {
//            int arItem = Integer.parseInt(arItems[arItr].trim());
//            ar[arItr] = arItem;
//        }
//        Function<int[], Integer> solver = (x) -> {
//            int sol = 0;
//            for(Integer i : x)
//                sol = sol + i;
//            return sol;
//        };
//        int result = solver.apply(ar);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//		}
	}
}
