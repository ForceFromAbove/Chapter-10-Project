import java.util.InputMismatchException;
import java.util.Scanner;

import Info_911.E911;                                   // Import packets
import Info_911.W911;
import Info_911.nine_one_one;

public class Chapter_10_Project {

    public static void main(String[] args) {            // Test driver
        Scanner user_Input = new Scanner(System.in);    // Used to get input from user
        E911 Enhanced = new E911();
        W911 Wireless = new W911();                     // Creating objects
        nine_one_one Emerg = new nine_one_one();

        boolean hardcoded = true;
        try {
            System.out.println("Please enter true for hardcode, false for user interaction:");      // User decides to use hardcoded values or not
            hardcoded = user_Input.nextBoolean();
        } catch (InputMismatchException e) {                                                        // Error message
            System.out.println("Sorry, didn't catch that ;) I'm going to assume hardcoded then...");
        }

        if (hardcoded) {                                                                            // Data sent to nine_one_one class if hardcoded
            Emerg.setName("Bill Murry");
            Emerg.setTime("Lunchtime");
            Enhanced.setAddress("666 The Street With No Name");
            Wireless.setReliability(0);
            Wireless.setReverse_geo_code("Your mama's house");
            Emerg.setPhone_Number("0118-999-881-999-119-725-3");
            Wireless.setLatitude(0.00000000);
            Wireless.setLongitude(-89.2);
            Emerg.setNature("The ending to LOST keeps me up at night");
            Emerg.setAccidental_Call(true);
            Emerg.setStatus("I hate prank calls, they keep me away from serious business! *eats doughnut*");

            System.out.printf("Name: %s%n", Emerg.getName());                                       // Prints hardcoded data from nine_one_one class
            System.out.printf("Time: %s%n", Emerg.getTime());
            System.out.printf("Address: %s%n", Enhanced.getAddress());
            System.out.printf("Address Reliability: %s%%%n", Wireless.getReliability());
            System.out.printf("Reverse geocode: %s%n", Wireless.getReverse_geo_code());
            System.out.printf("Phone Number: %s%n", Emerg.getPhone_Number());
            System.out.printf("Cell Phone: %b%n", Emerg.getcell_Phone());
            System.out.printf("Latitude: %f%n", Wireless.getLatitude());
            System.out.printf("Longitude: %f (coldest day on Earth!)%n", Wireless.getLongitude());
            System.out.printf("Nature of call: %s%n", Emerg.getNature());
            System.out.printf("Accidental Call: %b%n", Emerg.getAccidental_Call());
            System.out.printf("Status of Emergency: %s%n", Emerg.getStatus());

        } else {

            try {
                System.out.printf("This is 911, Alright are you calling from cellphone? (true/false)%n");   // User inputs cell phone or not
                Emerg.setCell_Phone(user_Input.nextBoolean());
                System.out.printf("Cell Phone: %b%n", Emerg.getcell_Phone());                               // Phone Number stored
            } catch (InputMismatchException e) {
                System.out.println("Can you please repeat that, are you on a cell phone?");                 // Error message
                System.exit(1);
            }

            if (Emerg.getcell_Phone()) {                                                                    // If cell phone is used
                try {
                    System.out.println("What is the address of the emergency?");                            // User inputs Address
                    user_Input.nextLine();                                                                  // Java needs something to absorb
                    Enhanced.setAddress(user_Input.nextLine());
                    System.out.printf("Address: %s%n", Enhanced.getAddress());                              // Address stored
                } catch (InputMismatchException e) {
                    System.out.println("Please repeat that, I asked where you?");                           // Error message
                    System.exit(2);
                }
            }
            else {                                                                                          // If cell phone not used
                user_Input.nextLine();
            }
            System.out.println("What is the nature of your emergency?");                                    // Prints nature of emergency

            try {
                Emerg.setNature(user_Input.nextLine());
                System.out.printf("Nature of call: %s%n", Emerg.getNature());                               // Nature of emergency stored
            } catch (InputMismatchException e) {
                System.out.println("Please repeat that, what is currently happening?");                     // Error message
                System.exit(3);
            }

            try {
                System.out.println("Alright, help is on the way. What is your name?");                      // User inputs name
                Emerg.setName(user_Input.nextLine());
                System.out.printf("Name: %s%n", Emerg.getName());                                           // Name stored
            } catch (InputMismatchException e) {
                System.out.println("Please repeat that, what is your name?");                               // Error message
                System.exit(4);
            }

            try {
                System.out.printf("Alright %s, what is your phone number in case we lose contact?%n", Emerg.getName());   // User inputs phone number
                Emerg.setPhone_Number(user_Input.nextLine());
                System.out.printf("Phone Number: %s%n%n", Emerg.getPhone_Number());                         // Phone Number stored
            } catch (InputMismatchException e) {
                System.out.println("Can you please repeat that, what is your phone number?");               // Error message
                System.exit(5);
            }

            System.out.println("After the situation is over, the operator must enter in the appropriate information into the computer");

            try {
                System.out.println("*The computer cursor blinks and has a simple command input line* Input \"Time of Call:\"");   // User inputs Time
                Emerg.setTime(user_Input.nextLine());
                System.out.printf("Time: %s%n", Emerg.getTime());                                           // Phone Time stored
            } catch (InputMismatchException e) {
                System.out.println("ERROR!!! Invalid input data type!");                                    // Error message
                System.exit(6);
            }

            if (Emerg.getcell_Phone()) {                                                                    // If cell phone
                try {
                    System.out.println("Input \"Caller's Latitude(-90 to 90):\"");                          // User inputs Latitude
                    Wireless.setLatitude(user_Input.nextDouble());
                    System.out.printf("Latitude: %f%n", Wireless.getLatitude());                            // Latitude stored
                    if (Wireless.getLatitude() < -90 || Wireless.getLatitude() > 90) {                      // Is Latitude valid?
                        throw new InputMismatchException();                                                 // If not valid, throw error
                    }
                } catch (InputMismatchException e) {
                    System.out.println("ERROR!!! Invalid input data type/range!");                          // Error message
                    System.exit(7);
                }

                try {
                    System.out.println("Input \"Caller's Longitude (-180 to 180):\"");                      // User inputs Longitude
                    Wireless.setLongitude(user_Input.nextDouble());
                    System.out.printf("Longitude: %f%n", Wireless.getLongitude());                          // Longitude stored
                    if (Wireless.getLongitude() < -180 || Wireless.getLongitude() > 180) {                  // Is Longitude valid?
                        throw new InputMismatchException();                                                 // If not valid, throw error
                    }
                } catch (InputMismatchException e) {
                    System.out.println("ERROR!!! Invalid input data type/range!");                          // Error message
                    System.exit(8);
                }

                try {
                    System.out.printf("Input \"new reverse geocoding address\" (default value: %s)%n", Wireless.getReverse_geo_code());         // User inputs reverse geocode
                    user_Input.nextLine();
                    Wireless.setReverse_geo_code(user_Input.nextLine());
                    System.out.printf("Reverse geocoding: %s%n", Wireless.getReverse_geo_code());           // Reverse geocode stored
                } catch (InputMismatchException e) {
                    System.out.println("ERROR!!! Invalid input data type!");                                // Error message
                    System.exit(9);
                }

                try {
                    System.out.printf("Input \"new accuracy of reverse geocoding address\" (default value: %d)%n", Wireless.getReliability());  // User inputs reliability of geocoding
                    Wireless.setReliability(user_Input.nextInt());
                    System.out.printf("accuracy: %d%n", Wireless.getReliability());                         // reliability of reverse geocoding stored
                } catch (InputMismatchException e) {
                    System.out.println("ERROR!!! Invalid input data type!");                                // Error message
                    System.exit(10);
                }
            }

            try {
                System.out.println("Input \"Was the Caller's call accidental in nature (true/false)?:\"");  // User inputs accidental call
                Emerg.setAccidental_Call(user_Input.nextBoolean());
                System.out.printf("Accidental Call: %b%n", Emerg.getAccidental_Call());                     // Accidental call stored
            } catch (InputMismatchException e) {
                System.out.println("ERROR!!! Invalid input data type!");                                    // Error message
                System.exit(11);
            }

            try {
                System.out.println("Input \"Caller's Status?:\"");                                          // User inputs status of emergency
                user_Input.nextLine();
                Emerg.setStatus(user_Input.nextLine());
                System.out.printf("Caller's Status: %s%n", Emerg.getStatus());                              // Status stored
            } catch (InputMismatchException e) {
                System.out.println("ERROR!!! Invalid input data type!");                                    // Error message
                System.exit(12);
            }

            try {
                System.out.println("Input \"Description of call? (exit to stop):\"");                       // User inputs description of call
                String des = user_Input.nextLine();
                while (!des.equals("exit")) {                                                               // While user input is not exit
                    Emerg.addDescription(des);
                    des = user_Input.nextLine();
                }
            } catch (InputMismatchException e) {
                System.out.println("ERROR!!! Invalid input data type!");                                    // Error message
                System.exit(11);
            }
            if (Emerg.getDes_Count() == 0) {                                                                // If no user input other than exit
                System.out.printf("No Description? You're fired!%n");
            } else {
                for (int j = 0; j < Emerg.getDes_Count(); j++) {
                    System.out.printf("Description %d: %s%n", j, Emerg.getDescription()[j]);                // Units responding stored
                }
            }

            try {
                System.out.println("Input \"Responding units to Caller's location? (exit to stop):\"");         // User inputs units responding to call
                String uints = user_Input.nextLine();
                while (!uints.equals("exit")) {                                                                 // While user input is not exit
                    Emerg.addResponding_Units(uints);
                    uints = user_Input.nextLine();
                }
            } catch (InputMismatchException e) {
                System.out.println("ERROR!!! Invalid input data type!");                                        // Error message
                System.exit(11);
            }
            if (Emerg.getUnits_Count() == 0) {                                                                  // If no user input other than exit
                System.out.printf("No Responding Units (uh oh O.o)%n");
            } else {
                for (int i = 0; i < Emerg.getUnits_Count(); i++) {
                    System.out.printf("Responding Units %d: %s%n", i, Emerg.getResponding_Units()[i]);          // Units responding stored
                }
            }

            System.out.println("*The Computer screen goes blank and then says a simple message* Thank you for your input.");    // Exit message
        }
    }
}
/*
 * Created by aaronewing on 9/8/2016.
 */