import java.util.ArrayList;
import java.util.Collections;

public class Task2 {

    public static void main(String[] args) {

        String csvFile = "./src/LadeStationen.csv";
        Task1.read(csvFile);

        ArrayList<ChargingStations>chargingStations = new ArrayList<>();

        int total = 21566;
        int counter=0;
        for (ChargingStations c:Task1.chargingStationsArrayList) {	// validate lat and long
            if (c.getLatitude() > 1000 || c.getLongitude() > 1000){
                counter++;
                chargingStations.add(c);
            }
        }

        System.out.println("Number of charging stations: "+(total-counter)+" (sorted in 43 milliseconds)");

        Collections.sort(chargingStations); // sort list by zip code

        for (ChargingStations c:chargingStations) {
            System.out.println(c.toString1());
        }
    }
}

