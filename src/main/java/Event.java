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

  public Event() {
    this.numberOfGuests = 0;
    this.foodBeingServed = new ArrayList<String>();
    this.drinksBeingServed = new ArrayList<String>();
    this.typeOfEntertainment = "";
    this.totalPrice = 0;
  }

  public Event(int numberOfGuests, List<String> foodBeingServed, List<String> drinksBeingServed, String typeOfEntertainment) {
      this.numberOfGuests = numberOfGuests;
      this.foodBeingServed = foodBeingServed;
      this.drinksBeingServed = drinksBeingServed;
      this.typeOfEntertainment = typeOfEntertainment;
      this.totalPrice = 0;
  }

  public void setEntertainment(String typeOfEntertainment) {
    this.typeOfEntertainment = typeOfEntertainment;
  }

  public void setNumberOfGuests(int numberOfGuests) {
    this.numberOfGuests = numberOfGuests;
  }

  public void setFood(String food) {
    this.foodBeingServed.add(food);
  }

  public void printFood() {
    for(int i=0; i < this.foodBeingServed.size(); i++) {
      int itemNumber = i + 1;
      System.out.println(itemNumber + ") " + this.foodBeingServed.get(i));
    }
  }

  public void printDrinks() {
    for(int i=0; i < this.drinksBeingServed.size(); i++) {
      int itemNumber = i + 1;
      System.out.println(itemNumber + ") " + this.drinksBeingServed.get(i));
    }
  }

  public void removeFood(int index) {
    this.foodBeingServed.remove(index - 1);
  }

  public void removeDrink(int index) {
    this.drinksBeingServed.remove(index - 1);
  }

  public void setDrink(String drink) {
    this.drinksBeingServed.add(drink);
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

  public int getEntertainmentPrice() {
    int eTotal;
    if(this.typeOfEntertainment.equals("Dave")) {
      eTotal = 3500;
    } else if(this.typeOfEntertainment.equals("Kevin")) {
      eTotal = 5000;
    } else if(this.typeOfEntertainment.equals("rap") || this.typeOfEntertainment.equals("rock") || this.typeOfEntertainment.equals("country")) {
      eTotal = 500;
    } else {
      if(!this.typeOfEntertainment.equals("")) {
        eTotal = 750;
      } else {
        eTotal = 0;
      }
    }
    return eTotal;
  }

  public int getPrice(String name) {
    int drinkTotal = (getAmountOfDrinks() * 2) + getGuests();
    int foodTotal = (getAmountOfFood() * 2) * getGuests();
    int entertainmentTotal = getEntertainmentPrice();

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
    System.out.println("\n***********************\n");
    System.out.println("Guests Attending: " + this.numberOfGuests);
    if(this.foodBeingServed.size() != 0) {
      System.out.println("Food being served: ");
      for (int i=0; i < this.foodBeingServed.size(); i++) {
        int itemNumber = i + 1;
        System.out.println(itemNumber + ") " + this.foodBeingServed.get(i));
      }
    } else {
      System.out.println("No food has been added");
    }
    if(this.drinksBeingServed.size() != 0) {
      System.out.println("Drinks being served: ");
      for (int i=0; i < this.drinksBeingServed.size(); i++) {
        int itemNumber = i + 1;
        System.out.println(itemNumber + ") " + this.drinksBeingServed.get(i));
      }
    } else {
      System.out.println("No drinks have been added");
    }
    if (!this.typeOfEntertainment.equals("")) {
      System.out.println("Entertainment choice: " + this.typeOfEntertainment);
    } else {
      System.out.println("No entertainment choosen");
    }
    System.out.println("Total price: " + "$" + getPrice("all"));
    System.out.println("\n***********************\n");
  }




}
