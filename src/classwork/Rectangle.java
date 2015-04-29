/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classwork;

/**
 *
 * @author class
 */
public class Rectangle {
    /**
     * The length of this rectangle.
     */
    private double length;
    
    /**
     * The width of this rectangle
     */
    private double width;

    /**
     * Returns the length of this rectangle
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * sets the length of this Rectangle
     * @param length the length to set
     */
    public void setLength(double length) {
        if (length>= 0)
        this.length = length;
    }

    /**
     * Returns the width of this rectangle
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * sets the with of this rectangle
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }
    /**
     * Returns the calculated this area
     * @return 
     */
    public double getArea(){
        return this.length * this.width;
        
        
        
        
    }
}
