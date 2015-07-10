package com.cloudadic.entity;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Class that stores the contacts as nodes and relations as edges in the form of a graph
 * @author Maaniccka Poonkundran
 */
public class Graph {
	
	public int noOfNodes;
	private List<Node> nodesList = null;
	private List<Edge> edgesList = null;
	private Map<String, Node> nodesHashMap = null;

	/**
	 * Default Constructor
	 */
	public Graph() {
		noOfNodes = 0;
		nodesList = new LinkedList<Node>();
		edgesList = new LinkedList<Edge>();
		nodesHashMap = new HashMap<String, Node>();
	}

	/**
	 * Getters and Setters
	 * @return
	 */
	public List<Node> getNodesList() {
		return nodesList;
	}

	public List<Edge> getEdgesList() {
		return edgesList;
	}

	public Map<String, Node> getNodesHashMap() {
		return nodesHashMap;
	}

	public void addNodesAndEdges(Node node1, Node node2, String edgeRelation) {

		if(nodesHashMap.containsKey(node1.getMobileNo()))
			node1 = nodesHashMap.get(node1.getMobileNo());
		else {
			node1.id = ++noOfNodes;
			nodesHashMap.put(node1.getMobileNo(), node1);
			nodesList.add(node1);
		}
		
		if(nodesHashMap.containsKey(node2.getMobileNo()))
			node2 = nodesHashMap.get(node2.getMobileNo());
		else {
			node2.id = ++noOfNodes;
			nodesHashMap.put(node2.getMobileNo(), node2);
			nodesList.add(node2);
		}

		Edge edge = new Edge(node1, node2, edgeRelation);
		edgesList.add(edge);
		node1.adjListEdges.add(edge);
		node2.adjListEdges.add(edge);
		
	}
	
	public void PrintGraph() {
		System.out.println("----- Printing the graph! -----");
		for(Node node : nodesList)
			System.out.println(node);
	}

	public void PrintEdges() {
		System.out.println("\n\n ------- Printing Edges List --------");
		for(Edge edge : edgesList) 
			System.out.println(edge);
	}

}
