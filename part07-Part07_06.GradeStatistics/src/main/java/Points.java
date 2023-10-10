import java.util.ArrayList;

public class Points {
    private ArrayList<Integer> allPoints;
    private ArrayList<Integer> passingPoints;

    public Points(){
        this.allPoints = new ArrayList<>();
        this.passingPoints = new ArrayList<>();
    }

    public void addPoints(int points){
        if (points >= 0 && points <= 100) {
            this.allPoints.add(points);
        }
        if (points >= 50 && points <= 100) {
            this.passingPoints.add(points);
        }
        
    }

    public ArrayList<Integer> getAllPoints(){
        return allPoints;
    }

    public double pointAverage(){
        double sum = 0.0;

        for (double integer : allPoints) {
            sum += integer;
        }

        return (double) sum / allPoints.size();
    }

    public double passingPoint(){
        double sum = 0.0;
        
        for (Integer integer : passingPoints) {
            sum += integer;
        }
        return sum / passingPoints.size();
      
    }

    public double passPercentage(){
        double percentage = (passingPoints.size() * 1.0) / allPoints.size();
        return percentage * 100;
    }

    public int pointsToStars(int points){
        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
}
