import org.junit.Before;
import org.junit.Test;
import vehicles.ElectricCar;
import vehicles.Engine;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;

    @Before
    public void before(){
        electricCar = new ElectricCar(Engine.Electric, 1000, "Silver");
    }

    @Test
    public void hasColour(){
        assertEquals("Silver", electricCar.getColour());
    }

    @Test
    public void hasPrice(){
        assertEquals(1000, electricCar.getPrice(), 0.00);
    }

    @Test
    public void hasEngine(){
        assertEquals(Engine.Electric, electricCar.getEngine());
    }
}
