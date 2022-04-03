import java.util.Scanner;

public class NameAndAge {
	public static void main(String[] args) {
		// this prints one argument
		// that should be a instruction like:
		// "Please type name and age" with the quotes
		String prompt = args[0];
		System.out.println(prompt);

		// this initializes the variables
		// name as String and age as Int
		String name;
		int age;

		// this starts the scanner of
		// the inputs in
		// the command line
		// the stream is stored in the
		// variable "in"
		Scanner in = new Scanner(System.in);

		// this scans the first two lines,
		// first for the name, and then
		// for the age, also checking their
		// type, i.e., Line or Int
		name = in.nextLine();
		age = in.nextInt();

		// this prints out the name
		// and age entered in nice format
		System.out.println("Hello, " + name + " nice to meet you\nYou are " + age + " years old!");
	}
}
