public class Fitbyte {
    private int age;
    private int heartRate;

    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.heartRate = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum){
        double maximumHeartrate = 206.3 - (0.711 * this.age);
        return (maximumHeartrate - this.heartRate) * (percentageOfMaximum) + this.heartRate;
    }
}
