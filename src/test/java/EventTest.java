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
}
