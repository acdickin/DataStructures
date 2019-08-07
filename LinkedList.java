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
public class LinkedList {
    private Node head;
    public void insertAtHead(int data){
        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head= newNode;
    }
    public int length(){
        int size =0;
        Node current = this.head;
        while(current != null){
            size ++;
            current= current.getNextNode();
        }
        return size;
    }
    public void deleteFromHead(){
        this.head= this.head.getNextNode();
    }
    public Node find(int num){
        Node current = this.head;
        while (current !=null){
            if(current.getData()==num){
                return  current;
            }
            current = current.getNextNode();
        }
        return null;
    }
    
    @Override
    public String toString() {
        Node current = this.head;
        String result= "LinkedList{";
        while(current !=null){
            result += current.toString()+",";
            current= current.getNextNode();
        }
        result += "}";
        return result;    
    }
    
}
