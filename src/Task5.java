import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String csvFile = "./src/LadeStationen.csv";
        Task1.read(csvFile);

        LinkedList list = new LinkedList();

        for (ChargingStations c:Task1.chargingStationsArrayList) {
//            if (c.getLatitude() > 1000 || c.getLongitude() > 1000){
                list.insertFirst(c);
//            }
        }

        System.out.println("Please enter the zip code (must be in the graph) of the starting node:");
        int zip_code_start = scanner.nextInt();

        System.out.println("Please enter the zip code of the destination node:");
        int zip_code_destination = scanner.nextInt();

        System.out.println("Find a path Start/Destination: "+zip_code_start+", "+zip_code_destination);
		
	//search zip_code 
        if (list.findNode(zip_code_start) && list.findNode(zip_code_destination)){
            System.out.println("This zip code is reachable from "+zip_code_start+" : "+zip_code_destination);

        }




    }

}
