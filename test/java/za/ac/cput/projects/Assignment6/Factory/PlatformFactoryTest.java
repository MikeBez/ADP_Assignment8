package za.ac.cput.projects.Assignment6.Factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.projects.Assignment6.domain.Platform;
import za.ac.cput.projects.Assignment6.factory.PlatformFactory;

public class PlatformFactoryTest {

    @Test

    public void getPlatform(){
        int platformNumber = 11;
        Platform i = PlatformFactory.getPlaform(platformNumber);
        System.out.println(i);
        Assert.assertNotNull(((Platform) i).getPlatformNumber());
    }
}
