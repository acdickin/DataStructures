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
public class BubbleSorter extends Sorter {
    @Override
    // Walks from left to right
    // and switches the smaller with the larger item 
    public int[] sort(int[] data) {
        for (int i = 0; i < data.length-1; i++) {
            for (int j = 0; j < data.length-1-i; j++) {
                if(data[j]>data[j+1]){
                    int temp = data[j+1];
                    data[j+1] = data[j];
                    data[j]=temp; 
                }
            }
        }
        return data;
    }
}
