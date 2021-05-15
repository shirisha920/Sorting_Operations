package factory.mobile;

import java.util.Scanner;

public class StackOperations {
	static int[] stack =new int[5];
	static Scanner sc = new Scanner(System.in);
	static int top = -1;
	static void menu() {
		System.out.println("Choose any : ");
		String m = "1. push \n";
		       m += "2. pop \n";
		       m += "3. display \n";
		       m += "4.Quit \n";
		System.out.println(m);
		
	}
		static void pop() {
			
			if(isEmpty()) {
				System.out.println("stack is empty");
			}
			else {
				int popelement =stack[top];
				top--;
				System.out.println(" element poped from a stack : " + popelement);
				
			}
		}
	
	static void push(int x) {
		
			if(isFull()) {
				System.out.println("Stack is full");
			}
			else {
				++top;
				stack[top] = x;
				System.out.println(x+ " Pushed into Stack " );	
			}
			
	}

	static void display() {
		System.out.println("elements present in stack :");
		for(int i=0; i<=top; i ++) {
			System.out.print(stack[i] + " ");
		}
	}

    static boolean isEmpty() {
		boolean b = false ;
		if(top == -1) {
			b = true ;
		}
		return b;
	}
	static boolean isFull() {
		boolean b = false ;
		if(top == stack.length-1) {
			b = true ;
		}
		return b;	
	}
	 static void accept() {
		System.out.println("enter element to push : ");
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(; ;) {
		menu();
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			accept();
			push(sc.nextInt());
			break;
		case 2:
			pop();
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
