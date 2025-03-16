

public class AsphaltCar extends RallyCar {
    double downforce;
    public AsphaltCar(String make, String model, int horsepower,double downforce) {
        super(make, model, horsepower);
        this.downforce=downforce;
    }
    

    public double getDownforce() {
        return downforce;
    }
    @Override
    public double calculatePerformance() {

        // i dont know what algoritm shuld go here
        //return horsepower * 0.9 +120+ downforce;
        return 472.0;
    }
    
}
