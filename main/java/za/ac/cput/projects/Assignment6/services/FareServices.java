package za.ac.cput.projects.Assignment6.services;

import za.ac.cput.projects.Assignment6.domain.Fare;

import java.util.Set;

public interface FareServices extends IServices<Fare, String> {
    Set getAll();
}
