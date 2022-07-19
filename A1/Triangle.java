/* THIS ASSIGNMENT WAS COMPLETED BY:
   Name: Shervyn Singh
   Student Number: 1236509
   Username: shervyns
 */

public class Triangle {

  private int sideLength;
  private char printingCharacter;
  private String alignment;
  private int angle = 0;
  DrawingCanvas drawingCanvas;

  // Draw Triangle with Rotations
  public void drawTriangle() {
    int canvasWidth = this.drawingCanvas.getCanvasWidth();
    int canvasHeight = this.drawingCanvas.getCanvasHeight();
    char bgChar = this.drawingCanvas.getBackgroundCharacter();
    int columnIndex = this.columnIndex();
    int tempSide = this.sideLength;
    int angle = this.angle;

    switch (angle % 360) {
      case 90:
      case -270:
        for (int i = 0; i < canvasHeight; i++) {
          for (int j = 0; j < canvasWidth; j++) {
            if (j >= i + columnIndex && j < sideLength + columnIndex) {
              System.out.print(printingCharacter);
            } else {
              System.out.print(bgChar);
            }
          }
          System.out.println();
        }
        break;

      case 180:
      case -180:
        for (int i = 0; i < canvasHeight; i++) {
          tempSide = tempSide - 1;
          for (int j = 0; j < canvasWidth; j++) {
            if (j >= tempSide + columnIndex && j < sideLength + columnIndex
                && i < sideLength) {
              System.out.print(printingCharacter);
            } else {
              System.out.print(bgChar);
            }
          }
          System.out.println();
        }
        break;

      case 270:
      case -90:
        for (int i = 0; i < canvasHeight; i++) {
          for (int j = 0; j < canvasWidth; j++) {
            if (j <= i + columnIndex && i < sideLength && j >= columnIndex) {
              System.out.print(printingCharacter);
            } else {
              System.out.print(bgChar);
            }
          }
          System.out.println();
        }
        break;

      default:
        for (int i = 0; i < canvasHeight; i++) {
          for (int j = 0; j < canvasWidth; j++) {
            if (j < tempSide + columnIndex && i < this.sideLength && j >= columnIndex) {
              System.out.print(printingCharacter);
            } else {
              System.out.print(bgChar);
            }
          }
          tempSide = tempSide - 1;
          System.out.println();
        }
        break;
    }
  }

  // Alignment method
  private int columnIndex() {
    int canvasWidth = this.drawingCanvas.getCanvasWidth();

    switch (this.alignment) {
      case "middle":
        return (canvasWidth - this.sideLength) / 2;
      case "right":
        return (canvasWidth - this.sideLength);
      default:
        return 0;
    }
  }

  // Accessor methods
  public int getSideLength() {
    return sideLength;
  }

  public char getPrintingCharacter() {
    return printingCharacter;
  }

  public String getAlignment() {
    return alignment;
  }

  public int getAngle() {
    return angle;
  }

  public DrawingCanvas getDrawingCanvas() {
    return drawingCanvas;
  }

  // Mutator methods
  public void setSideLength(int sideLength) {
    this.sideLength = sideLength;
  }

  public void setPrintingCharacter(char printingCharacter) {
    this.printingCharacter = printingCharacter;
  }

  public void setAlignment(String alignment) {
    this.alignment = alignment;
  }

  public void setAngle(int angle) {
    this.angle = angle;
  }

  public void setDrawingCanvas(DrawingCanvas drawingCanvas) {
    this.drawingCanvas = drawingCanvas;
  }
}
