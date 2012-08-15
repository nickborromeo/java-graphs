package com.borromeo.main;

import java.io.*;
import java.util.*;

import com.borromeo.graph.DirectedGraph;
import com.borromeo.graph.Graph;
import com.borromeo.vertex.Vertex;
import com.borromeo.edge.Edge;;

public class DirectedGraphTest {
	
	
	
	public static void main(String[] args)  throws IOException {
		
		BufferedReader stdin = new BufferedReader(new FileReader("graph.in"));
		
		String input = stdin.readLine();
		
		int number = Integer.parseInt(input);
		
		int[] list = new int[number+1];
		Graph theGraph = new DirectedGraph(number);
				
		while (stdin.ready()) {
			input = stdin.readLine();
			String[] tokens = input.split(" ");
			
			int num1 = Integer.parseInt(tokens[0]);
			int num2 = Integer.parseInt(tokens[1]);
			
		
			Vertex v1 = new Vertex(num1);
			Vertex v2 = new Vertex(num2);
			
			if(!search(list,v1.el)) {
				list[num1]=1;
				theGraph.incrementVertices();
			}
						
			if(!search(list,v2.el)) {
				list[num2]=1;
				theGraph.incrementVertices();
			}
			
			Edge e1 = new Edge(v1, v2);
			
			theGraph.addEdge(e1);	
		}
	    
	    theGraph.displayMatrix(); 
	    	
		System.out.println();
		System.out.println("No. of vertices = " + theGraph.getVertices());
		System.out.println("No. of edges = " + theGraph.getEdges());
		
		System.out.print("Vertices : ");
		displayVertices(theGraph);
		System.out.println();
		/*
		System.out.println("Edges : " );
		displayEdges(theGraph);
		System.out.println();
		*/
		theGraph.depthFirstSearch();
		//theGraph.breadthFirstSearch();
		
	}  //end main
	
		
	static boolean search(int[] list, int number) {
		if(list[number] == 1)
			return true;
		return false;
	}
	
	static void displayVertices(Graph theGraph){
	
	 	//list of vertices
		Vector vertexList = theGraph.getVertexList();
		
		for(int i=0; i<vertexList.size(); i++)
			System.out.print((Vertex) vertexList.elementAt(i));
	}
	
	static void displayEdges(Graph theGraph){
	
	 	//list of edges
		Vector edgeList = theGraph.getEdgeList();
		
		for(int i=0; i<edgeList.size(); i++)
			System.out.println((Edge) edgeList.elementAt(i));

	}
		
}  //end GraphProgram1


