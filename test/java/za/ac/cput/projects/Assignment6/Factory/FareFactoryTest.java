package za.ac.cput.projects.Assignment6.Factory;

import org.junit.Test;
import org.junit.Assert;
import za.ac.cput.projects.Assignment6.domain.Fare;
import za.ac.cput.projects.Assignment6.factory.FareFactory;

public class FareFactoryTest {

    @Test

    public void getFareFactory(){
        double farePrice = 10.00;
        Fare i = FareFactory.getFare("", farePrice,0);
        System.out.println(i);
        Assert.assertNotNull(i.getFarePrice());
    }
}
