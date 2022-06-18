Project for Object Orientated Software Development CSC 232B Class

# RASTER-IMAGES
The project implements a simple graphical image displayer, using a technique related to the ray-tracing often used for 3D graphics.
An Image object can be anything with a "colorAt(x, y)" function. The idea is that, for each point in the unit square (for x and y each in the range 0.0 to 1.0) corresponding to a pixel in the Canvas object, the Image is asked what color should be at (x, y). If the Image has nothing to contribute at a given point, it returns the CLEAR (transparent) color. The Canvas object maintains a list of Images, and displays the corresponding colored pixels as needed. The advantage of keeping coordinates within the unit square is that the window can be resized and the Canvas will automatically request more or fewer pixels as needed.

Run the Main class and see that a window filled with a single red circle is displayed.

Find the line in the main method that creates that circle, and see what happens when you change the 1.0's to some other number (stick to positive numbers less than 10.0, but be sure to try fractions like 0.5, and try combinations of different numbers for those two arguments). Trace through the code to understand what is happening.
Add a Square class (following the model of Circle) that creates an Image filling the unit square with a given color. That is, colorAt(x, y) should return the color whenever x and y are both in the range 0.0 to 1.0, and it should return CLEAR for every other point. Update the rectangle method in Image to use your new Square class, and add a line to Main to test it out.
Note that the first two arguments to Image.ellipse and Image.rectangle do not currently have any effect. Create a ShiftedImage class (following the model of ScaledImage) that wraps an Image object with a modified colorAt(x, y) method: when the new method is called for point (x, y), it should ask the original image what color should be at (x - dx, y - dy), where dx and dy are the amounts by which the image is being shifted. Update the shifted method in Image to use your new ShiftedImage class, and test it by moving your ellipse and rectangle to different locations (change the 0.0 arguments to different values in the range -1.0 to +1.0 or so).
Uncomment the eight calls to addImage in Main (and comment out any others) and see what picture I made. Now make something better.
If you have the time and inclination, try adding triangles or other basic shapes, and the ability to rotate an Image.
