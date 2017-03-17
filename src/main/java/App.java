import java.io.Console;

public class App {

  public static void main(String[] args) {
    boolean isOver = false;
    Console myConsole = System.console();

    while(!isOver) {
      System.out.println("Welcome, lets plan a party!");
      System.out.println("What would you like to plan first? Type 'guests', 'food', 'drinks', or 'entertainment'. If at any point you want to quit, type 'quit'.");
      String choice = myConsole.readLine();
      if(choice.equals("quit")) {
        System.out.println("Thanks, have a good day!");
        isOver = true;
      } else if (choice.equals("guests")) {
        System.out.println("Alright, so how many guests are coming?");
        int guestAmount = Integer.parseInt(myConsole.readLine());
      } else if (choice.equals("food")) {
        System.out.println("Alright, so how many guests are coming?");
        
      }
    }
  }
}
