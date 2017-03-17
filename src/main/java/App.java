import java.io.Console;

public class App {

  public static void main(String[] args) {
    boolean isOver = false;

    Console myConsole = System.console();
    System.out.println("Welcome, lets plan a party!");
    System.out.println("What would you like to plan first?");
    while(!isOver) {
      System.out.println("Type 'guests', 'food', 'drinks', 'entertainment', or 'quit'.");
      String choice = myConsole.readLine();
      if(choice.equals("quit")) {
        System.out.println("Thanks, have a good day!");
        isOver = true;
      } else if (choice.equals("guests")) {
        System.out.println("Alright, so how many guests are coming?");
        int guestAmount = Integer.parseInt(myConsole.readLine());
      } else if (choice.equals("food")) {
        System.out.println("What type's of food would you like to bring?");
        System.out.println("Type 'add' to add a food, 'remove' to remove a food, and 'continue' to move on.");
        String foodChoice = myConsole.readLine();
        
        if(foodChoice.equals("add")) {

        } else if(foodChoice.equals("remove")) {

        } else if(foodChoice.equals("continue")) {

        } else {

        }

      }
    }
  }
}
