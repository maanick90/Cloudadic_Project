package com.cloudadic.domain;

import com.cloudadic.entity.Graph;
import com.cloudadic.entity.Node;

/**
 * Class that handles the input and creates the graph
 * @author Maaniccka Poonkundran
 *
 */
public class OperatorFunction {

	public Graph graph = null;
	public Node rootNode = null;
	
	/**
	 * Default Constructor
	 */
	public OperatorFunction() {
		graph = new Graph();
		rootNode = new Node();
	}
	
	/**
	 * Method to add the first node to the graph
	 * @param inputStr
	 */
	public void addRootNode(String inputStr) {
		String strValues[] = inputStr.split(",");
		rootNode = new Node(strValues[0].trim(), strValues[1].trim(), strValues[2].trim(), strValues[3].trim());
		rootNode.id = 1;
		++graph.noOfNodes;
		graph.getNodesList().add(rootNode);
		graph.getNodesHashMap().put(rootNode.getMobileNo(), rootNode);
	}
	
	/**
	 * Method which adds all the remaining nodes and edges to the graph
	 * @param inputStr
	 */
	public void addAllNodes(String inputStr) {
		String strValues[] = inputStr.split(",");
		Node node1 = new Node(strValues[0].trim(), strValues[1].trim(), strValues[2].trim(), strValues[3].trim());  // new node
		Node node2;
		for(int i=4;i<strValues.length;i=i+3) {
			node2 = new Node(strValues[i].trim(), null, strValues[i+2].trim(), null);	// adding the relation
			graph.addNodesAndEdges(node2, node1, strValues[i+1].trim());
		}
	}
}
