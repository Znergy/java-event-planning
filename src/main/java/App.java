import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {

  public static void main(String[] args) {
    List<String> foodArrayList = new ArrayList<String>();
    List<String> drinkArrayList = new ArrayList<String>();
    Event eventOne = new Event();

    Console myConsole = System.console();
    System.out.println("Welcome, lets plan a party!");
    System.out.println("What would you like to plan first?");
    while(!isOver) {
      boolean isOver = false;
      boolean isDoneWithFood = false;
      boolean isDoneWithDrinks = false;
      boolean isDoneWithEntertainment = false;
      System.out.println("Type 'guests', 'food', 'drinks', 'entertainment', or 'quit'.");
      String choice = myConsole.readLine();
      if(choice.equals("quit")) {
        System.out.println("Thanks, have a good day!");
        isOver = true;
      } else if (choice.equals("guests")) {
        System.out.println("Alright, so how many guests are coming?");
        int guestAmount = myConsole.readLine();
        eventOne.setNumberOfGuests(guestAmount);
        System.out.println("Thanks, choose another option.");
      } else if (choice.equals("food")) {
        System.out.println("What type's of food would you like to bring?");
        while(!isDoneWithFood) {
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
            isDoneWithFood = true;
          } else {
            System.out.println("Invalid input");
          }
        }
      } else if (choice.equals("drinks")) {
        System.out.println("What type's of drinks would you like to bring?");
        while(!isDoneWithDrinks) {
          System.out.println("Type 'add' to add a drink, 'remove' to remove a drink, or 'back' to go return to the options menu.");
          String drinkChoice = myConsole.readLine();

          if(drinkChoice.equals("add")) {
            System.out.println("Type a drink");
            String drinkToAdd = myConsole.readLine();
            drinkArrayList.add(drinkToAdd);
            System.out.println(drinkToAdd + ", was added to the list.");
          } else if(drinkChoice.equals("remove")) {
            System.out.println("Here's a list of our items so far.");
            for(int i=1; i <= drinkArrayList.size(); i++) {
              System.out.println( i + ") " + drinkArrayList.get(i));
            }
            System.out.println("Type the number for the item you would like to remove.");
            int drinkToRemove = Integer.parseInt(myConsole.readLine());
            drinkArrayList.remove(drinkToRemove);
            System.out.println("Drink item #" + drinkToRemove + " , was removed from the list.");
          } else if(drinkChoice.equals("back")) {
            System.out.println("Thanks, choose another option.");
            isDoneWithDrinks = true;
          } else {
            System.out.println("Invalid input");
          }
        }
      } else if (choice.equals("entertainment")) {
        System.out.println("Alright, what entertainment do you want?");
        while(!isDoneWithEntertainment) {
          System.out.println("Type 'music', 'comedian', 'other', or 'back' to go return to the options menu.");
          String eChoice = myConsole.readLine();
          if(eChoice.equals("music")) {
            System.out.println("We have three choices for music.");
            System.out.println("Type 'rock', 'rap', or 'country'.");
            String musicChoice = myConsole.readLine();
            eventOne.setEntertainment(musicChoice);
          } else if (eChoice.equals("comedian")) {
            System.out.println("We have two choices for comedians.");
            System.out.println("Type 'Dave Chappelle' or 'Kevin Hart'.");
            String comedianChoice = myConsole.readLine();
            eventOne.setEntertainment(comedianChoice);
          } else if (eChoice.equals("other")) {
            System.out.println("Alright, type whatever entertainment you want and will try to get them.");
            String otherEntertainmentChoice = myConsole.readLine();
            eventOne.setEntertainment(otherEntertainmentChoice);
          } else if (eChoice.equals("back")) {
            System.out.println("Thanks, choose another option.");
            isDoneWithEntertainment = true;
          } else {
            System.out.println("Invalid input");
          }
        }
      }
    }
  }
}
