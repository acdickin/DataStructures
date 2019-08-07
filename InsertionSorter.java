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
public class InsertionSorter extends Sorter {
    @Override
    // compair and move. 
    // Check all elements to the left until we find the correct place
    public int[] sort(int[] data){
        for(int i = 0; i< data.length; i++){
            int current = data[i];
            int j = i-1;
            // >= will make it unstable
            while(j>= 0 && data[j] > current){
                data[j+1] = data[j];
                j --;
            }
            data[j+1] = current;
        }
        return data;
    } 
    // instead use generics
    public Circle[] sort(Circle[] data){
        for(int i = 0; i< data.length; i++){
            
            Circle current = data[i];
            int j = i-1;
            // >= will make it unstable
            while(j>= 0 && data[j].getRadius() > current.getRadius()){
                data[j+1] = data[j];
                j --;
            }
            data[j+1] = current;
        }
        return data;
    } 
}
