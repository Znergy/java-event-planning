import java.util.ArrayList;
import java.util.List;

/**
 * Created by ryanjones on 3/17/17.
 */
public class Event {

  private int numberOfGuests;
  private List<String> foodBeingServed;
  private List<String> drinksBeingServed;
  private String typeOfEntertainment;
  private int totalPrice;


  public Event(int numberOfGuests, List<String> foodBeingServed, List<String> drinksBeingServed, String typeOfEntertainment) {
      this.numberOfGuests = numberOfGuests;
      this.foodBeingServed = foodBeingServed;
      this.drinksBeingServed = drinksBeingServed;
      this.typeOfEntertainment = typeOfEntertainment;
      this.totalPrice = 0;
  }

  public int getGuests() {
    return this.numberOfGuests;
  }

  public List<String> getFoodBeingServed() {
    return this.foodBeingServed;
  }

  public int getAmountOfFood() {
    return this.foodBeingServed.size();
  }

  public int getAmountOfDrinks() {
    return this.drinksBeingServed.size();
  }

  public List<String> getDrinksBeingServed() {
    return this.drinksBeingServed;
  }

  public String getTypeOfEntertainment() {
    return this.typeOfEntertainment;
  }

  public int getPrice(String name) {
    int drinkTotal = (getAmountOfDrinks() * 2) + getGuests();
    int foodTotal = (getAmountOfFood() * 2) * getGuests();
    int entertainmentTotal = 100;

    if (name.equals("food")) {
      totalPrice = foodTotal;
    } else if (name.equals("drinks")) {
      totalPrice = drinkTotal;
    } else if (name.equals("entertainment")) {
      totalPrice = entertainmentTotal;
    } else if (name.equals("all")) {
      totalPrice = drinkTotal + foodTotal + entertainmentTotal;
    } else {
      totalPrice = -1;
    }
    return totalPrice;
  }

  public void printDetails() {
    System.out.println("*********");
    System.out.println("Guests Attending: " + this.numberOfGuests);
    System.out.println("Food being served: ");
    for (int i=1; i <= this.foodBeingServed.size(); i++) {
      System.out.println("Food choice #" + i + ": " + this.foodBeingServed.get(i));
    }
    System.out.println("Drinks being served: ");
    for (int i=1; i <= this.drinksBeingServed.size(); i++) {
      System.out.println("Drink choice #" + i + ": " + this.drinksBeingServed.get(i));
    }
    if (!this.typeOfEntertainment.equals("")) {
      System.out.println("Entertainment choice: " + this.typeOfEntertainment);
    } else {
      System.out.println("No entertainment choosen");
    }
  }




}
