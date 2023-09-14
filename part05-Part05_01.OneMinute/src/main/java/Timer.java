public class Timer {

    private int seconds;
    private int hundredths;
    private int limit;
    
    public Timer(){
        this.seconds = 0;
        this.hundredths = 0;
        this.limit = 100;
    }

    public String toString(){
        if (this.seconds < 10) {
            if (this.hundredths < 10) {
                return "0" + this.seconds + ":0" + this.hundredths;
            }
            return "0" + this.seconds + ":" + this.hundredths;
        }
        
        if (this.hundredths < 10) {
            return "" + this.seconds + ":0" + this.hundredths;
        }
        return "" + this.seconds + ":" + this.hundredths;
    }


    public void advance(){
        this.hundredths++;

        if (this.hundredths >= this.limit) {
            this.seconds++;
            this.hundredths = 0;
        }

        if (this.seconds >= 60) {
            this.seconds = 0;
        }
    }

}
