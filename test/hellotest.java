//package hello;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class hellotest {

    @Test
    public void testNothing() {
    }

    @Test
    public void testWillAlwaysFail() {   
        fail("An error message");
    }
}