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


  public Event(int numberOfGuests, List<String> foodBeingServed, List<String> drinksBeingServed, String typeOfEntertainment) {
      this.numberOfGuests = numberOfGuests;
      this.foodBeingServed = foodBeingServed;
      this.drinksBeingServed = drinksBeingServed;
      this.typeOfEntertainment = typeOfEntertainment;
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



}
