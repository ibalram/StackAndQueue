/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.cg;

import org.junit.Test;

import com.cg.Stack;

import static org.junit.Assert.*;

public class QueueTest {
	@Test
	public void given3NumbersWhenPushedtoStackShouldBeAddedToTop() {
		Node<Integer> firstNode = new Node<>(50);
		Node<Integer> secondNode = new Node<>(100);
		Node<Integer> thirdNode = new Node<>(120);
		Queue queue = new Queue();
		queue.enqueue(thirdNode);
		queue.enqueue(secondNode);
		queue.enqueue(firstNode);
		assertEquals("120->100->50", queue.toString());
	}
}
