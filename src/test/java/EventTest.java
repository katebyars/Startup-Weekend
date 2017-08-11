import models.Event;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EventTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        Event.clearAllEvents();
    }

    @Test public void EventInstantiates_True () {
        Event eventOne = new Event("StartUp Weekend One", "event");
        assertTrue(eventOne instanceof Event);
    }
    @Test public void EventHasAName_True () {
        Event eventTwo = new Event("StartUp Weekend", "event");
        assertEquals("StartUp Weekend", eventTwo.getName());
    }
    @Test public void allEventsAreCorrectlyReturned_True () {
        Event eventThree = new Event("StartUp Weekend", "An event");
        Event eventFour = new Event("StartUp Weekend", "An event");
        assertEquals(2, Event.getAllEvents().size());
    }
    @Test public void allEventsContainsAllEvents_True() {
        Event eventFour = new Event("StartUp Weekend", "An event");
        Event eventFive = new Event("StartUp Weekend", "An event");
        assertTrue(Event.getAllEvents().contains(eventFour));
        assertTrue(Event.getAllEvents().contains(eventFive));
    }
    @Test public void EventInstantiatesWithAnId_True() {
        Event eventSix = new Event("StartUp Weekend", "An event");
        assertEquals(1, eventSix.getId());

    }
}