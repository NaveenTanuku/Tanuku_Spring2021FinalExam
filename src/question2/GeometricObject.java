/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

/**
 *
 * @author S542000
 */
public class GeometricObject {
    private String color;
    private boolean filled;
    /** Construct a geometric object with color and filled value */
    GeometricObject(String color, boolean filled) {
	this.color = color;
	this.filled = filled;
    }
    /** Return color */
    public String getColor() {
        return color;
    }
    /** Set a new color */
    public void setColor(String color) {
        this.color = color;
    }
	/** Return filled. Since filled is boolean,
	 *  the get method is named isFilled */
    public boolean isFilled() {
	return filled;
    }
    /** Set a new filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public double getArea(){
        return 0.0;
    } 
    
    public void howToColor(){
        
    }
    @Override
    public String toString() {
        return "color: " + color +
		" and filled: " + filled;
    }

}
