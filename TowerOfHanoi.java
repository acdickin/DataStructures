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
public class TowerOfHanoi {
    // 3 towers a, b ,c
    // no bigger disc can be ontop of smaller
    // only move one at a time
    // if we have 2. move 1 to b then 2 to c and 1 to c
    // if we have 3. Move 1 to c. move 2 to b. move 1 to b. move 3 to c. move 1 to a. move 2 to c and move 1 to c.
    private void move(int numberOfDiscs,char from, char to, char using){
      if(numberOfDiscs ==1){
          System.out.println("Moving disc 1 from "+ from +" to "+to );
      }
      move(numberOfDiscs-1, from, using, to);
      System.out.println("Moving disc "+ numberOfDiscs +" from "+ from +" to "+to );
      move(numberOfDiscs -1, using, to, from);
    }
    
}
