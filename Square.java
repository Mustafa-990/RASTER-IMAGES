////////////////////////////////////////////////////////////////////////////////
// File:             Square.java
// Course:           CSC 232, Spring 2022
// Authors:          Suleman Baloch
//
// Acknowledgements: Brian Howard
//
// Online sources:   None
////////////////////////////////////////////////////////////////////////////////

package edu.depauw.csc232;

import java.awt.Color;

/**
 * An Image consisting of a filled Square with center at (0.5, 0.5) and length
 * 1. That is, it will fill the unit square of the Canvas.
 */
public class Square implements Image{

	/**
	    * Construct a square Image that fills the unit square with the given color.
	    * 
	    * @param color the fill color
	    */
	   public Square(Color color) {
	      this.color = color;
	   }

	   @Override
	   public Color colorAt(double a, double b) {
	      if( (a >= 0) && (a <= 1) ) {
	    	  if( ( b >= 0 ) && ( b <= 1 )) {
	    		  return color;
	    	  } else {
	    		  return CLEAR;
	    	  }
	      } else {
	    	  return CLEAR;
	      }
	   }

	   private Color color;

}