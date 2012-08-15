/*
 * This class represents the Edge in the Graph
 */

package com.borromeo.edge;

import com.borromeo.vertex.Vertex;


public class Edge {

	protected Vertex v1;
	protected Vertex v2;
	
	
    public Edge() {
    	
    }
    
    public Edge( Vertex x, Vertex y) {
    	
    	
    	v1 = new Vertex(x.el);
    	v2 = new Vertex(y.el);
    	
    }
    
    public Vertex getV1() {
    	return v1;
    }
    
    public Vertex getV2() {
    	return v2;
    }
    
    public String toString() {
    	return v1.el + " -> " + v2.el;
    }
}