package Info_911;

public class W911 extends nine_one_one {                        // Handles wireless 911 calls
    private Double Latitude;
    private Double Longitude;

    private String Reverse_geo_code = "Dale's House";
    private int Reliability = 75;

    public double getLatitude() {                               // Get Latitude
        return Latitude;
    }

    public double getLongitude() {                              // Get Longitude
        return Longitude;
    }

    public int getReliability() {                               // Get geocode reliability
        return Reliability;
    }

    public String getReverse_geo_code() {                       // New reverse geocode
        return Reverse_geo_code;
    }

    public void setLatitude(double Latitude) {                  // Set latitude
        this.Latitude = Latitude;
    }

    public void setLongitude(double Longitude) {                // Set longitude
        this.Longitude = Longitude;
    }

    public void setReliability(int reliability) {               // Set reliability
        this.Reliability = reliability;
    }

    public void setReverse_geo_code(String reverse_geo_code) {  // Set new geocode
        this.Reverse_geo_code = reverse_geo_code;
    }

    @Override
    public String toString() {
        return String.format("%sLatitude: %f%nLongitude: %f%nReliability: %d%nReverse geo code: %s%n",
                super.toString(), getLatitude(), getLongitude(), getReliability(), getReverse_geo_code());
    }
}


/**
 * Created by aaronewing on 10/21/2016. *
 */