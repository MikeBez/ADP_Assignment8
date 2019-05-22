package za.ac.cput.projects.Assignment6.services.ServicesImpl;

import za.ac.cput.projects.Assignment6.domain.Train;
import za.ac.cput.projects.Assignment6.repository.TrainRepository;
import za.ac.cput.projects.Assignment6.repository.implementations.TrainRepositoryImpl;
import za.ac.cput.projects.Assignment6.services.TrainServices;

import java.util.Set;

public abstract class TrainServicesImpl implements TrainServices {

    private static TrainServicesImpl service = null;
    private TrainRepository repository;

    private TrainServicesImpl() {
        this.repository = TrainRepositoryImpl.getRepository();
    }

    public static TrainServicesImpl getService() {
        if (service == null) service = null;
        return service;
    }

    @Override
    public Train create(Train train) {
        return this.repository.create(train);
    }

    @Override
    public Train update(Train train) {
        return this.repository.update(train);
    }

    @Override
    public Train read(String trainID) {
        return this.repository.read(trainID);
    }

    @Override
    public void delete(String trainID) {
        this.repository.delete(trainID);
    }

    @Override
    public Set<Train> getAll() {
        return this.repository.getAll();
    }
}
