/*
 * This class represents the Vertex in the Graph
 */

package com.borromeo.vertex;


public class Vertex {

	public int el;
	
    public Vertex() {
    }
    
    public Vertex(int num) {
    	el = num;
    }
    
    public String toString() {
    	return "" + el;
    }
}