package za.ac.cput.projects.Assignment6.factory;

import za.ac.cput.projects.Assignment6.domain.Fare;

public class FareFactory {

    public static Fare getFare(String fareType, double farePrice, int fareDistance){
        return new Fare.Builder().fareType(fareType)
                .farePrice(farePrice)
                .fareDistance(fareDistance)
                .build();
    }
}
