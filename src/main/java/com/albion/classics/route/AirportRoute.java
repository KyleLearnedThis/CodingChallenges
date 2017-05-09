package com.albion.classics.route;

import java.util.*;

public class AirportRoute {

    /**
     * "SFO" -> "YVR" -> "CDG"
     * shortTrips is a N by 2 matrix. All short trips will be in used for making a route.
     * In other words, they will be all connected.
     * @param shortTrips
     * @return ArrayList that contains Airport code in connecting sequence.
     */
    public List<String> makeRoute(String[][] shortTrips){
        List<String> result = new ArrayList<>();
        Map<String, String> trips = new HashMap<>();
        for (int i = 0; i < shortTrips.length; i++) {
            String source = shortTrips[i][0];
            String destination = shortTrips[i][1];
            trips.put(source, destination);
        }

        String startingPoint = findStartingPoint(trips);
        result.add(startingPoint);

        int size = trips.size();
        for (int i = 0; i < size; i++) {
            String src = result.get(result.size() - 1);
            String dest = trips.get(src);
            result.add(dest);
        }
        return result;
    }

    public String findStartingPoint(Map<String, String> trips){
        Set<String> values = new HashSet<>(trips.values());
        for(Map.Entry<String, String> entry : trips.entrySet()){
            String source = entry.getKey();
            if(!values.contains(source)) {
                return source;
            }
        }
        return "";
    }
}
