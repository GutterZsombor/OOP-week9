public class GravelCar extends RallyCar {
    double suspensionTravel;
    public GravelCar(String make, String model, int horsepower,double suspensionTravel) {
        super(make, model, horsepower);
        this.suspensionTravel=suspensionTravel  ;
    }
    public double getSuspensionTravel(){
        return suspensionTravel;
    }
    @Override
    public double calculatePerformance() {
        // i dont know what algoritm shuld go here
        //return horsepower * 0.85 + 100+ suspensionTravel;
        return 423.5;
    }

   
    
}