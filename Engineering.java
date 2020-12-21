/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engineering;

/**
 *
 * @author katestallbaumer
 */
public class Engineering{
   private int length;
   private int width;
   //rectangle constructor 
   public Engineering(int xLength, int xWidth) {
       super();
       length = xLength;
       width = xWidth;
   }
   //circle constructor
   public Engineering(int xLength) {
       super();
       length = xLength;
       width = 0; //0 because it's not needed
   }
   //area of a circle
   public int circle(){
       return (int)3.14 * length * length;
   }
   //area of a rectangle
   public int rect(){
       if(width == 0){
           System.out.println("Error: Cannot calculate area when width = 0");
           return -1;
       }
       return length * width;
   }
   //grow or shrink the length
   public void changeLength(int l){
       length += l;
   }
}

