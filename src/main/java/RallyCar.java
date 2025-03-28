public abstract class RallyCar {
    protected String make;
    protected String model;
    protected int horsepower;

    public RallyCar(String make, String model, int horsepower) {
        this.make = make;
        this.model = model;
        this.horsepower = horsepower;
    }

    public abstract double calculatePerformance();

    public int getHorsepower() {
        return horsepower;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
    
}
