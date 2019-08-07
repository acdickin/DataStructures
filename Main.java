/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acosmic.datastructuresandalgorithm;

import java.util.Arrays;

/**
 *
 * @author v-andick
 */
public class Main {

    public static void main (String args[] ){
        int[] data ={7,3,6,8,2};

        BinarySearchTree BST = new BinarySearchTree();
        BST.insert(5);
        BST.insert(1);
        for(int num:data){
            BST.insert(num);
        }
        BST.inOrder();
        BST.preOrder(); 
//        BubbleSorter bs = new BubbleSorter();
//        SelectionSorter ss = new SelectionSorter();
//        InsertionSorter is =new InsertionSorter();
//        
//        int[] bsSorted = bs.sort(data);
//        int[] ssSorter = ss.sort(data);
//        int[] isSorted = is.sort(data);
//       
//        LinkedList list = new LinkedList();
//        list.insertAtHead(5);
//        list.insertAtHead(10);
//        list.insertAtHead(2);
//        list.insertAtHead(12);
//        list.insertAtHead(19);
//        list.insertAtHead(20);
//        list.deleteFromHead();
//        
//        System.out.println(list);
//        System.out.println("Length: "+ list.length());
//        System.out.println(list.find(2));
//        
//        DoublyLinkedList dlist= new DoublyLinkedList();
//        dlist.insertAtTail(5);
//        dlist.insertAtTail(10);
//        dlist.insertAtTail(2);
//        dlist.insertAtTail(12);
//        dlist.insertAtTail(19);
//        dlist.insertAtTail(20);
//        System.out.println(dlist);
//        
//        MergeSorter mergeSort = new MergeSorter();
//        mergeSort.sort(data);
//        System.out.println(Arrays.toString(data));
    }
}
