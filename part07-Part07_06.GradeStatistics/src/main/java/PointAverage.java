import java.util.ArrayList;

public class PointAverage {
    private ArrayList<Integer> points;

    public PointAverage(){
        this.points = new ArrayList<>();
    }

    public void addPoint(int points){
        this.points.add(points);
    }

    public double averageOfPoints(){
        int sum = 0;

        for (Integer points : points) {
            sum += points;
        }

        double avg = (double) sum / points.size();

        return avg;
    }
}
