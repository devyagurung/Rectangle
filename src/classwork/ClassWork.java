/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classwork;

import java.util.Random;

/**
 *
 * @author class
 */
public class ClassWork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = rect1;
        
        rect2.setLength(5);
        rect1.setWidth(-100);
        
        System.out.println(rect1.getLength()); //printed 0.0
        System.out.println(rect2.getLength());
        System.out.println(rect2.getWidth()); // should print 0.0
        
        System.out.println("This rectangle area is as follows");
        System.out.println(rect1.getArea());
        
        int width = 0;
        System.out.println(width);
        
        Random rand = new Random();
        rand.nextInt();
        
        
         
        
        
    }
    
}
