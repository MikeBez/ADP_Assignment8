package za.ac.cput.projects.Assignment6.repository.implementations;

import za.ac.cput.projects.Assignment6.domain.Platform;

import java.util.HashSet;
import java.util.Set;

public class PlatformReposirotyImpl {

    private static PlatformReposirotyImpl reposiroty = null;
    private Set<Platform> platforms;

    public PlatformReposirotyImpl()
    {
        this.platforms = new HashSet<>();
    }

    public static PlatformReposirotyImpl getRepository(){
        if (reposiroty == null) reposiroty = new PlatformReposirotyImpl();
        return reposiroty;
    }
}
