import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ChampionshipManager {
    private static ChampionshipManager instance;
    private List<Driver> drivers = new ArrayList<>();
    private List<RallyRaceResult> races = new ArrayList<>();

    private int toatalDrivers=0;
    private int totalRaces=0;

    private ChampionshipManager() {}

    public static ChampionshipManager getInstance() {
        if (instance == null) {
            instance = new ChampionshipManager();
        }
        return instance;
    }
    
    public int gettotalDrivers() {
        //drivers.forEach(driver -> System.out.println(driver.getName() + " (" + driver.getCountry() + ")"));

        return drivers.size();
    }

    public int gettotalRaces() {
        return races.size();
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public List<RallyRaceResult> getRaces() {
        return races;
    }

    

    public void registerDriver(Driver driver) {
        drivers.add(driver);
        toatalDrivers++;
    }

    public void addRace(RallyRaceResult race) {
        races.add(race);
        totalRaces++;
        
    }
    

    public String getStandings() {
        drivers.sort(Comparator.comparingInt(Driver::getTotalPoints).reversed());
        int p=1;
        String outStanding="";
        for (Driver d : drivers) {
            
            outStanding+=p+". "+d.getName() + " (" + d.getCountry() + "): " + d.getTotalPoints() + " points" + "\n";
            p++;
        }
        return outStanding;
    }
     // Static method to get championship standings
     public static void displayStandings() {
        ChampionshipManager manager = getInstance();
        System.out.println(manager.getStandings());
    }

    public Driver getLeader() {
        drivers.sort(Comparator.comparingInt(Driver::getTotalPoints).reversed());
        Driver leaddriver=drivers.get(0);
        return leaddriver;
    }

   

    // Static method to find the leading driver
    public static void displayLeadingDriver() {
        ChampionshipManager manager = getInstance();
        System.out.println(manager.getLeader().getName() + " with " + manager.getLeader().getTotalPoints() + " points");
        System.out.println("");


    }
    // Static method to calculate total championship points
    //IT SOULD BE IN STATISTICS
    public static int calculateTotalPoints() {
        ChampionshipManager manager = getInstance();
        int sum=0;
        for (int i = 0; i < manager.drivers.size(); i++) {
           sum+=manager.drivers.get(i).getTotalPoints();
        }
        return sum;
        //return manager.drivers.stream().mapToInt(Driver::getTotalPoints).sum();
    }

    public static void displayRaceResults() {
        ChampionshipManager manager = getInstance();
        for (RallyRaceResult res : manager.races) {
            res.displayResults();
        }
    }
   
}
