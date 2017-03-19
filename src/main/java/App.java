import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {

  public static void main(String[] args) {
    boolean isOver = false;
    Event event = new Event();
    Console myConsole = System.console();
    System.out.println("\nWelcome, lets plan a party!");
    System.out.println("What would you like to plan first? \n");
    while(!isOver) {
      boolean isDoneWithFood = false;
      boolean isDoneWithDrinks = false;
      boolean isDoneWithEntertainment = false;
      boolean isDoneWithPrice = false;
      System.out.println("Type 'guests', 'food', 'drinks', 'entertainment', 'price', 'print' or 'quit'.");
      String choice = myConsole.readLine();
      if(choice.equals("quit")) {
        System.out.println("Thanks, have a good day!");
        isOver = true;
      } else if (choice.equals("guests")) {
        System.out.println("\n***** Guests *****");
        System.out.println("Type the number of guests attending.");
        int guestAmount = Integer.parseInt(myConsole.readLine());
        event.setNumberOfGuests(guestAmount);
        System.out.println("Thanks, " + guestAmount + " guests are attending.");
      } else if (choice.equals("food")) {
        System.out.println("\n***** Food *****");
        while(!isDoneWithFood) {
          System.out.println("Type 'add' to add a food, 'remove' to remove a food, 'print' to print current drinks, or 'back' to return to the main option menu.");
          String foodChoice = myConsole.readLine();

          if(foodChoice.equals("add")) {
            System.out.println("Type a food");
            String foodToAdd = myConsole.readLine();
            event.setFood(foodToAdd);
            System.out.println(foodToAdd + ", was added to the list.");
          } else if(foodChoice.equals("remove")) {
            System.out.println("Here's a list of our items so far.");
            event.printFood();
            System.out.println("Type the number for the item you would like to remove.");
            int foodToRemove = Integer.parseInt(myConsole.readLine());
            event.removeFood(foodToRemove);
            System.out.println(foodToRemove + ", was removed from the list.");
          } else if(foodChoice.equals("back")) {
            System.out.println("Thanks, choose another option.");
            isDoneWithFood = true;
          } else if(foodChoice.equals("print")) {
            if (event.getAmountOfFood() == 0) {
              System.out.println("Sorry, nothing to print. \n");
            } else {
              event.printFood();
            }
          } else {
            System.out.println("Invalid input");
          }
        }
      } else if (choice.equals("drinks")) {
        System.out.println("\n***** Drinks *****");
        while(!isDoneWithDrinks) {
          System.out.println("Type 'add' to add a drink, 'remove' to remove a drink, 'print' to print current drinks, or 'back' to return to the main option menu.");
          String drinkChoice = myConsole.readLine();

          if(drinkChoice.equals("add")) {
            System.out.println("Type a drink");
            String drinkToAdd = myConsole.readLine();
            event.setDrink(drinkToAdd);
            System.out.println(drinkToAdd + ", was added to the list.");
          } else if(drinkChoice.equals("remove")) {
            System.out.println("Here's a list of our items so far.");
            event.printDrinks();
            System.out.println("Type the number for the item you would like to remove.");
            int drinkToRemove = Integer.parseInt(myConsole.readLine());
            event.removeDrink(drinkToRemove);
            System.out.println("Drink item #" + drinkToRemove + " , was removed from the list.");
          } else if(drinkChoice.equals("back")) {
            System.out.println("Thanks, choose another option.");
            isDoneWithDrinks = true;
          } else if(drinkChoice.equals("print")) {
            if (event.getAmountOfDrinks() == 0) {
              System.out.println("Sorry, nothing to print. \n");
            } else {
              event.printDrinks();
            }
          }
          else {
            System.out.println("Invalid input");
          }
        }
      } else if (choice.equals("entertainment")) {
        System.out.println("\n***** Entertainment *****");
        System.out.println("What entertainment do you want?");
        System.out.println("Type 'music', 'comedian', or 'other'.");
        String eChoice = myConsole.readLine();
        if(eChoice.equals("music")) {
          System.out.println("We have three choices for music. Type 'rock', 'rap', or 'country'.");
          String musicChoice = myConsole.readLine();
          event.setEntertainment(musicChoice);
          System.out.println("Thanks, you choose " + musicChoice);
        } else if (eChoice.equals("comedian")) {
          System.out.println("We have two choices for comedians. Type 'Dave' for Dave Chappelle' or 'Kevin' for Kevin Hart.");
          String comedianChoice = myConsole.readLine();
          event.setEntertainment(comedianChoice);
          System.out.println("Thanks, you choose " + comedianChoice);
        } else if (eChoice.equals("other")) {
          System.out.println("Alright, type whatever entertainment you want and will try to get them.");
          String otherEntertainmentChoice = myConsole.readLine();
          event.setEntertainment(otherEntertainmentChoice);
          System.out.println("Thanks, you choose " + otherEntertainmentChoice);
        } else {
          System.out.println("Invalid input");
        }
      } else if (choice.equals("print")) {
        event.printDetails();
      } else if (choice.equals("price")) {
        int totalPrice;
        System.out.println("\n***** Price *****");
        while(!isDoneWithPrice) {
          System.out.println("For specific pricing type 'food', 'drinks', or 'entertainment'. For total price type 'all'. Type 'back' to return to the main option menu.");
          String priceChoice = myConsole.readLine();
          if(priceChoice.equals("food")) {
            totalPrice = event.getPrice(priceChoice);
            System.out.println("Food Total: " + "$" + totalPrice);
          } else if(priceChoice.equals("drinks")) {
            totalPrice = event.getPrice(priceChoice);
            System.out.println("Drinks Total: " + "$" + totalPrice);
          } else if(priceChoice.equals("entertainment")) {
            totalPrice = event.getPrice(priceChoice);
            System.out.println("Entertainment Total: " + "$" + totalPrice);
          } else if(priceChoice.equals("all")) {
            totalPrice = event.getPrice(priceChoice);
            System.out.println("Complete Total: " + "$" + totalPrice);
          } else if(priceChoice.equals("back")) {
            System.out.println("Thanks, choose another option.");
            isDoneWithPrice = true;
          } else {
            System.out.println("Invalid Input.");
          }
        }
      } else {
        System.out.println("Invalid Input.");
      }
    }
  }
}
