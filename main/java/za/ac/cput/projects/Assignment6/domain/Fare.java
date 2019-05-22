package za.ac.cput.projects.Assignment6.domain;

public class Fare {

    private String fareType;
    private double farePrice;
    private int fareDistance;

    private Fare() {
    }

    private Fare(Builder builder) {
        this.fareType = builder.fareType;
        this.farePrice = builder.farePrice;
        this.fareDistance = builder.fareDistance;
    }

    public String getFareType() {return  fareType; }
    public double getFarePrice() {return farePrice; }
    public  int getFareDistance() {return fareDistance; }

    public static class Builder {

        private String fareType;
        private double farePrice;
        private int fareDistance;

        public Builder fareType(String fareType){
            this.fareType = fareType;
            return this;
        }

        public Builder farePrice(double fareType){
            this.farePrice = farePrice;
            return this;
        }

        public Builder fareDistance(int fareDistance){
            this.fareDistance = fareDistance;
            return this;
        }

        public Fare build(){return new Fare(this); }
    }

    @Override
    public String toString() {
        return "Fare{" +
                "FareType='" + fareType + '\'' +
                ", FarePrice='" + farePrice + '\'' +
                ", FareDistance='" + fareDistance + '\'' +
                '}';
    }
}


