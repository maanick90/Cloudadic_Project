package com.cloudadic.execute;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.cloudadic.domain.OperatorFunction;

/**
 * Class which takes the input from a text file and calls methods in Operation Function to create the graph of contacts
 * @author Maaniccka Poonkundran
 *
 */
public class DriverProgram {

	public static void main(String[] args) {
		
		OperatorFunction op = new OperatorFunction();
		BufferedReader br = null;
		String line;
		try {
			br = new BufferedReader(new FileReader(new File("InputContacts.txt")));		// reading from the input file
			op.addRootNode(br.readLine());			// adding the first node
			while( (line = br.readLine()) != null) 
				op.addAllNodes(line);
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Print all nodes and all edges
		op.graph.PrintAllNodes();
		op.graph.PrintAllEdges();
		
	}
}
