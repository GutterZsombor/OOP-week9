public class App {
    public static void main(String[] args) {
        ChampionshipManager manager = ChampionshipManager.getInstance();

        Driver ogier = new Driver("Sébastien Ogier", "France", new GravelCar("Toyota", "Yaris WRC", 380,20));
        Driver rovanpera = new Driver("Kalle Rovanperä", "Finland", new AsphaltCar("Hyundai", "i20 WRC", 400,100));
        Driver tanak = new Driver("Ott Tänak", "Estonia", new GravelCar("Ford", "Fiesta WRC", 375,15));
        Driver neuville = new Driver("Thierry Neuville", "Belgium", new AsphaltCar("Citroën", "C3 WRC", 390,110));

        manager.registerDriver(ogier);
        manager.registerDriver(rovanpera);
        manager.registerDriver(tanak);
        manager.registerDriver(neuville);

        RallyRaceResult race1 = new RallyRaceResult("Rally Finland", "Jyväskylä");
        race1.recordResult(ogier, 1);
        race1.recordResult(tanak, 2);
        race1.recordResult(rovanpera, 3);
        race1.recordResult(neuville, 4);
        manager.addRace(race1);

        RallyRaceResult race2 = new RallyRaceResult("Monte Carlo Rally","Monaco");
        race2.recordResult(rovanpera, 1);
        race2.recordResult(neuville, 2);
        race2.recordResult(ogier, 3);
        race2.recordResult(tanak, 4);
        manager.addRace(race2);

        manager.displayStandings();

        System.out.println("===== CHAMPIONSHIP LEADER =====");
        manager.displayLeadingDriver();

        
        

        System.out.println("===== CHAMPIONSHIP STATISTICS =====");
        System.out.println("Toltal drivers: " + manager.gettotalDrivers());
        System.out.println("Total Races: " +manager.gettotalRaces());
        System.out.println("Average points per driver: " + ChampionshipStatistics.averagePoints(manager.getDrivers()));
        System.out.println("Most successful country: " + ChampionshipStatistics.mostSuccessfulCountry(manager.getDrivers()));
        System.out.println("Total Championship Points: " + ChampionshipManager.calculateTotalPoints()+"\n");

        System.out.println("===== RACE RESULTS =====");
        
       manager.displayRaceResults();

       System.out.println("===== CAR PERFORMANCE RATINGS =====");
    double gravelPerformance = ChampionshipStatistics.averagePerformance(manager.getDrivers(), GravelCar.class);
    double asphaltPerformance = ChampionshipStatistics.averagePerformance(manager.getDrivers(), AsphaltCar.class);
    System.out.println("Gravel Car Performance: " + gravelPerformance);
    System.out.println("Asphalt Car Performance: " + asphaltPerformance);
        


       
        
    }
}