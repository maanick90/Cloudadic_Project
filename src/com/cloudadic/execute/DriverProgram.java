package com.cloudadic.execute;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.cloudadic.domain.OperatorFunction;

public class DriverProgram {

	public static void main(String[] args) {
		
		OperatorFunction op = new OperatorFunction();
		BufferedReader br = null;
		String line;
		try {
			br = new BufferedReader(new FileReader(new File("InputContacts.txt")));
			op.addRootNode(br.readLine());
			while( (line = br.readLine()) != null) 
				op.addAllNodes(line);
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		op.graph.PrintGraph();
		op.graph.PrintEdges();
		
	}
}
