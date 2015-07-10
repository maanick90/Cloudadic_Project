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
	private Map<String, Node> nodesHashMap = null;		// (Key, values) = (mobileNo, node)

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

	/**
	 * Method which returns the node given the mobile no
	 * @param mobileNo
	 * @return
	 */
	public Node getNodeGivenMobileNumber(String mobileNo) {
		if(nodesHashMap.containsKey(mobileNo))
			return nodesHashMap.get(mobileNo);
		else
			return null;
	}
	
	
	/**
	 * Mehtod that adds nodes and edges to the graph
	 * @param node1
	 * @param node2
	 * @param edgeRelation
	 */
	public void addNodesAndEdges(Node node1, Node node2, String edgeRelation) {

		if(nodesHashMap.containsKey(node1.getMobileNo()))
			node1 = nodesHashMap.get(node1.getMobileNo());
		else {
			node1.id = ++noOfNodes;							// setting the node id
			nodesHashMap.put(node1.getMobileNo(), node1);
			nodesList.add(node1);
		}
		
		if(nodesHashMap.containsKey(node2.getMobileNo()))
			node2 = nodesHashMap.get(node2.getMobileNo());
		else {
			node2.id = ++noOfNodes;							// setting the node id
			nodesHashMap.put(node2.getMobileNo(), node2);
			nodesList.add(node2);
		}

		Edge edge = new Edge(node1, node2, edgeRelation);
		edgesList.add(edge);								// adding the edge to the list
		node1.adjListEdges.add(edge);
		node2.adjListEdges.add(edge);
		
	}
	
	/**
	 * Method to print all the nodes of the graph
	 */
	public void PrintAllNodes() {
		System.out.println("----- Printing Nodes List! -----");
		for(Node node : nodesList)
			System.out.println(node);
	}

	/**
	 * Method to print all the edges of the graph
	 */
	public void PrintAllEdges() {
		System.out.println("\n\n ------- Printing Edges List! --------");
		for(Edge edge : edgesList) 
			System.out.println(edge);
	}

}
