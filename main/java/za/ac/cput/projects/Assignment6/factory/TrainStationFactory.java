package za.ac.cput.projects.Assignment6.factory;

import za.ac.cput.projects.Assignment6.domain.TrainStaion;

public class TrainStationFactory {

    public static TrainStaion getTrrainStation(String trainStation) {
        return new TrainStaion.Builder()
                .trainStation(trainStation)
                .build();
    }
}
