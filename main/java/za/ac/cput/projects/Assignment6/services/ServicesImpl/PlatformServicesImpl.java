package za.ac.cput.projects.Assignment6.services.ServicesImpl;

import za.ac.cput.projects.Assignment6.domain.Platform;
import za.ac.cput.projects.Assignment6.repository.PlatformRepository;
import za.ac.cput.projects.Assignment6.repository.implementations.PlatformReposirotyImpl;
import za.ac.cput.projects.Assignment6.services.PlatformServices;

import java.util.Set;

public abstract class PlatformServicesImpl implements PlatformServices{

        private static PlatformServicesImpl service = null;
        private PlatformRepository repository;

    private PlatformServicesImpl(){
        this.repository = (PlatformRepository) PlatformReposirotyImpl.getRepository();
    }

        public static PlatformServicesImpl getService(){
        if (service == null) service = new PlatformServicesImpl() {
            @Override
            public void delete(Integer integer) {

            }

            @Override
            public Platform read(Integer integer) {
                return null;
            }
        };
        return service;
    }

        @Override
        public Platform create(Platform platform){
        return this.repository.create(platform);
    }

        @Override
        public Platform update(Platform platform) {
        return this.repository.update(platform);
    }

        @Override
        public Platform read(String platformID){
        return this.repository.read(platformID);
    }

        @Override
        public void delete(String platformID) {
        this.repository.delete(platformID);
    }

        @Override
        public Set getAll(){
        return this.repository.getAll();
    }
}
