package za.ac.cput.projects.Assignment6.domain;

public class TrainStaion {

    private String trainStaion;

    private TrainStaion(){}

    private TrainStaion(Builder builder){
        this.trainStaion = builder.trainStaion;
    }

    public String getTrainStaion(){return trainStaion; }

    public static class Builder{

        private String trainStaion;

        public Builder trainStation(String trainStaion){
            this.trainStaion = trainStaion;
            return this;
        }

        public TrainStaion build() {return new TrainStaion(this);}
    }

    @Override
    public String toString() {
        return "TrainStaion{" +
                "trainStation='" + trainStaion +
                '}';
    }
}
