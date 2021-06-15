package com.app.ds.lists;

public class ArrayList<E> implements List<E> {
	private E[] list;
	int size;

	public ArrayList() {
		list = (E[]) new Object[10];
		size = 0;
	}

	public ArrayList(E... args) {
		list = args;
		size = args.length;
	}

	@Override
	public E[] toArray() {
		return list;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public int capacity() {
		return list.length;
	}

	@Override
	public void add(E element) {
		list[size] = element;
		size = size + 1;
	}

	/**
	 * Adds the specified element at the specified position. It is recomended to not
	 * exceed the {@link ArrayList#capacity()}, though the method supports resize.
	 * 
	 * @param position - position to add element to
	 * @param element  - element
	 * @throws RuntimeException - when the element can not be added further -
	 *                          {@link Integer#MAX_VALUE} reached
	 */
	@Override
	public void add(int position, E element) {
		if (position > size && position < list.length) {
			list[position] = element;
			return;
		}
		if (position < size) {
			if (list.length < size + 1) {
				if (size < Integer.MAX_VALUE) {
					resize(size + 10);
				} else {
					throw new RuntimeException(
							"maximum possible capacity reached, operation was not performed, max possible size "
									+ Integer.MAX_VALUE + " reached.");
//					System.out.println("maximum possible capacity reached, operation was not performed");
//					return;
				}
				int end = position;
				int start = size;

				reverseSweep(start, end);// vacate the position for element
				list[position] = element;// insert the element
			}

		}
	}

	private void reverseSweep(int start, int end) {// creates a reverse sweep - moves the elements by 1 step; vacates 1
													// position
													// start < end; modifies the list
		for (int i = start; i > end; i = i - 1) {
			list[i] = list[i - 1];
		}
	}

	private void forwardSweep(int start, int end) {// forward sweep 1 position
		for (int i = start; i < end; i++) {
			list[i] = list[i + 1];
		}
		size--;
	}

	/**
	 * @param element - element to find
	 * @return index - of element, or -1 if not found
	 */
	@Override
	public int index(E element) {
		for (int i = 0; i < size; i++)
			if (list[i].equals(element))
				return i;
		return -1;
	}

	/**
	 * @param element - to remove
	 * @return element removed
	 */
	@Override
	public E remove(E element) {
		int index = index(element);
		E el = list[index];
		forwardSweep(index, size);
		return el;
	}

	@Override
	public E fetch(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(E element, int position) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addAll(E... args) {
		int len = args.length;
		int curlen = list.length;
		int mincap = len + size;
		if (curlen < mincap) {
			resize(mincap + 10);
		}
		for (int i = size; i < mincap; i++)
			list[i] = args[i];

	}

	/**
	 * resizes the list to new size
	 * 
	 * @param i is new capacity of list
	 * 
	 */
	private void resize(int i) {
		int curlen = list.length;
		long tmplen = 16;

		for (int count = 0; tmplen < i; count++)
			tmplen = 16 << count;
		if (tmplen > Integer.MAX_VALUE || tmplen < i)
			tmplen = i;
		int dynlen = (int) tmplen;
		if (curlen < i) {
			E[] newlist = (E[]) new Object[dynlen];

			for (int n = 0; n < size; n++)
				newlist[n] = list[n];

			list = newlist;
		}
	}

}
