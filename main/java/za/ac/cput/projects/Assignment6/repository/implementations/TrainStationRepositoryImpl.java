package za.ac.cput.projects.Assignment6.repository.implementations;

import za.ac.cput.projects.Assignment6.domain.Train;
import za.ac.cput.projects.Assignment6.domain.TrainStaion;
import za.ac.cput.projects.Assignment6.repository.TrainRepository;

import java.util.HashSet;
import java.util.Set;

public class TrainStationRepositoryImpl implements TrainRepository {
    private static TrainStationRepositoryImpl reposiroty = null;
    private Set<TrainStaion> staions;

    private TrainStationRepositoryImpl()
    {
        this.staions = new HashSet<>();
    }

    public static TrainStationRepositoryImpl getRepository(){
        if (reposiroty == null) reposiroty = new TrainStationRepositoryImpl();
        return reposiroty;
    }

    @Override
    public Set<Train> getAll() {
        return null;
    }

    @Override
    public Train create(Train train) {
        return null;
    }

    @Override
    public Train update(Train train) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Train read(String s) {
        return null;
    }
}
