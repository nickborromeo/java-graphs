/*
 * Class that extends Graph and implement a directed Graph
 */
package com.borromeo.graph;

import java.util.*;
import com.borromeo.edge.Edge;

public class DirectedGraph extends Graph {
	

    public DirectedGraph() {
    	
    	super();
    	
    }
    
    public DirectedGraph(int size) {
    	
    	super(size);
    	
    }
    
    
    // adding edge is different for a directed graph   
    public void addEdge(Edge e) {
    	
    	incrementEdges();
    	matrix[e.getV1().el] [e.getV2().el] = 1;
    	
    }
    
 
}  //end DirectedGraph
