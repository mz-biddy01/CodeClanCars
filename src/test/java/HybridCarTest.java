import org.junit.Before;
import org.junit.Test;
import vehicles.Engine;
import vehicles.HybridCar;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    HybridCar hybridCar;

    @Before
    public void before(){
        hybridCar = new HybridCar(Engine.Hybrid, 1500, "Blue");
    }

    @Test
    public void hasColour(){
        assertEquals("Blue", hybridCar.getColour());
    }

    @Test
    public void hasPrice(){
        assertEquals(1500, hybridCar.getPrice(), 0.00);
    }

    @Test
    public void hasEngine(){
        assertEquals(Engine.Hybrid, hybridCar.getEngine());
    }
}
