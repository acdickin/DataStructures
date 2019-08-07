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
public class SelectionSorter extends Sorter {
    @Override
    // find smallest element and put it in the first location
    // find second smallest element put it in second  location
    public int[] sort(int[] data){
        for (int i = 0; i < data.length -1; i++) {
            int minIndex = i;
            for (int j = i+1; j < data.length; j++) {
                if (data[j]< data[minIndex]){
                    minIndex =j;
                }
            }
            int temp = data[minIndex];
            data[minIndex]= data[i];
            data[i]=temp;
            
        }
        return data;
    }
}
