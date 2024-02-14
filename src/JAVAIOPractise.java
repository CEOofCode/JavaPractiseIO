import java.util.Scanner; //Needed for input

public class JAVAIOPractise {
	
	
	
	public static void main(String[] args) {
		//prints out hello world
		System.out.println("Hello World!");
		
		//variable used for output
		String toPrint = "What Is Your Name Favourite Colour?";
		
		System.out.println(toPrint);
		
		//input Example
		Scanner input = new Scanner(System.in);
		
		String colourChoice = input.nextLine();
		
		System.out.println("My Favourite Colour is " + colourChoice);
	}
	
	
	
}
