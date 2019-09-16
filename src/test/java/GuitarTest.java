import music_shop.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp(){
        guitar = new Guitar("red","guitar");
    }

    @Test
    public void hasType(){
        assertEquals("guitar", Guitar.getType);
    }

}
