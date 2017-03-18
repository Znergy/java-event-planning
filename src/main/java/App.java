import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {

  public static void main(String[] args) {
    boolean isOver = false;
    boolean isDoneWithChoice = false;
    List<String> foodArrayList = new ArrayList<String>();
    List<String> drinkArrayList = new ArrayList<String>();

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
        System.out.println("Thanks, choose another option.");
      } else if (choice.equals("food")) {
        System.out.println("What type's of food would you like to bring?");
        while(!isDoneWithChoice) {
          System.out.println("Type 'add' to add a food, 'remove' to remove a food, and 'back' to go back to the options menu.");
          String foodChoice = myConsole.readLine();

          if(foodChoice.equals("add")) {
            System.out.println("Type a food");
            String foodToAdd = myConsole.readLine();
            foodArrayList.add(foodToAdd);
            System.out.println(foodToAdd + ", was added to the list.");
          } else if(foodChoice.equals("remove")) {
            System.out.println("Here's a list of our items so far.");
            for(int i=1; i <= foodArrayList.size(); i++) {
              System.out.println( i + ") " + foodArrayList.get(i));
            }
            System.out.println("Type the number for the item you would like to remove.");
            int foodToRemove = Integer.parseInt(myConsole.readLine());
            foodArrayList.remove(foodToRemove);
            System.out.println(foodToRemove + ", was removed from the list.");
          } else if(foodChoice.equals("back")) {
            System.out.println("Thanks, choose another option.");
            isDoneWithChoice = true;
          } else {
            System.out.println("Invalid input");
          }
        }
      }
    }
  }
}
