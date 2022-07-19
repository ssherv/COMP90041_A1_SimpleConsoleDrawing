/* THIS ASSIGNMENT WAS COMPLETED BY:
   Name: Shervyn Singh
   Student Number: 1236509
   Username: shervyns
 */

import java.util.Scanner;

public class ConsoleDrawing {

  public static void main(String[] args) {

    // Initialise Scanner and Objects
    Scanner userInput = new Scanner(System.in);
    DrawingCanvas canvasObject = new DrawingCanvas(Integer.parseInt(args[0]), Integer.parseInt(args[1]), args[2].charAt(0));
    Triangle triangleObject = new Triangle();
    Square squareObject = new Square();

    // Pass CanvasObject to Triangle and Square Class
    triangleObject.setDrawingCanvas(canvasObject);
    squareObject.setDrawingCanvas(canvasObject);

    // Welcome message
    System.out.println("----WELCOME TO MY CONSOLE DRAWING APP----");
    canvasObject.getCanvasSettings();

    // Initialisation options
    while (true) {
      System.out.println("Please select an option. Type 4 to exit.");
      System.out.println("1. Draw triangles");
      System.out.println("2. Draw squares");
      System.out.println("3. Update drawing canvas settings");
      System.out.println("4. Exit");
      int userChoice = userInput.nextInt();
      char drawAdditionalShape = 'Y';

      // User chooses 1 of 4 choices
      switch (userChoice) {

        case 1: // DRAW TRIANGLE
          while (drawAdditionalShape == 'Y') {

            // Set Triangle Side Length
            System.out.println("Side length:");
            int sideLength = userInput.nextInt();
            while (sideLength > canvasObject.getCanvasHeight()) {
              System.out.println("Error! The side length is too long (Current canvas size is " + canvasObject.getCanvasWidth() + "x" + canvasObject.getCanvasHeight() + "). Please try again.");
              System.out.println("Side length:");
              sideLength = userInput.nextInt();
            }
            triangleObject.setSideLength(sideLength);

            // Set Triangle Printing Character
            System.out.println("Printing character:");
            char printingCharacter = userInput.next().charAt(0);
            triangleObject.setPrintingCharacter(printingCharacter);

            // Set Triangle Alignment
            System.out.println("Alignment (left, middle, right):");
            String alignment = userInput.next();
            triangleObject.setAlignment(alignment);

            // Draw Triangle
            triangleObject.drawTriangle();

            // Rotate Triangle
            int userRotate = 0;
            while (userRotate> -1) {
              System.out.println(
                  "Type R/L to rotate clockwise/anti-clockwise. Use other keys to continue.");
              char rotateOption = userInput.next().toUpperCase().charAt(0);
              {
                if (rotateOption == 'R') {
                  triangleObject.setAngle(triangleObject.getAngle() + 90);
                  triangleObject.drawTriangle();
                } else if (rotateOption == 'L') {
                  triangleObject.setAngle(triangleObject.getAngle() - 90);
                  triangleObject.drawTriangle();
                } else {
                  userRotate = -1;
                }
              }
            }

            // Ask user if they want to draw more Triangles
            System.out.println("Draw another triangle (Y/N)?");
            drawAdditionalShape = userInput.next().charAt(0);
          }
          break;

        case 2: // DRAW SQUARE
          while (drawAdditionalShape == 'Y') {

            // Set Square Side Length
            System.out.println("Side length:");
            int sideLength = userInput.nextInt();
            while (sideLength > canvasObject.getCanvasHeight()) {
              System.out.println("Error! The side length is too long (Current canvas size is " + canvasObject.getCanvasWidth() + "x" + canvasObject.getCanvasHeight() + "). Please try again.");
              System.out.println("Side length:");
              sideLength = userInput.nextInt();
            }
            squareObject.setSideLength(sideLength);

            // Set Square Printing Character
            System.out.println("Printing character:");
            char printingCharacter = userInput.next().charAt(0);
            squareObject.setPrintingCharacter(printingCharacter);

            // Set Square Alignment
            System.out.println("Alignment (left, middle, right):");
            String alignment = userInput.next();
            squareObject.setAlignment(alignment);

            // Draw Square
            squareObject.drawSquare();

            // Zoom in/out
            int userZoom = 0;
            while (userZoom > -1) {
              System.out.println("Type I/O to zoom in/out. Use other keys to continue.");
              char zoomOption = userInput.next().toUpperCase().charAt(0);
              userZoom = squareObject.zoomSquare(zoomOption);
              if (userZoom != -1) {
                squareObject.drawSquare();
              }
            }

            // Ask user if they want to draw more Squares
            System.out.println("Draw another square (Y/N)?");
            drawAdditionalShape = userInput.next().charAt(0);
          }
          break;

        case 3: // UPDATE CANVAS

          // Set new Canvas Width
          System.out.print("Canvas width: ");
          canvasObject.setCanvasWidth(userInput.nextInt());

          // Set new Canvas Height
          System.out.print("Canvas height: ");
          canvasObject.setCanvasHeight(userInput.nextInt());

          // Set new Background Character
          System.out.print("Background character: ");
          canvasObject.setBackgroundCharacter(userInput.next().charAt(0));

          // Print new Canvas settings
          System.out.print("Drawing canvas has been updated!");
          System.out.println("\n");
          canvasObject.getCanvasSettings();
          break;

        case 4: // EXIT PROGRAM
          System.out.println("Goodbye!");
          System.exit(0);
          break;

        default:
          System.out.println("Unsupported option. Please try again!");
      }
    }
  }
}
