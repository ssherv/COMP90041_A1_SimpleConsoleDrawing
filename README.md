# COMP90041_A1_SimpleConsoleDrawing
A simple console drawing program that implments simplified features of popular graphic applications such as Microsoft Paint.
<br>
<h4> Completed in April 2021 (Semester 1) </h4>
<hr>

<b>Functionality:</b>
Given some parameters (side length and alignment settings), the program drawws isoceles right-angled trianles and squares on a drawing canvas. The program also implements simple transformations like rotation and zooming. Includes simple error checcking.

<b>Topics of focus:</b>
Basic class design and implementation, control flow structures (loops), and basic I/O (via the Scanner class).
<hr>

See 'A1_Specification' for a full explanation of the task (including possible permutations) as well as an example execution and the corresponding expected output.

To run this console application:
<ol>
  <li> Download the Java code files in the "A1" folder </li>
  <li> Open a console and navigate to the project directoty (where the .java classes reside) </li>
  <li> Run and complile the program with: <code> javac *.java </code> </li>
  <li> Run the command: <code> java ConsoleDrawing 10 6 - </code> <br> 
  (where 10 == the number of columns in the canvas, 6 == the number of rows in the canvas, and - == the background character representing the canvas) <br>
  <b>NOTE:</b> These three arguments are user-defined and change be changed each time you run this application
  </li>
</ol>

To run this console application in TESTING MODE:
<ol>
  <li> Download the test files (including input and output) in the "A1-test-cases" folder </li>
  <li> Place the text input data files in the same directory as your project directory (where the .java classes reside) </li>
  <li> Open a console and navigate to the project directory </li>
  <li> Run and complile the program with: <code> javac *.java </code> </li>
  <li> Run the command: <code> java ConsoleDrawing 10 6 - < input1.txt > my-output1.txt </code> <br> 
  (This will run ConsoleDrawing using contents in "input1.txt" as input and write the output to "my-output1.txt". Note that the exact arguments "10 6 -" must be   passed into the program because the provided output files (e.g. output1.txt, output2.txt) were captured using these same arguments </li>
   <li> Inpect the file "my-output1.txt" with the provided output files (e.g.output1.txt) to test that the program is working as intended </li>
</ol>
