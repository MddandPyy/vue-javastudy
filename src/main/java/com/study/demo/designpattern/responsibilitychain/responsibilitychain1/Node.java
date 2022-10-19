package com.study.demo.designpattern.responsibilitychain.responsibilitychain1;

public abstract class Node {

    Node node;
    String nodeName;

    public Node(String nodeName){
        this.nodeName = nodeName;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    abstract void processRequest(PersonRequest request);


}
