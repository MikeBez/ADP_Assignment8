package za.ac.cput.projects.Assignment6.repository;

import za.ac.cput.projects.Assignment6.domain.Fare;

import java.util.Set;

public interface FareRepository extends IRepository<Fare, String> {
    Set<Fare> getAll();
}
