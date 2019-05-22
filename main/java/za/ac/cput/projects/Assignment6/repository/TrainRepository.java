package za.ac.cput.projects.Assignment6.repository;

import za.ac.cput.projects.Assignment6.domain.Platform;
import za.ac.cput.projects.Assignment6.domain.Train;

import java.util.Set;

public interface TrainRepository extends IRepository<Train, String> {
    Set<Train> getAll();
}
