package za.ac.cput.projects.Assignment6.services;

import za.ac.cput.projects.Assignment6.domain.Train;
import za.ac.cput.projects.Assignment6.domain.TrainStaion;

import java.util.Set;

public interface TrainStnServices extends IServices<TrainStaion,String> {
    TrainStaion read(Integer trainStaionID);

    Set<Train> getAll();
}
