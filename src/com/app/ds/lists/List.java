package com.app.ds.lists;

import java.util.Comparator;
import java.util.function.Function;

public interface List<E> {
	int size();//returns the size of the list
	int capacity();//returns the current capacity of the list
	void add(E element);//add the element to the list's end
	void add(int position, E element);//add the element at the position
	E remove(E element);//remove element if found
	E fetch(int position);//fetch element at position 
	void insert(E element, int position);//insert element E at the position
	void addAll(E ...args);
	E[] toArray();
	int index(E element);//returns the first index of the element
//	void addAll(List<E> list);
	
	
//	
//	void pop(int position);//remove element at position
//	void pop();//remove the first element 
//	
//	void prepend(E element);//add element to the list's start
//	
//	void extend(E[] list);//extend the list using array. the datatype od the array should e same as E
//	void extend(List<E> list);//extend the list
//	
//	
//	List<E> slice(int start, int numberOfElements);//return the specified range of the elements
//	void reverse();//reverses the list, modifying the original list
//	
//	E min();//return's min and max element
//	E max();
//	
//	E min(Comparator<E> comparator);//returns the max element based on camparisons
//	E max(Comparator<E> comparator);
//	
//	E count(E element);//returns the number of occurances of the element
//	List<E> concat(List<E> list); //concatinates and returns list, does not modify current list
//	
////	void multiply(int factor);//multiply the elemtnt by factor
//	<T> void apply(Function<T, E> function);//applies the given function on every element
//	int index(E element, int occurance);//returns the index of given'th occurance 
//	
//	void clear();//turns this list into an empty list
//	
//	
	
	
	
}
