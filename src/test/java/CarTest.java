import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.Engine;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;

    @Before
    public void before(){
        car = new Car(Engine.Petrol, 500, "Red");
    }

    @Test
    public void hasColour(){
        assertEquals("Red", car.getColour());
    }

    @Test
    public void hasPrice(){
        assertEquals(500, car.getPrice(), 0.00);
    }

    @Test
    public void hasEngine(){
        assertEquals(Engine.Petrol, car.getEngine());
    }

}
