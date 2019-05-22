package za.ac.cput.projects.Assignment6.factory;

import za.ac.cput.projects.Assignment6.domain.Platform;

public class PlatformFactory {

    public static Platform getPlaform(int platformNumber) {
        return new Platform.Builder()
                .platformNumber(platformNumber)
                .build();
    }
}
