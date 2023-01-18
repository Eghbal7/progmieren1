public class ChargingStations implements Comparable {

    private String street;
    private String house;
    private String number;
    private int zip_code;
    private String city;
    private String state;
    private double latitude;
    private double longitude;
    private double connected_load;
						//constructor
    public ChargingStations(String street, String house, String number, int zip_code, String city, String state, double latitude, double longitude, double connected_load) {
        this.street = street;
        this.house = house;
        this.number = number;
        this.zip_code = zip_code;
        this.city = city;
        this.state = state;
        this.latitude = latitude;
        this.longitude = longitude;
        this.connected_load = connected_load;
    }
//setter and getter


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getZip_code() {
        return zip_code;
    }

    public void setZip_code(int zip_code) {
        this.zip_code = zip_code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getConnected_load() {
        return connected_load;
    }

    public void setConnected_load(double connected_load) {
        this.connected_load = connected_load;
    }

    @Override
    public String toString() {
        return "ChargingStations{" +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }


    public String toString1() {
        return "" +
                "" + street  +
                ", " + house +
                ", " + number +
                ", " + zip_code +
                ", " + city +
                ", " + state +
                ", " + connected_load +
                "";
    }

	//compare zip_code

    @Override
    public int compareTo(Object chargingStations) {
        int compareage=((ChargingStations)chargingStations).getZip_code();
        /* For Ascending order*/
        return this.zip_code-compareage;
    }
}
