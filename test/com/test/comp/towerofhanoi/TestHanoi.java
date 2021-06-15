package com.test.comp.towerofhanoi;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.jupiter.api.Test;

import com.app.comp.towerofhanoi.Container;
import com.app.comp.towerofhanoi.Hanoi;

class TestHanoi {
    List<Hanoi> hanois;
	public TestHanoi() {
		hanois = new LinkedList<>();
		for(int i = 1; i <= 10; i++) 
			hanois.add(new Hanoi(i));
	}
	@Test
	final void test() {
		int comparing = hanois.get(0).compareTo(hanois.get(1));
		System.out.println(comparing);
//		hanois.forEach(System.out::println);
		Container<AtomicInteger> tracker = new Container<>();
		hanois.stream().map(hanoi-> hanois)
//						.flatMap(hlist-> hlist.stream())
						.forEach(hlist->{
							for(Hanoi h : hlist)
								System.out.println(hlist.get(tracker.get()).compareTo(h));
							tracker.increment();
						}
						);
		assertTrue(comparing < 0);
	}

}
