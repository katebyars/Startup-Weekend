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
        Event event = new Event();
        assertTrue(event instanceof Event);
    }
}