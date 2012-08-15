package com.borromeo.main;

import java.io.*;

import com.borromeo.edge.Edge;
import com.borromeo.graph.Graph;
import com.borromeo.vertex.Vertex;


public class GraphTester {
	
	
	public static void main(String[] args)  throws IOException {
		
		BufferedReader stdin = new BufferedReader(new FileReader("graph.in"));
		
		String input = stdin.readLine();
		
		int number = Integer.parseInt(input);
		
		int[] list = new int[number+1];
		Graph theGraph = new Graph(number);
				
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
		
		
	}  //end main
	
		
	static boolean search(int[] list, int number) {
		if(list[number] == 1)
			return true;
		return false;
	}
}  //end GraphProgram1


