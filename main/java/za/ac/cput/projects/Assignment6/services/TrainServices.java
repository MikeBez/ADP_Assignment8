package za.ac.cput.projects.Assignment6.services;

import za.ac.cput.projects.Assignment6.domain.Train;

import java.util.Set;

public interface TrainServices extends IServices<Train, String> {
    Set<Train> getAll();
}
