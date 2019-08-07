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
public class Factorial {
    
    public int interativeFactorial(int n){
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *=i;
        }
        return result;
    }
    // more storage used in the stack
    public int recusiveFactorial(int n){
        if(n ==0)return 1;
        return n +recusiveFactorial(n -1);
    }
    // result is called an accumulator
    public int tailFactorial(int n, int result){
        if(n ==0)return result;
        return tailFactorial(n -1, n*result);
    }
    
    public int factorial (int n){
        return tailFactorial(n,1);
    }
}
