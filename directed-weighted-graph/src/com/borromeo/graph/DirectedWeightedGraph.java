/*
 * This class extends the WeightedGraph. I adds a direction to a weighted Graph
 */
package com.borromeo.graph;

import java.io.*;
import java.util.*;

import com.borromeo.edge.Edge;
import com.borromeo.edge.WeightedEdge;
import com.borromeo.vertex.Vertex;

public class DirectedWeightedGraph extends WeightedGraph{
	
	WeightedEdge edge;
	
	public DirectedWeightedGraph(){
		super();
	}
	
	public void addEdge(Edge e, int weight) {
    	
    	incrementEdges();
    	matrix[e.getV1().el] [e.getV2().el] = weight;
    	
    }
    
    public Vector edgeList(){
    	Vector theList = new Vector();
    	
    	for(int i=0; i<matrix.length; i++){
    		for(int j=0; j<matrix.length; j++)
    			if(matrix[i][j] != Integer.MAX_VALUE)
    				theList.addElement(new WeightedEdge(new Vertex(i),new Vertex(j),matrix[i][j]));
    	}
    	
    	return theList;
    }
    
    public void displayEdges(Vector list){
    	
    	for(int i=0; i<list.size(); i++)
    		System.out.println(list.elementAt(i));
    }
    

}//end - class

	
	
