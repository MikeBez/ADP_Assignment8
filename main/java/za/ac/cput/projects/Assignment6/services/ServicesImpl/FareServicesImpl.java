package za.ac.cput.projects.Assignment6.services.ServicesImpl;

import za.ac.cput.projects.Assignment6.domain.Fare;
import za.ac.cput.projects.Assignment6.repository.FareRepository;
import za.ac.cput.projects.Assignment6.repository.implementations.FareRepositoryImpl;
import za.ac.cput.projects.Assignment6.services.FareServices;

import java.util.Set;

public class FareServicesImpl implements FareServices {

    private static FareServicesImpl service = null;
    private FareRepository repository;

    private FareServicesImpl(){
        this.repository = FareRepositoryImpl.getRepository();
    }

    public static FareServicesImpl getService(){
        if (service == null) service = new FareServicesImpl();
        return service;
    }

    @Override
    public Fare create(Fare fare){
        return this.repository.create(fare);
    }

    @Override
    public Fare update(Fare fare) {
        return this.repository.update(fare);
    }

    @Override
    public Fare read(String fareID){
        return this.repository.read(fareID);
    }

    @Override
    public void delete(String fareID) {
        this.repository.delete(fareID);
    }

    @Override
    public Set getAll(){
        return this.repository.getAll();
    }
}
