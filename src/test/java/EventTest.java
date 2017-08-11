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
    }

    @Test public void EventInstantiates_True () {
        Event eventOne = new Event("StartUp Weekend One");
        assertTrue(eventOne instanceof Event);
    }
    @Test public void EventHasAName_True () {
        Event eventTwo = new Event("StartUp Weekend");
        assertEquals("StartUp Weekend", eventTwo.getName());

    }
}