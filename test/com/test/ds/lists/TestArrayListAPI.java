/**
 * 
 */
package com.test.ds.lists;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.app.ds.lists.ArrayList;
import com.app.ds.lists.List;

/**
 * @author Anmol Maniyar
 *
 */
class TestArrayListAPI {
	List<Integer> testList ;
	public TestArrayListAPI(){
		testList = new ArrayList<>(1,2,3,4,5,8,5,6,5,54,44,454,1,6,454,1,31,135,555,1,5);
	}
	
	@Test
	final void testInitialised() {
		
		assertNotNull("test failed, obj not initialsed", testList);
	}
	
	/**
	 * Test method for {@link com.app.ds.lists.ArrayList#ArrayList()}.
	 */
	@Test
	final void testArrayList() {
		List<Integer> list = new ArrayList<>();
		assertNotNull("test failed, obj not initialsed", list);
	}

	/**
	 * Test method for {@link com.app.ds.lists.ArrayList#ArrayList(E[])}.
	 */
	@Test
	final void testArrayListEArray() {
		List<Integer> list  = new ArrayList<>(1,2,3,4,5,8,5,6,5,54,44,454,1,6,454,1,31,135,555,1,5);
		assertNotNull("test failed, obj not initialsed", list);
	}

	/**
	 * Test method for {@link com.app.ds.lists.ArrayList#toArray()}.
	 */
	@Test
	final void testToArray() {
		var array = testList.toArray();
		assertTrue(array instanceof Integer[]);
	}

	/**
	 * Test method for {@link com.app.ds.lists.ArrayList#size()}.
	 */
	@Test
	final void testSize() {
		List<Integer> list  = new ArrayList<>(1,2,3,4,5,8,5,6,5,54,44,454,1,6,454,1,31,135,555,1,5);
		assertTrue(list.size() == 21);
	}

	/**
	 * Test method for {@link com.app.ds.lists.ArrayList#capacity()}.
	 */
	@Test
	final void testCapacity() {
		fail("Not yet implemented"); // TODO
	}
//
//	/**
//	 * Test method for {@link com.app.ds.lists.ArrayList#add(java.lang.Object)}.
//	 */
//	@Test
//	final void testAddE() {
//		fail("Not yet implemented"); // TODO
//	}
//
//	/**
//	 * Test method for {@link com.app.ds.lists.ArrayList#add(int, java.lang.Object)}.
//	 */
//	@Test
//	final void testAddIntE() {
//		fail("Not yet implemented"); // TODO
//	}
//
//	/**
//	 * Test method for {@link com.app.ds.lists.ArrayList#remove(java.lang.Object)}.
//	 */
//	@Test
//	final void testRemove() {
//		fail("Not yet implemented"); // TODO
//	}
//
//	/**
//	 * Test method for {@link com.app.ds.lists.ArrayList#fetch(int)}.
//	 */
//	@Test
//	final void testFetch() {
//		fail("Not yet implemented"); // TODO
//	}
//
//	/**
//	 * Test method for {@link com.app.ds.lists.ArrayList#insert(java.lang.Object, int)}.
//	 */
//	@Test
//	final void testInsert() {
//		fail("Not yet implemented"); // TODO
//	}
//
//	/**
//	 * Test method for {@link com.app.ds.lists.ArrayList#addAll(E[])}.
//	 */
//	@Test
//	final void testAddAll() {
//		fail("Not yet implemented"); // TODO
//	}

}
