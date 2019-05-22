package za.ac.cput.projects.Assignment6.services;

import za.ac.cput.projects.Assignment6.domain.Platform;

import java.util.Set;

public interface PlatformServices extends IServices<Platform, Integer> {
    Platform read(String platformID);

    void delete(String platformID);

    Set<Platform> getAll();
}
