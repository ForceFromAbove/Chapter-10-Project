package Info_911;

abstract public class nine_one_one {
    private String Name;
    private String Time;
    private String Phone_Number;
    private String Nature;
    private boolean Accidental_Call;
    private String Description[] = new String[100];             // List of up to 100 elements
    private String FullDescription = "";
    private String Responding_Units[] = new String[100];
    private String FullRespondingUnits = "";
    private String Status;
    private boolean cell_Phone;

    private String Address;
    private double Latitude;
    private double Longitude;
    private String Reverse_geo_code;
    private int Reliability;

    private int des_Count = 0;                                  // Array counters
    private int units_Count = 0;

    public nine_one_one(String name, String time, String phone_number, String nature, boolean accidental_call,
                        String[] description, String[] responding_units, String status, boolean cell_phone,
                        String address, Double latitude, Double longitude, String reverse_geo_code, int reliability) {

        this.Name = name;
        this.Time = time;
        this.Phone_Number = phone_number;
        this.Nature = nature;
        this.Accidental_Call = accidental_call;
        this.Description = description;
        this.Responding_Units = responding_units;
        this.Status = status;
        this.cell_Phone = cell_phone;
    }

    public nine_one_one() {

    }

    public String getAddress(String address) {
        Address = address;
        return address;
    }

    public double getLatitude(double latitude) {
        Latitude = latitude;
        return latitude;
    }

    public double getLongitude(double longitude) {
        Longitude = longitude;
        return longitude;
    }

    public String getReverse_geo_code(String reverse_geo_code) {
        Reverse_geo_code = reverse_geo_code;
        return reverse_geo_code;
    }

    public int getReliability(int reliability) {
        Reliability = reliability;
        return reliability;
    }

    public void setFullDescription() {
        for (int i = 0;i <= des_Count; des_Count++) {
            FullDescription = FullDescription + Description[i];
        }
    }

    public void setFullRespondingUnits() {
        for (int i = 0;i <= units_Count; units_Count++) {
            FullRespondingUnits = FullRespondingUnits + Responding_Units[i];
        }
    }

    /*
    public String getFullDescription() {
        for (int i = 0;i <= des_Count; des_Count++) {
            FullDescription = FullDescription + Description[i];
        }
        return getFullDescription();
    }

    public String getFullRespondingUnits() {
        for (int i = 0;i <= units_Count; units_Count++) {
            FullRespondingUnits = FullRespondingUnits + Responding_Units[i];
        }
        return FullRespondingUnits;
    }
     */


    public String getName() {                                   // Get name
        return Name;
    }

    public Boolean getcell_Phone() {                            // Get if cell phone
        return cell_Phone;
    }

    public void setCell_Phone(boolean cell_Phone) {             // Set if cell phone
        this.cell_Phone = cell_Phone;
    }

    public String getTime() {                                   // Get time
        return Time;
    }

    public String getPhone_Number() {                           // Get phone number
        return Phone_Number;
    }

    public String getNature() {                                 // Get nature
        return Nature;
    }

    public boolean getAccidental_Call() {                       // Get accidental call
        return Accidental_Call;
    }

    public String[] getDescription() {                          // Get description list
        return Description;
    }

    public int getDes_Count() {                                 // Returns description counter
        return des_Count;
    }

    public String[] getResponding_Units() {                     // Get responding units list
        return Responding_Units;
    }

    public int getUnits_Count() {                               // Returns responding units count
        return units_Count;
    }

    public String getStatus() {                                 // Get status
        return Status;
    }

    public void setName(String Name) {                          // Set name
        this.Name = Name;
    }

    public void setTime (String Time) {                         // Set time
        this.Time = Time;
    }

    public void setPhone_Number(String Phone_Number) {          // Set phone number
        this.Phone_Number = Phone_Number;
    }

    public void setNature(String Nature) {                      // Set nature
        this.Nature = Nature;
    }

    public void setAccidental_Call(boolean Accidental_Call) {   // Set accidental call
        this.Accidental_Call = Accidental_Call;
    }

    public void addDescription(String Description) {            // Add single element to description list
        this.Description[des_Count] = Description;
        ++des_Count;
    }

    public void addResponding_Units(String Responding_Units) {  // Add single element to responding units list
        this.Responding_Units[units_Count] = Responding_Units;
        ++units_Count;
    }

    public void setStatus(String Status) {                      // Set status
        this.Status = Status;
    }

    @Override
    public String toString() {
        return String.format("Name: %s%nTime: %s%nPhone Number: %s%nNature of Call: %s%n" +
                "Accidential Call: %b%nDescription: %s%nResponding Units: %s%nStatus: %s%nCell Phone: %b%n",
                getName(), getTime(), getPhone_Number(), getNature(), getAccidental_Call(), getDescription(), getResponding_Units(), getStatus(), getcell_Phone());
    }
    /*
    @Override
    public String toString() {
        return String.format("Name: %s%nTime: %s%nPhone Number: %s%nNature of Call: %s%n" +
                        "Accidential Call: %b%nDescription: %s%nResponding Units: %s%nStatus: %s%nCell Phone: %b%n",
                getName(), getTime(), getPhone_Number(), getNature(), getAccidental_Call(), getFullDescription(), getFullRespondingUnits(), getStatus(), getcell_Phone());
    }
    */
}

/**
 * Created by aaronewing on 10/21/2016.
 */