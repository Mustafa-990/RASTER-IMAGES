package edu.depauw.csc232;

import java.awt.Color;


public final class ShiftedImage implements Image {
   
   public ShiftedImage(Image image, double dx, double dy) {
      this.image = image;
      this.dy = dy;
      this.dx = dx;
   }

   @Override
   public Color colorAt(double x, double y) {
      return image.colorAt( x - dx, y - dy);
   }

   private final Image image;
   private final double dx;
   private final double dy;

}