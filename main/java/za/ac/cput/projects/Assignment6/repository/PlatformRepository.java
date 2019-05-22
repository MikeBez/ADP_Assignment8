package za.ac.cput.projects.Assignment6.repository;

import za.ac.cput.projects.Assignment6.domain.Platform;

import java.util.Set;

public interface PlatformRepository extends IRepository<Platform, String> {
    Set<Platform> getAll();
}
