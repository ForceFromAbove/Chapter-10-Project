package Info_911;

public class E911 extends nine_one_one {            // Handles land line 911 calls
    private String Address;

    public E911(String name, String time, String phone_number, String nature, boolean accidental_call, String[] description, String[] responding_units, String status, boolean cell_phone, String address, Double latitude, Double longitude, String reverse_geo_code, int reliability) {
        super(name, time, phone_number, nature, accidental_call, description, responding_units, status, cell_phone, address, latitude, longitude, reverse_geo_code, reliability);
    }

    public E911() {
        super();
    }

    public String getAddress() {                    // Get address
        return Address;
    }

    public void setAddress(String address) {        // Set address
        super.getAddress(address);
     //   this.Address = Address;
    }

    @Override
    public String toString() {
        return String.format("%sAddress: %s%n", super.toString(), getAddress());
    }
}


/**
 * Created by aaronewing on 10/21/2016.
 */