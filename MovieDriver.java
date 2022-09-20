import java.util.Scanner;

public class MovieDriver {
public static void main(String [] args) {
	
	Scanner stdin = new Scanner(System.in);  

	Movie Driver = new Movie();
	char temp = 'Y'; 
	while(temp == 'y' || temp == 'Y') {
	System.out.print("Enter the title of the movie: ");
	String theTitle = stdin.nextLine();
	Driver.setTitle(theTitle);
	
	System.out.print("Enter the rating of the movie: ");
	String theRating = stdin.nextLine();
	Driver.setRating(theRating);
	
	System.out.print("Enter the number of Tickets sold at the theater: ");
	int theSoldTickets = stdin.nextInt();
	Driver.setSoldTickets(theSoldTickets);
	
	System.out.println(Driver.toString());
	String filler;
	System.out.print("Do you want to enter a new movie(Y or N): ");
	filler = stdin.nextLine();
	filler = stdin.nextLine();
	temp = filler.charAt(0);
	 //temp = stdin.next();
	
	}
	System.out.println("Goodbye");
	stdin.close();
}
}
