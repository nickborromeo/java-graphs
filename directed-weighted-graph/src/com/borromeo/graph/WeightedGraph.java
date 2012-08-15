/*
 * This class extends the Graph class to add weight to it.
 */
package com.borromeo.graph;

import java.io.*;
import java.util.*;

public class WeightedGraph extends Graph{
	
	
	public WeightedGraph(){
		super();
	}
	
	public void initializeMatrix() {
    	int num = Integer.MAX_VALUE;
    	for(int i=0; i<matrix.length;i++ ) {
    		for(int j=0; j<matrix.length; j++) 
    			matrix[i][j] = num;
    	}
    }
	

}//end - class

	
	
