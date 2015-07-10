package com.cloudadic.entity;

/**
 * Class which stores the relation between 2 person(nodes) as an edge in the graph
 * @author Maaniccka Poonkundran
 *
 */
public class Edge {
	
	private Node node1 = null, node2 = null;
	private String edgeRelation;
	
	/**
	 * Default Constructor
	 */
	public Edge() {
	}
	
	/**
	 * Parameterized Constructor
	 * @param node1
	 * @param node2
	 * @param edgeRelation
	 */
	public Edge(Node node1, Node node2, String edgeRelation) {
		this.node1 = node1;
		this.node2 = node2;
		this.edgeRelation = edgeRelation;
	}
	
	/**
	 * Getters and Setters
	 */
	public Node getNode1() {
		return node1;
	}

	public Node getNode2() {
		return node2;
	}

	public String getEdgeRelation() {
		return edgeRelation;
	}
	
	/**
	 * toString() overriden method
	 */
	public String toString() {
		return "("+node1.getFirstName()+","+node2.getFirstName()+","+edgeRelation+")";
	}
	
}
