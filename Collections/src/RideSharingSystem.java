import java.util.*;

class RideRequest {
    int urgency;
    String user;
    RideRequest(String u, int s){ user=u; urgency=s; }

    public String toString(){
        return user + " (urgency " + urgency + ")";
    }
}

class Driver {
    String name;
    Driver(String n){ name=n; }
    public String toString(){ return name; }
}

public class RideSharingSystem {
    public static void main(String[] args) {

        Queue<RideRequest> normalRequests = new LinkedList<>();
        normalRequests.add(new RideRequest("UserA", 1));
        normalRequests.add(new RideRequest("UserB", 1));

        PriorityQueue<RideRequest> priorityQueue =
                new PriorityQueue<>((a,b)->b.urgency - a.urgency);

        priorityQueue.add(new RideRequest("VIP1", 5));
        priorityQueue.add(new RideRequest("VIP2", 4));

        Set<Driver> availableDrivers = new HashSet<>();
        availableDrivers.add(new Driver("D1"));
        availableDrivers.add(new Driver("D2"));

        List<String> completedRides = new ArrayList<>();

        System.out.println("Assigning VIP rides:");
        while (!priorityQueue.isEmpty() && !availableDrivers.isEmpty()) {
            RideRequest req = priorityQueue.remove();
            Driver d = availableDrivers.iterator().next();
            availableDrivers.remove(d);
            completedRides.add(req + " → Driver " + d);
        }

        System.out.println("Assigning normal rides:");
        while (!normalRequests.isEmpty() && !availableDrivers.isEmpty()) {
            RideRequest req = normalRequests.remove();
            Driver d = availableDrivers.iterator().next();
            availableDrivers.remove(d);
            completedRides.add(req + " → Driver " + d);
        }

        System.out.println("Completed rides:");
        for (String s : completedRides) System.out.println(s);
    }
}
