package com.practice.datastructure.linkedlist;

import java.util.Scanner;

import com.practice.datastructure.linkedlist.mergeSortedLinkedLists.SinglyLinkedList;
import com.practice.datastructure.linkedlist.mergeSortedLinkedLists.SinglyLinkedListNode;

/**
 * @author fq63
 * 
 *         You’re given the pointer to the head node of a linked list and a
 *         specific position. Counting backwards from the tail node of the
 *         linked list, get the value of the node at the given position. A
 *         position of 0 corresponds to the tail, 1 corresponds to the node
 *         before the tail and so on.
 *         
 *
 */
public class GetNodeValue {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		SinglyLinkedList llist = new SinglyLinkedList();

		System.out.print("Enter length of first linked list");

		int llistCount = s.nextInt();

		System.out.println("Enter elements of linked list");
		for (int i = 0; i < llistCount; i++) {
			llist.insertNode(s.nextInt());
		}

		System.out.println("Enter postion of node from end of linked list");
		int positionFromTail = s.nextInt();
		System.out.println("The element at position " + positionFromTail + " from tail" + " is "
				+ getNode(llist.head, positionFromTail));
		s.close();
	}

	static int getNode(SinglyLinkedListNode head, int positionFromTail) {

		SinglyLinkedListNode pointer = head;
		int pointerPosition = 0;

		while (head.next != null) {
			head = head.next;
			if (pointerPosition >= positionFromTail) {
				pointer = pointer.next;
			} else {
				pointerPosition++;
			}
		}

		return pointer.data;
	}

}
