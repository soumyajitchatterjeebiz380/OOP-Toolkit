package probelms;


public class MaximalNetworkRankCalculator {
	private int numberofCities;
	private int[][] roads;
	public MaximalNetworkRankCalculator(int numberofCities, int[][] roads) {
		super();
		this.numberofCities = numberofCities;
		this.roads = roads;
	}
	public int getNumberofCities() {
		return numberofCities;
	}
	public void setNumberofCities(int numberofCities) {
		this.numberofCities = numberofCities;
	}
	public int[][] getRoads() {
		return roads;
	}
	public void setRoads(int[][] roads) {
		this.roads = roads;
	}
	
	public int calculate() {
		
		int[] neighbors = new int[numberofCities];
        int[][] connected = new int[numberofCities][numberofCities];
		
		
		for(int[] road : roads) {
            int node1 = road[0];
            int node2 = road[1];
            neighbors[node1]++;
            neighbors[node2]++;
            connected[node1][node2] = 1;
            connected[node2][node1] = 1;
        }

        int max = Integer.MIN_VALUE;
        for(int currnode = 0; currnode < numberofCities; currnode++) {
            for(int neighbor = currnode+1; neighbor < numberofCities; neighbor++) {
                if( connected[currnode][neighbor] == 1 ||  connected[neighbor][currnode] == 1) {
                    max = Math.max(neighbors[currnode]+neighbors[neighbor]-1, max);
                }else{
                    max = Math.max(neighbors[currnode]+neighbors[neighbor], max);
                }
            }
        }

        return max;
	}
}
