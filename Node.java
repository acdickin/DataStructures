/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acosmic.datastructuresandalgorithm;

/**
 *
 * @author v-andick
 */
public class Node {
    private int data;
    private Node nextNode;

    public Node(int data) {
        this.data = data;
    }
    public int getData(){
        return this.data;
    }
    public Node getNextNode(){
        return this.nextNode;
    }
    public void setData(int data) {
        this.data = data;
    }
    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{" + "Curent node data=" + data + '}';
    }
    
}
