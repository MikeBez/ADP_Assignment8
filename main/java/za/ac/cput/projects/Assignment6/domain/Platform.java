package za.ac.cput.projects.Assignment6.domain;

public class Platform {

    private int platformNumber;

    private Platform(){}

    private Platform(Builder builder) {
        this.platformNumber = builder.platformNumber;
    }

    public int getPlatformNumber() { return platformNumber; }

    public static class Builder{
        private int platformNumber;

        public Builder platformNumber(int platformNumber){
            this.platformNumber = platformNumber;
            return this;
        }

        public Platform build() { return new Platform(this); }
    }

    @Override
    public String toString() {
        return "Platform{" +
                "plarformNmber='" + platformNumber +
                '}';
    }
}
