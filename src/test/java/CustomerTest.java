import org.junit.Before;
import org.junit.Test;
import people.Customer;
import vehicles.Car;
import vehicles.Engine;
import vehicles.Vehicle;

import static org.junit.Assert.*;

public class CustomerTest {

    Customer customer;
    Vehicle vehicle1;

    @Before
    public void before(){
        customer = new Customer(800);
        vehicle1 = new Car(Engine.Diesel, 300, "Black");
    }

    @Test
    public void hasMoney(){
        assertEquals(800, customer.getMoney(), 0.00);
    }

    @Test
    public void vehicleListStartsAt0(){
        assertEquals(0, customer.getVehicles().size());
    }

    @Test
    public void canAddVehicle(){
        customer.addVehicleToCustomer(vehicle1);
        assertNotNull(customer.getVehicles());

    }


}
