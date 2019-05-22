package za.ac.cput.projects.Assignment6.Factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.projects.Assignment6.domain.Train;
import za.ac.cput.projects.Assignment6.domain.TrainStaion;
import za.ac.cput.projects.Assignment6.factory.TrainFactory;
import za.ac.cput.projects.Assignment6.factory.TrainStationFactory;

public class TrainStationFactoryTest {

    @Test

    public void getTrainStation(){
        String trainStation = "Woltemade";
        TrainStaion i = TrainStationFactory.getTrrainStation("Woltemade");
        System.out.println(i);
        Assert.assertNotNull(((TrainStaion) i).getTrainStaion());
    }
}
