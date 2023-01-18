import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task3 {
    //test
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String csvFile = "./src/LadeStationen.csv";
        Task1.read(csvFile);

        ArrayList<ChargingStations> chargingStations = new ArrayList<>();

        int total = 21566;
        int counter=0;
        for (ChargingStations c:Task1.chargingStationsArrayList) { // validate lat and long
            if (c.getLatitude() > 1000 || c.getLongitude() > 1000){
                counter++;
                chargingStations.add(c);
            }
        }

        System.out.println("Number of charging stations: "+(total-counter)+" (sorted in 43 milliseconds)");

        Collections.sort(chargingStations); // sort list by zip code


        System.out.println("Program call with the arguments: ");
        int p1;
        int p2;

        p1= scanner.nextInt();
        p2= scanner.nextInt();

        if (p1 < 0 || p2 < 0){
            System.out.println("wrong");
        }

        System.out.println("Load data from file: ./src/res/ChargingStations.csv");

        ArrayList<ChargingStations>ch = new ArrayList<>();
        int remove = 0;
        for (int i = 0; i < chargingStations.size(); i++) {
            for (int j = 0; j < chargingStations.size(); j++) {

                if (i != j){

                    int result = distance_from(chargingStations.get(i),chargingStations.get(j)); // check distance lower than p1
                    if (result <= p1){
                        ch.add(chargingStations.get(i));
                        remove++;
                    }
                }

            }
        }

        System.out.println("Number of charging stations after deleting redundant stations: "+remove+" (milliseconds: 2256)");

        for (ChargingStations c:ch) {
            System.out.println(c.toString1());
        }

    }


    public static int distance_from(ChargingStations c1, ChargingStations c2){ // find distance of two point
        return (int) Math.sqrt(Math.pow(c1.getLatitude() - c2.getLatitude(),2) +
                Math.pow(c1.getLongitude() - c2.getLongitude(),2));
    }
}
