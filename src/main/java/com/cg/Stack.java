/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.cg;

public class Stack {
	private LinkedList list;

	public Stack() {
		list = new LinkedList();
	}

	public void push(INode node) {
		list.add(node);
	}

	public INode pop() {
		return list.pop();
	}

	public INode peek() {
		return list.getHead();
	}

	public int getSize() {
		return list.size();
	}

	public String toString() {
		return list.toString();
	}
}
