/* THIS ASSIGNMENT WAS COMPLETED BY:
   Name: Shervyn Singh
   Student Number: 1236509
   Username: shervyns
 */

public class Square {

  private int sideLength;
  private char printingCharacter;
  private String alignment;
  private char zoomOption;
  DrawingCanvas drawingCanvas;

  // Draw Square
  public void drawSquare() {
    int canvasWidth = this.drawingCanvas.getCanvasWidth();
    int canvasHeight = this.drawingCanvas.getCanvasHeight();
    char bgChar = this.drawingCanvas.getBackgroundCharacter();
    int columnIndex = this.columnIndex();

    for (int i = 0; i < canvasHeight; i++) {
      for (int j = 0; j < canvasWidth; j++) {
        if (j < sideLength + columnIndex && i < sideLength && j >= columnIndex) {
          System.out.print(printingCharacter);
        } else {
          System.out.print(bgChar);
        }
      }
      System.out.println();
    }
  }

  // Alignment method
  private int columnIndex() {
    int canvasWidth = this.drawingCanvas.getCanvasWidth();

    switch (alignment) {
      case "middle":
        return (canvasWidth - this.sideLength) / 2;
      case "right":
        return (canvasWidth - this.sideLength);
      default:
        return 0;
    }
  }

  // Zoom method
  public int zoomSquare(char zoomOption) {
    int canvasWidth = drawingCanvas.getCanvasWidth();
    int canvasHeight = drawingCanvas.getCanvasHeight();

    switch (zoomOption) {
      case 'I':
        if (sideLength != Math.min(canvasWidth, canvasHeight)) {
          return sideLength += 1;
        } else {
          return sideLength;
        }
      case 'O':
        if (sideLength > 1) {
          return sideLength -= 1;
        } else {
          return sideLength;
        }
      default:
        return -1;
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

  public char getZoomOption() {
    return zoomOption;
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

  public void setZoomCharacter(char zoomCharacter) {
    this.zoomOption = zoomOption;
  }

  public void setDrawingCanvas(DrawingCanvas drawingCanvas) {
    this.drawingCanvas = drawingCanvas;
  }

}
