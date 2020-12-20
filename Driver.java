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
public class Driver {
    public static void main(String[] args) {
        Engineering r = new Engineering(7,8);
        Engineering c = new Engineering(8);
        
        c.changeLength(5);
        
        int answer = c.circle();
        
        System.out.println("Area of circle :" + answer);
        
        r.changeLength(5);
        
        int secondAnswer = r.rect();
        
        System.out.println("Area of rectangle :"+ secondAnswer);
        
        int thirdAnswer = c.rect();
    }   
}
