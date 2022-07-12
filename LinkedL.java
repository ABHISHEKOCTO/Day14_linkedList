package com.linkedList;
/* UC2:
 * Ability to create Linked
List by adding 30 and 56
to 70
- Node with data 70 is First Created
- Next 30 is added to 70
- Finally 56 is added to 30
- LinkedList Sequence: 56->30->70

@author: abhishek
 * 
 * */

public class LinkedL {
Node head;

class Node{
	int data;
	Node next;
	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

/* add first
 * creating method to add  
*/
public void addFirst(int data) {
Node newNode = new Node(data);
if(head==null) {
	head = newNode;
	return;
	
}
newNode.next = head;
head = newNode;
}

//add last
public void addLast(int data) {
	Node newNode = new Node(data);
if (head== null) {
	head = newNode;
	return;
	
}
//transversing to last
Node currNode = head;
while(currNode.next != null) {
	currNode = currNode.next;
}
currNode.next = newNode;
}
/*creating method to print
 * 
 * 
 * */
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


