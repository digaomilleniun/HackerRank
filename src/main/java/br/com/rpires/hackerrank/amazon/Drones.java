/**
 * 
 */
package br.com.rpires.hackerrank.amazon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Rodrigo Pires
 *
 */
public class Drones {

	private static class Drone {
        private int id;
        private int flightRange;

        public Drone(int id, int flightRange) {

            this.id = id;
            this.flightRange = flightRange;
        }

        public int getId() {
            return id;
        }

        public int getFlightRange() {
            return flightRange;
        }
    }
	
	static List<Integer> greatestFlightRangeDrones(Integer numberOfRequiredDrones, List<Drone> drones, List<Integer> inMaintenanceDrones) {
        // TODO: implement this function
		return null;
    }

    // The first line of the input contains three decimal integers separated by space: total number of drones ('D'), number of drones to be selected ('G') and number of drones in maintenance ('M').
    // The following 'D' lines each contains two decimal integers separated by space with information about each drone: ID and flight range in kilometers.
    // The following 'M' lines each contains the numeric ID of a drone currently in maintenance.

    // Print the IDs of the 'G' selected drones to the standard output, one per line, sorted by flight range (greater first).
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberOfDrones = in.nextInt();
        int numberOfRequiredDrones = in.nextInt();
        int numberOfDronesInMaintenance = in.nextInt();

        List<Drone> drones = new ArrayList<>();
        List<Integer> inMaintenanceDrones = new ArrayList<>();

        for(int i=0; i< numberOfDrones; i++) {
            drones.add(new Drone(in.nextInt(), in.nextInt()));
        }

        for(int i=0; i< numberOfDronesInMaintenance; i++) {
            inMaintenanceDrones.add(in.nextInt());
        }

        List<Integer> greatestFlightRangeDrones = greatestFlightRangeDrones(numberOfRequiredDrones, drones, inMaintenanceDrones);

        for(int i=0; i < greatestFlightRangeDrones.size(); i++) {
            System.out.println(greatestFlightRangeDrones.get(i));
        }

    	}
    }
