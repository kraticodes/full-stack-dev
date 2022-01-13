import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Assignment1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Username: ");
		// Taking the username as a input from user
		String name = sc.nextLine();

		//For current date & time
		DateTimeFormatter datetime = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();

		//For random unique id
		UUID id = UUID.randomUUID();

		// Displaying the Username, Unique id for user & current date-time.
		System.out.println();
		System.out.println("----------------------------------------------------------------");
		System.out.println("Username: " + name);
		System.out.println("Your one-time unique id: " + "'" + id + "'");
		System.out.println(datetime.format(now));
		System.out.println("----------------------------------------------------------------");
	}
}