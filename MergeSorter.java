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
public class MergeSorter  {
    public void sort(int[] data){
        mergeSort(data, 0, data.length-1);
    }
    public void mergeSort(int[] data, int start, int end) {
        if (start < end) {
                int mid = (int) Math.floor((start+end)/2);
                mergeSort(data, start, mid);
                mergeSort(data, mid+1, end);
                merge(data, start, mid, end);
        }
        
    }
    private static void merge(int[] data,int start, int mid, int end){
        // find out how many values in each
        int sizeLeft= mid - start+1;
        int sizeRight = end - mid;
        // indexes
        int[] left = new int[sizeLeft];
        int[] right = new int[sizeRight];
        //set the left and right arrays
        for (int i = 0; i < sizeLeft; i++) {
            left[i]=data[start +i];
        }
        for (int j = 0; j < 10; j++) {
            right[j]= data[mid+1+j];
        }
        int i=0,j=0;
        for (int k = start; k <= end; k++) {
            if( (j >= sizeRight) || (i < sizeLeft && left[i]<=right[j])){
                data[k]= left[i];
                i++;
            }   else{
                data[k]= right[j];
                j++;
            }
        }
    }   
}
