import java.io.*;
import java.util.ArrayList;



public class Task1 {

    public static ArrayList<ChargingStations>chargingStationsArrayList = new ArrayList<>(); //make list of class
    public static final String delimiter = ";"; 
    public static void read(String csvFile) {  //read file
        try {
            File file = new File(csvFile);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] s;
            while((line = br.readLine()) != null) {
                s = line.split(delimiter);

                chargingStationsArrayList.add(new ChargingStations(s[0],s[1],s[2],Integer.parseInt(s[3]),
                        s[4],s[5],Double.parseDouble(s[6]),Double.parseDouble(s[7]),Double.parseDouble(s[8])));
            }

            br.close();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
    public static void main(String[] args) {
        // csv file to read
        String csvFile = "./src/LadeStationen.csv";
        read(csvFile);

        int total = 21566;
        int counter=0;
        for (ChargingStations c:chargingStationsArrayList) {  // validate lat and long 
            if (c.getLatitude() > 1000 || c.getLongitude() > 1000){
                System.out.println("Do not enter charging station. Incorrect latitude or longitude:");
                System.out.println(c.toString());
                counter++;
            }

        }
        System.out.println("Number of valid charging stations: "+(total - counter));

    }


}