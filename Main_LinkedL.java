package com.linkedList;

public class Main_LinkedL {

	public static void main(String[] args) {
/*UC2 Main method
 * 	
 */
LinkedL list = new LinkedL();
list.addFirst(30);
list.addFirst(56);
list.addLast(70);

list.printlist();
	/*UC1 Main Method
	 * 
	 * creating a simple linkedlist*/
SimpleLinkedL LL = new SimpleLinkedL();
LL.addFirst(70);
LL.addFirst(30);
LL.addFirst(56);

LL.printlist();
		
		// TODO Auto-generated method stub

	}

}
