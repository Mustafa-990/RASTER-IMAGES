////////////////////////////////////////////////////////////////////////////////
// File:             CanvasDemo.java
// Course:           CSC 232A/B, Fall 2018
// Authors:          Brian Howard
//
// Acknowledgements: None
//
// Online sources:   None
////////////////////////////////////////////////////////////////////////////////

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

import edu.depauw.csc232.*;

public class Main {
   public static final int WIDTH = 400;
   public static final int HEIGHT = 400;

   public static void main(String[] args) {
      JFrame f = new JFrame();
      Canvas canvas = new Canvas();

      canvas.addImage(Image.ellipse(0, 0, 1, 1, Color.RED));
      
      
      
       canvas.addImage(Image.rectangle(0, 0, 1, 1, Color.DARK_GRAY));
       canvas.addImage(Image.rectangle(0, 0.8, 1, 0.2, Color.BLACK));
       canvas.addImage(Image.ellipse(0.1, 0.2, 0.2, 0.2, Color.RED));
       canvas.addImage(Image.ellipse(0.7, 0.1, 0.2, 0.2, Color.RED));
       canvas.addImage(Image.ellipse(0.4, 0.6, 0.2, 0.2, Color.YELLOW));
       

      f.setSize(WIDTH, HEIGHT);
      f.setLayout(new BorderLayout());
      f.getContentPane().add(canvas, BorderLayout.CENTER);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
   }
}