package za.ac.cput.projects.Assignment6.factory;

import za.ac.cput.projects.Assignment6.domain.Train;

public class TrainFactory {

    public static Train getTrain(int trainNumber, String trainType){
        return  new Train.Builder()
                .trainNumber(trainNumber)
                .trainType(trainType)
                .build();
    }
}
