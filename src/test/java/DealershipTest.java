import org.junit.Before;
import org.junit.Test;
import people.Dealership;
import vehicles.Car;
import vehicles.Engine;
import vehicles.Vehicle;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DealershipTest {

    Dealership dealership;
    Vehicle vehicle1;

    @Before
    public void before(){
        dealership = new Dealership(10000);
        vehicle1 = new Car(Engine.Diesel, 300, "Black");
    }

    @Test
    public void hasMoneyInTill(){
        assertEquals(10000, dealership.getTill(), 0.00);
    }

    @Test
    public void stockStartsAt0(){
        assertEquals(0, dealership.getStock().size());
    }

    @Test
    public void canAddVehicle(){
        dealership.addVehicleToStock(vehicle1);
        assertNotNull(dealership.getStock());

    }


}
