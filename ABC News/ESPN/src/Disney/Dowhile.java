package Disney;

import java.util.Scanner;

public class Dowhile {
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int value = 1;
    do {
    	System.out.println("Enter the value");
    	value = scanner.nextInt();

    }
	while (value != 5);
    System.out.println("got 5");
	}
}