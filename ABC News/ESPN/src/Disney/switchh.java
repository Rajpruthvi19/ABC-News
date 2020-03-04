package Disney;

import java.util.Scanner;

public class switchh {
 public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
			System.out.println("Please enter the command");
			String text = input.nextLine();
			
			switch (text) {
			case "start":
			System.out.println("Machine On");
			break;
			
			case "stop":
				System.out.println("Machine off");
				break;
				
				default:
					System.out.println("wrong command");
			}
}
}
