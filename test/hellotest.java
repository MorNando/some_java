//package hello;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import static org.junit.Assert.fail;


public class hellotest {

    @Test
    public void testNothing() {
    }

    @Test
    public void testWillAlwaysFail() {   
        fail("An error message");
    }
}