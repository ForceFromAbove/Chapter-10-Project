package Info_911;

public class nine_one_one {
    private String Name;
    private String Time;
    private String Phone_Number;
    private String Nature;
    private boolean Accidental_Call;
    private String Description[] = new String[100];             // List of up to 100 elements
    private String Responding_Units[] = new String[100];
    private String Status;
    private boolean cell_Phone;

    private int des_Count = 0;                                  // Array counters
    private int units_Count = 0;

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
}

/**
 * Created by aaronewing on 9/22/2016.
 */