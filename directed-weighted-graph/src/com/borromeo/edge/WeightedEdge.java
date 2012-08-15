/*
 * This is an extension of the Edge class. I adds weights to a an Edge
 */

package com.borromeo.edge;

import java.io.*;
import java.util.*;
import com.borromeo.vertex.Vertex;

public class WeightedEdge extends Edge{
	
	protected int weight;
	
	public WeightedEdge(){
		super();
		weight = 0;
		
	}
	public WeightedEdge(Vertex x,Vertex y,int w)
	{
		super(x,y);
		weight=w;
	}
	
	public int getWeight(){
		return weight;
	}
	
	public String toString()
	{
		return (super.getV1().el+" -> "+ super.getV2().el + ", weight = "+weight);
	}

}//end - class

	
	
