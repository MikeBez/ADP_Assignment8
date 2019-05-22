package za.ac.cput.projects.Assignment6.domain;

public class Train {

    private String trainType;
    private int trainNumber;

    private Train(){}

    private Train(Builder builder){
        this.trainNumber = builder.trainNumber;
        this.trainType = builder.trainType;
    }

    public String getTrainType() {return trainType;}
    public int getTrainNumber() {return trainNumber;}

    public static class Builder{

        private String trainType;
        private int trainNumber;

        public Builder trainType(String trainType){
            this.trainType = trainType;
            return this;
        }

        public Builder trainNumber(int trainNumber){
            this.trainNumber = trainNumber;
            return this;
        }

        public Train build(){
            return new Train(this);
        }
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainType='" + trainType + '\'' +
                ", trainNumber='" + trainNumber + '\'' +
                '}';
    }


}
