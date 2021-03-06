import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class EventTest {

  // First test (constuctor)
  @Test
  public void eventConstuctor_createInstance_true() {
    List<String> food = new ArrayList<String>();
    List<String> drink = new ArrayList<String>();
    Event event = new Event(10, food, drink, "Band");
    assertEquals(true, event instanceof Event);
  }

  // Second test (getter for guests)
  @Test
  public void getGuests_returnsGuestNumber_10() {
    List<String> food = new ArrayList<String>();
    List<String> drink = new ArrayList<String>();
    Event event = new Event(10, food, drink, "Band");
    assertEquals(10, event.getGuests());
  }

  // Third test (getter for foodBeingServed)
  @Test
  public void getFoodBeingServed_returnsListSize_1() {
    List<String> food = new ArrayList<String>();
    List<String> drink = new ArrayList<String>();
    food.add("chicken");
    Event event = new Event(10, food, drink, "Band");
    List<String> foodResult = new ArrayList<String>();
    foodResult = event.getFoodBeingServed();
    int size = foodResult.size();
    assertEquals(1, size);
  }

  // Fourth test (getter for foodBeingServed)
  @Test
  public void getDrinksBeingServed_returnsListSize_1() {
    List<String> food = new ArrayList<String>();
    List<String> drink = new ArrayList<String>();
    drink.add("Pepsi");
    Event event = new Event(10, food, drink, "Band");
    List<String> drinkResult = new ArrayList<String>();
    drinkResult = event.getDrinksBeingServed();
    int size = drinkResult.size();
    assertEquals(1, size);
  }

  // Fifth test (getter for typeOfEntertainment)
  @Test
  public void getTypeOfEntertainment_returnsEntertainment_Band() {
    List<String> food = new ArrayList<String>();
    List<String> drink = new ArrayList<String>();
    Event event = new Event(10, food, drink, "Band");
    assertEquals("Band", event.getTypeOfEntertainment());
  }

  // Sixth test (getter for amountOfFood)
  @Test
  public void getAmountOfFood_returnsAmountOfFood_3() {
    List<String> food = new ArrayList<String>();
    food.addAll(Arrays.asList("soup", "salad", "steak"));
    List<String> drink = new ArrayList<String>();
    Event event = new Event(10, food, drink, "Band");
    assertEquals(3, event.getAmountOfFood());
  }

  // Seventh test (getter for amountOfDrinks)
  @Test
  public void getAmountOfDrinks_returnsAmountOfDrinks_5() {
    List<String> food = new ArrayList<String>();
    List<String> drink = new ArrayList<String>();
    drink.addAll(Arrays.asList("tea", "pepsi", "coke", "sprite", "gatorade"));
    Event event = new Event(10, food, drink, "Band");
    assertEquals(5, event.getAmountOfDrinks());
  }

  // Eightth test (getPrice method)
  // tested passing "food", "drinks", "all", and else for catching wrong input
  @Test
  public void getPrice_returnsTotalforDrinks_() {
    List<String> food = new ArrayList<String>();
    food.addAll(Arrays.asList("queso", "hot dog", "chicken", "steak", "chips"));
    List<String> drink = new ArrayList<String>();
    drink.addAll(Arrays.asList("tea", "pepsi", "coke", "sprite", "gatorade"));
    Event event = new Event(20, food, drink, "DJ Walrus");
    assertEquals(200, event.getPrice("food"));
  }


}
