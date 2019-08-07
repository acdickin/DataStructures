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
public class DoublyLinkedList {
    private DoublyLinkedNode head;
    private DoublyLinkedNode tail;
    public void insertAtHead(int data){
        DoublyLinkedNode newNode = new DoublyLinkedNode(data);
        newNode.setNextNode(this.head);
        if(this.head!=null){
            this.head.setPrevNode(newNode);
        }
    }
    public void insertAtTail(int data){
        DoublyLinkedNode newNode = new DoublyLinkedNode(data);
        if(this.head == null){
            this.head= newNode;
        }
        if(this.tail != null){
            this.tail.setNextNode(newNode);
            this.tail= newNode;
        }
        this.head= newNode;
    }
     public int length(){
        int size =0;
        DoublyLinkedNode current = this.head;
        while(current != null){
            size ++;
            current= current.getNextNode();
        }
        return size;
    }

    
    @Override
    public String toString() {
        DoublyLinkedNode current = this.head;
        String result= "LinkedList{";
        while(current !=null){
            result += current.toString()+",";
            current= current.getNextNode();
        }
        result += "}";
        return result;    
    }
}
