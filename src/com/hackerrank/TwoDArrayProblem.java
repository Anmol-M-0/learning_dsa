package com.hackerrank;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;;

public class TwoDArrayProblem {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int q = Integer.parseInt(firstMultipleInput[1]);

		List<List<Integer>> queries = new ArrayList<>();

		IntStream.range(0, q).forEach(i -> {
			try {
				queries.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
						.map(Integer::parseInt).collect(toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		List<Integer> result = Result.dynamicArray(n, queries);

		bufferedWriter.write(result.stream().map(Object::toString).collect(joining("\n")) + "\n");

		bufferedReader.close();
		bufferedWriter.close();
	}

	private static interface Result {

		/*
		 * Complete the 'dynamicArray' function below.
		 *
		 * The function is expected to return an INTEGER_ARRAY. The function accepts
		 * following parameters: 1. INTEGER n 2. 2D_INTEGER_ARRAY queries
		 */
//    	static int[][] growArray(int[][] arr){
//    		int[][] ret =  new int[arr.length*2][arr[0].length];
//    		for(int i  = 0; i < arr.length ; i++)
//    			ret[i] = arr[i];
//    		return ret;
//    	}
//    	static int[][] generateArray(int rows) {
//    		return new int[rows][];
//    	}
//        static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
		// Write your code here
//        	int[][] arr = generateArray(n);
//        	int lastAns = 0;
//        	int x = 0;
//        	int lastAnswer = 0;
//        	int idx = index(x, n, lastAnswer);
//        	use arraylist
		/*
		 * query 1 -> Query: 1 x y Find the list within arr at index idx = ((x ^
		 * lastAnswer) % n). Append the integer y to the arr[idx] .
		 */
//        	return null;
//        }
		static int index(int x, int lastAnswer, int n) {
			return (x^lastAnswer)%n;
		}
//		static void append(int y, int[][] arr) {
//		}
		static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
//    	         Write your code here
			/*
			 * Create a 2-dimensional array, arr, of n empty arrays. All arrays are zero indexed.
				Create an integer, lastAns, and initialize it to 0.
				There are 2 types of queries:
			 */
			List<List<Point<Integer>>> dataQueries = new ArrayList<>();
			Counter counterY = new Counter();
			for(int i = 0; i < queries.size(); i++) {
				Counter counterX = new Counter();
				List<Point<Integer>> list = queries.get(i).stream()
						.map(q -> new Point<Integer>(counterX.getAndIncrement(), counterY.get(), q))
						.collect(Collectors.toList());
				dataQueries.add(list);
				counterY.increment();
				counterX.reset();
			}
			counterY.reset();
			Counter ct = new Counter();
			int  len = dataQueries.get(0).size();
			dataQueries.stream().flatMap(l -> l.stream()).forEach(p -> {
				
				System.out.print(p);
				ct.increment();
				if(ct.get() == len) {
					ct.reset();
					System.out.println();
				}
			});
			List<List<Integer>> arr = new ArrayList<>(n);
			int lastAns = 0;
			/*
			 * query 1 -> Query: 1 x y 
			 * Find the list within arr at index idx = ((x ^ lastAnswer) % n). 
			 * Append the integer y to the arr[idx] .
			 */
			int y = 0;
			int x = 0;
			query1(arr, lastAns, n);
			/*
			 * query 2 -> Query: 2 x y 
			 * Find the list within arr at index idx = ((x ^ lastAns) % n).
			 * Find the value of element y % size(arr[idx]) where size is the 
			 * number of elements in arr[idx]. assign th evalue to lastAns. 
			 * Print the new value of lastAns on a new line
			 */
			return null;
		}
		static void query1(List<List<Integer>> arr, int lastAns, int n) {
			int idx = 0;
			for(int x = 0; x < n; x++) {
				
				idx = (x ^ lastAns) % n;
				arr.get(idx).add(0);
				
				
				
			}
		}
	}
	static class Point<T>{
		private int x;
		private int y;
		private T data;
		public Point(int x,int  y, T data) {
			this.data = data;
			this.y = y;
			this.x = x;
			
		}
		public int getX() {
			return x;
		}
		public int getY() {
			return y;
		}
		public T getData() {
			return data;
		}
		
	}
	static class Counter{
		private int count;
		public Counter() {
			count = 0;
		}
		public Counter(int start) {
			count = start;
		}
		public void increment() {
			count++;
		}
		public int get() {
			return count;
		}
		public int getAndIncrement() {
			int count = this.count;
			this.count++;
			return count;
		}
		public int incrementAndGet() {
			count++;
			return count;
		}
		public void reset() {
			count = 0;
		}
	}
}
