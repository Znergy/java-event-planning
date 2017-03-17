import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

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

  // Third test (getter for foodBeingServed)
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

  // Fourth test (getter for typeOfEntertainment)
  @Test
  public void getTypeOfEntertainment_returnsEntertainment_Band() {
    List<String> food = new ArrayList<String>();
    List<String> drink = new ArrayList<String>();
    Event event = new Event(10, food, drink, "Band");
    assertEquals("Band", event.getTypeOfEntertainment());
  }



}
