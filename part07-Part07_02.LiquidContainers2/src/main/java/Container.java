public class Container {
    private int contains;

    public Container(){
        this.contains = 0;
    }

    public int contains(){
        return this.contains;
    }

    public void add(int amount){
        if (amount > 0) {
            this.contains = Math.min(amount + contains, 100);
        }
    }

    public int move(int amount){
        if (amount > this.contains) {
            this.contains = 0;
            return this.contains;
        } else {
            this.contains -= amount;
            return amount;
        }

        // if (this.contains <= 0) {
        //     this.contains = 0;
        // }

        // if (this.contains > 100) {
        //     this.contains = 100;
        // }
    }

    public void remove(int amount){
        if (amount > 0) {
            this.contains -= amount;
        } 

        if (this.contains < 0) {
            this.contains = 0;
        }
    }

    public String toString(){
        return this.contains + "/100";
    }
}
