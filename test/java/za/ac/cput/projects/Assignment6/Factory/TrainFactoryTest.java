package za.ac.cput.projects.Assignment6.Factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.projects.Assignment6.domain.Platform;
import za.ac.cput.projects.Assignment6.domain.Train;
import za.ac.cput.projects.Assignment6.factory.PlatformFactory;
import za.ac.cput.projects.Assignment6.factory.TrainFactory;

public class TrainFactoryTest {

    @Test

    public void getTrain(){
        int trainNumber = 3142;
        Train i = TrainFactory.getTrain(trainNumber, "Metro Plus");
        System.out.println(i);
        Assert.assertNotNull(((Train) i).getTrainNumber());
    }
}
