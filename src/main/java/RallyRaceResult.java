import java.util.Map;
import java.util.TreeMap;

public class RallyRaceResult implements RaceResult {
    private String raceName;
    private String location;
    private Map<Integer, Driver> results = new TreeMap<>();

    private static final int[] POINTS = {25, 18, 15, 12}; 

    public RallyRaceResult(String raceName, String location) {
        this.raceName = raceName;
        this.location = location;
    }
    public String getraceName() {
        return raceName;
    }
    public String getlocation() {
        return location;
    }

    public String getRaceName() {
        return raceName;
    }
   

    @Override
    public void recordResult(Driver driver, int position) {
        results.put(position, driver);
        if (position - 1 < POINTS.length) {
            driver.addPoints(POINTS[position - 1]);
        }
    }
    public int getDriverPoints(Driver driver) {
        return driver.getTotalPoints();
    }
   
    @Override
    public void displayResults() {
        System.out.println("Race: " + raceName+ " (" + location + ")");
        for (Map.Entry<Integer, Driver> entry : results.entrySet()) {
            System.out.println(" Position " + entry.getKey() + ": " + entry.getValue().getName() + " - " + POINTS[entry.getKey()-1]+ " points");
        }
        System.out.println();
    }
   
}
