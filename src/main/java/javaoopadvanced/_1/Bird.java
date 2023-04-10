package javaoopadvanced._1;

public class Bird extends Animal {
    private double wingSpan;

    public Bird(double height, double weight, double wingSpan) {
        super(height, weight);
        this.wingSpan = wingSpan;
    }

    public Double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(Double wingSpan) {
        this.wingSpan = wingSpan;
    }
    public Double flySpeedMetersPerSecond(){
        return getWingSpan()*4;
    }
}

