/* THIS ASSIGNMENT WAS COMPLETED BY:
   Name: Shervyn Singh
   Student Number: 1236509
   Username: shervyns
 */

public class DrawingCanvas {

  private int CANVAS_WIDTH;
  private int CANVAS_HEIGHT;
  private char BACKGROUND_CHARACTER;

  // Default Constructor
  DrawingCanvas(int CANVAS_WIDTH, int CANVAS_HEIGHT, char BACKGROUND_CHARACTER)
  {
    this.CANVAS_WIDTH = CANVAS_WIDTH;
    this.CANVAS_HEIGHT = CANVAS_HEIGHT;
    this.BACKGROUND_CHARACTER = BACKGROUND_CHARACTER;
  }

  // Print current DrawingCanvas settings
  public void getCanvasSettings() {
    System.out.println("Current drawing canvas settings:");
    System.out.println("- Width: " + this.CANVAS_WIDTH);
    System.out.println("- Height: " + this.CANVAS_HEIGHT);
    System.out.println("- Background character: " + this.BACKGROUND_CHARACTER);
    System.out.println();
  }

  // Accessor methods
  public int getCanvasWidth()
  {
    return CANVAS_WIDTH;
  }

  public int getCanvasHeight()
  {
    return CANVAS_HEIGHT;
  }

  public char getBackgroundCharacter()
  {
    return BACKGROUND_CHARACTER;
  }

  // Mutator methods
  public void setCanvasWidth(int canvasWidth)
  {
    CANVAS_WIDTH = canvasWidth;
  }

  public void setCanvasHeight(int canvasHeight)
  {
    CANVAS_HEIGHT = canvasHeight;
  }

  public void setBackgroundCharacter(char backgroundCharacter)
  {
    BACKGROUND_CHARACTER = backgroundCharacter;
  }
}