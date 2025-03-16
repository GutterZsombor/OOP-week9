import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChampionshipStatistics {

   
    public static double averagePoints(List<Driver> drivers) {
    //    if (drivers.isEmpty()) {
    //         return 0; 
    //         }

   
    //     int totalPoints = 0;
    //     for (Driver driver : drivers) {
    //         totalPoints += driver.getTotalPoints();
    //     }
 
            
    //     return (double) totalPoints / drivers.size();
        return drivers.stream()
                .mapToInt(Driver::getTotalPoints)
                .average()
                .orElse(0);

        
    }

   
    public static String mostSuccessfulCountry(List<Driver> drivers) {
       
    Map<String, Integer> countryPoints = new HashMap<>();

    
    for (Driver driver : drivers) {
        String country = driver.getCountry();
        int points = driver.getTotalPoints();

        
        countryPoints.put(country, countryPoints.getOrDefault(country, 0) + points);
    }

    
    String mostSuccessfulCountry = "";
    int maxPoints = 0;

    for (Map.Entry<String, Integer> entry : countryPoints.entrySet()) {
        if (entry.getValue() > maxPoints) {
            maxPoints = entry.getValue();
            mostSuccessfulCountry = entry.getKey();
        }
    }

    return mostSuccessfulCountry;
    }
        
       

    
    public static int totalRacesHeld(List<RallyRaceResult> races) {
        return races.size();
    }










    public static double averagePerformance(List<Driver> drivers, Class<? extends RallyCar> carType) {
        return drivers.stream()
                .filter(driver -> carType.isInstance(driver.getCar()))
                .mapToDouble(driver -> driver.getCar().calculatePerformance())
                .average()
                .orElse(0);
    }
}