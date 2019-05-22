package za.ac.cput.projects.Assignment6.services.ServicesImpl;

import za.ac.cput.projects.Assignment6.domain.Train;
import za.ac.cput.projects.Assignment6.domain.TrainStaion;
import za.ac.cput.projects.Assignment6.repository.TrainRepository;
import za.ac.cput.projects.Assignment6.repository.implementations.TrainStationRepositoryImpl;
import za.ac.cput.projects.Assignment6.services.TrainStnServices;

import java.util.Set;

public abstract class TrainStnServicesImpl implements TrainStnServices {

    private static TrainStnServicesImpl service = null;
    private TrainRepository repository;

    private TrainStnServicesImpl() {
        this.repository = TrainStationRepositoryImpl.getRepository();
    }

    public static TrainStnServicesImpl getService() {
        if (service == null) service = null;
        return service;
    }

    @Override
    public TrainStaion create(TrainStaion trainStaion) {
       // return this.repository.create(trainStaion);
        return null;
    }

    @Override
    public TrainStaion update(TrainStaion trainStaion) {
        //return this.repository.update(trainStaion);
        return null;
    }

    @Override
    public TrainStaion read(Integer trainStaionID) {
       // return this.repository.read(trainStaionID);
        return null;
    }

    @Override
    public void delete(String trainStaionID) {
        this.repository.delete(trainStaionID);
    }

    @Override
    public Set<Train> getAll() {
        return this.repository.getAll();
    }
}
