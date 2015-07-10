package com.cloudadic.domain;

import com.cloudadic.entity.Graph;
import com.cloudadic.entity.Node;

public class OperatorFunction {

	public Graph graph = null;
	public Node rootNode = null;
	
	public OperatorFunction() {
		graph = new Graph();
		rootNode = new Node();
	}
	
	public void addRootNode(String inputStr) {
		String strValues[] = inputStr.split(",");
		rootNode = new Node(1, strValues[0].trim(), strValues[1].trim(), strValues[2].trim(), strValues[3].trim()); 
		++graph.noOfNodes;
		graph.getNodesList().add(rootNode);
		graph.getNodesHashMap().put(rootNode.getMobileNo(), rootNode);
	}
	
	public void addAllNodes(String inputStr) {
		String strValues[] = inputStr.split(",");
		Node node1 = new Node(graph.noOfNodes+1, strValues[4].trim(), null, strValues[6].trim(), null);
		Node node2 = new Node(graph.noOfNodes+2, strValues[0].trim(), strValues[1].trim(), strValues[2].trim(), strValues[3].trim());
		graph.addNodesAndEdges(node1, node2, strValues[5].trim());
	}
}
