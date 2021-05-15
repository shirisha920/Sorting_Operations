package factory.mobile;

import java.util.Scanner;

public class Queue_Operations {
	static int[] queue = new int[5]; 
	static int front = 0;
	static int rear = 0;
	static void menu() {
	System.out.println("Choose any : ");
	String m = "1. Insert \n";
	       m += "2. Delete \n";
	       m += "3. display \n";
	       m += "4.Quit \n";
	System.out.println(m);
	}
	
	static boolean isEmpty() {
		boolean b = false;
		if(front == rear){
			b = true;
		}
		return b;
	}
	static boolean isFull() {
		boolean b = false;
		if(rear == queue.length){
			b = true;
		}
		return b;
	}
	static void insert(int element) {
		if(isFull()) {
			System.out.println("queue is over flow ");
		}
		else {
			queue[rear++] = element ;
			System.out.println("inserted");
		}
	}
	static void delete() {
		if(isEmpty()) {
			System.out.println("queue is empty");
		}
		else {
			System.out.println("deleted element is "+ queue[front]);
			for(int i =front ; i < rear - 1 ; i++) {
				queue[i] = queue[i+1];
			}
			rear--;
		}
	}
	static void display() {
		if(isEmpty()) {
		System.out.println("queue is empty");
		}
		else {
			System.out.println("queue elements are :");
			for(int i = front ; i < rear ;i ++) {
				System.out.println(queue[i]);
			}
		}
	}
	static void accept() {
		System.out.println("enter element to insert");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(; ;) {
		menu();
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			accept();
			insert(sc.nextInt());
			break;
		case 2:
			delete();
			break;
		case 3:
			display();
			break;
		case 4:
			System.exit(0);
			break;
		default:
			System.out.println("invalid option");
		}
	}
	}

}
