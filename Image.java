
package edu.depauw.csc232;

import java.awt.Color;


public interface Image {
   
   Color colorAt(double x, double y);

   
   default Image shifted(double dx, double dy) {
      return new ShiftedImage(this,dx,dy);
   }

   
   default Image scaled(double sx, double sy) {
      return new ScaledImage(this, sx, sy);
   }
   
   
   static Image rectangle(double x, double y, double w, double h, Color color) {
      return new Square(color).scaled(w,h).shifted(x,y);
   }

  
   static Image ellipse(double x, double y, double w, double h, Color color) {
      return new Circle(color).scaled(w, h).shifted(x, y);
   }
   
   static final Color CLEAR = new Color(0, 0, 0, 0);
}