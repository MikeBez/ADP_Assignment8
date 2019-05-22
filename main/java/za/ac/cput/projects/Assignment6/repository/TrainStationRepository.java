package za.ac.cput.projects.Assignment6.repository;

import za.ac.cput.projects.Assignment6.domain.Train;
import za.ac.cput.projects.Assignment6.domain.TrainStaion;

import java.util.Set;

public interface TrainStationRepository extends IRepository<TrainStaion, String> {
        Set<TrainStaion> getAll();
}
