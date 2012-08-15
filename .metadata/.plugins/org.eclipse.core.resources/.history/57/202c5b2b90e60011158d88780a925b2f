/*
 * Base class the contains methods to define the characteristics of a Graph
 */

package com.borromeo.graph;
import com.borromeo.edge.Edge;


public class Graph {
	
	public final int MAX = 100;
	
	int[][]  matrix;
	int vertices;
	int edges;
	
    public Graph() {
    	matrix = new int[MAX] [MAX];	
    	vertices = edges = 0;
    }
 
    public Graph(int x) {
    	matrix = new int[x+1] [x+1];
    	vertices = edges = 0;	
    }
    
    public int getVertices() {
    	return vertices;
    }
    
    public int getEdges() {
    	return edges;
    }
    
    public void addEdge(Edge e) {
    	
    	incrementEdges();
    	matrix[e.getV1().el] [e.getV2().el] = 1;
    	matrix[e.getV2().el] [e.getV1().el] = 1;
    	
    }
    
    public void incrementEdges() {
    	edges++;
    }
    
    public void incrementVertices() {
    	vertices++;
    }
    
    public void initializeMatrix() {
    	
    	for(int i=0; i<matrix.length;i++ ) {
    		for(int j=0; j<matrix.length; j++) 
    			matrix[i][j] = 0;
    	}
    }
    
    public void displayMatrix() {
    	
    	for(int i=0; i<matrix.length;i++ ) {
    		for(int j=0; j<matrix.length; j++) 
    			System.out.print(matrix[i][j] + " ");
    		System.out.println();
    	}
    }
    
}  //end Graph
