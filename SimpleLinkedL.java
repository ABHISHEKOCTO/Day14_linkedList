package com.linkedList;
/*UC1
 * Lets create a

simple Linked List
of 56, 30 and 70
@author: abhishek
*/
public class SimpleLinkedL {
	
		Node head;

		class Node{
			int data;
			Node next;
			Node(int data) {
				this.data = data;
				this.next = null;
			}
		}
		public void addFirst(int data) {
			//checking corner case
			
			Node newNode = new Node(data);
			if(head==null) {
				head = newNode;
				return;
				
			}
			newNode.next = head;
			head = newNode;
		}
	//creating print method	
		public void printlist() {

			if (head == null) {
				System.out.println("list is empty");
				return;
			}
			Node currNode = head;
			while (currNode != null) {
				System.out.print(currNode.data+ "-->");
				currNode = currNode.next;
			}
			System.out.println("Null");
			}
			}

	
	

