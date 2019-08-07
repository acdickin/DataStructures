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
public class QuickSorter  {
    public void sort(Integer[] data){
        quickSort(data, 0, data.length-1);
    }
    public void quickSort(Integer[] data, int start, int end){
        if(start<end){
            int pivotIndex = partition(data, start, end);
            quickSort(data, start, pivotIndex -1);
            quickSort(data, pivotIndex+1, end);
        }
    }
    public int partition(Integer[] data, int start, int end){
        int pivot = data[end];
        int i = start;
        for (int j =start; j < end - 1; j++) {
            if(data[j]< pivot){
                int tmp = data[i];
                data[i] = data[j];
                data[j]= tmp;
                i++;
            }
        }
        data[end] = data[i];
        data[i]= pivot;
        return i;
    }
}
