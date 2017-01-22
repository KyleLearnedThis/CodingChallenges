package com.albion.salesforce.highway;

import com.albion.common.graph.core.Directions;
import com.albion.common.graph.core.v2.Edge;
import com.albion.common.graph.core.v2.Graph;
import com.albion.common.graph.core.v2.Vertex;
import com.albion.common.search.graph.DijkstraV2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class will manage a list of cities that may or may not be connected by highways.
 *
 */
public class HighwayManager {

    Graph graph;
	/**
	 * This data structure will hold a list of cities as well as the distance of each directly
	 * connected city
	 */
	private Map<String, HashMap<String, Integer>> cities;

	/**
	 * Constructor
	 */
	public HighwayManager() {
        graph = new Graph();
	}

	/**
	 * This is for you to implement<br>
	 *
	 * This method takes two city names and connects them with a highway by a certain distance<br>
	 *
	 * Note: The order of the city names should not matter.<br>
	 * Note: Don't forget to write tests in TestHighwayManager.java to have good coverage for this
	 * method<br>
	 */
	public void buildHighway(String city1, String city2, int distance) {
        HashMap<String, Vertex> cityMap = graph.getVerticesMap();
        Vertex c1 = cityMap.get(city1);
        Vertex c2 = cityMap.get(city2);

        if(c1 == null) {
            c1 = new Vertex(city1);
            List<Edge> list = new ArrayList<>();
            c1.setEdgeList(list);
            graph.getVerticesMap().put(city1, c1);
        }

        if(c2 == null) {
            c2 = new Vertex(city2);
            List<Edge> list = new ArrayList<>();
            c2.setEdgeList(list);
            graph.getVerticesMap().put(city2, c2);
        }

        Edge e1 = new Edge(city1, city2, Directions.BOTH, distance);
        Edge e2 = new Edge(city2, city1, Directions.BOTH, distance);
        c1.getEdgeList().add(e1);
        c2.getEdgeList().add(e2);
	}

	/**
	 * This is for you to implement<br>
	 *
	 * This method takes two city names and destroys the highway between them<br>
	 *
	 * Note: The order of the city names should not matter.<br>
	 * Note: Don't forget to write tests in TestHighwayManager.java to have good coverage for this
	 * method
	 */
	public void destroyHighway(String city1, String city2) {

	}

	/**
	 * This is for you to implement<br>
	 *
	 * Given a city name this should return the closest city connected by a highway<br>
	 *
	 * For example:<br>
	 * 		San Francisco is connected to Oakland by a 12 mile highway<br>
	 * 		San Francisco is also connected to San Jose by a 48 mile highway<br>
	 *
	 * This function should return Oakland if San Francisco is passed in as the parameter because it
	 * is the closest city at 12 miles away
	 *
	 * Note: Don't forget to write tests in TestHighwayManager.java to have good coverage for this
	 * method
	 */
	public String getClosestCity(String cityName) {
        Vertex v = graph.getVertex(cityName);
        int min = Integer.MAX_VALUE;
        String closestCity = "";
        List<Edge> list = v.getEdgeList();
        for (int i = 0; i < list.size(); i++) {
            Edge e = list.get(i);
            int weight = e.getWeight();
            if(weight < min) {
                min = weight;
                closestCity = e.getY();
            }
        }
        return closestCity;
	}

	/**
	 * This is for you to implement. Before starting this method make sure your other methods are
	 * complete well covered by tests<br>
	 *
	 * This method will return the shortest route between two cities.<br>
	 *
	 * For example:<br>
	 *
	 * 		San Francisco is connected to Oakland by a 12 mile highway<br>
	 * 		San Francisco is also connected to San Jose by a 48 mile highway<br>
	 * 		Oakland is connected to Sacramento by an 87 mile highway<br>
	 * 		Oakland is connected to San Jose by a 41 mile highway<br>
	 *
	 * Passing in San Jose and Sacramento should return 128 because the shortest distance is to go
	 * from San Jose to Oakland to Sacremento which is 41 + 87 miles.
	 *
	 * Note: Don't forget to write tests in TestHighwayManager.java to have good coverage for this
	 * method
	 */
	public int getShortestDistanceBetweenCities(String city1, String city2) {
	    DijkstraV2 dijkstra = new DijkstraV2(graph);
	    for(Map.Entry<String, Vertex> entry: graph.getVerticesMap().entrySet()){
	    	Vertex v = entry.getValue();
	    	v.previous = null;
		}
        List<Vertex> list = dijkstra.findShortestDistance(city1, city2);
        Vertex v = list.get(list.size() -1);
        int result = v.getCost();
        return result;
	}

}
