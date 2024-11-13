
import java.io.File;
import java.util.Scanner;
import java.io. * ;

public class Main {
    
    public static void main(String[] args){
        
         RegularPolygon polygon = new RegularPolygon();
         double xCoord; //For the x coordinate
         double yCoord; //For the y corrdinate
         int numberSide; //For the number of sides
         double sideLength; //For the length of each side
         
         try {
      File infile = new File("input.txt"); //attempts to open the file
      Scanner scan = new Scanner(infile);   
      while (scan.hasNextLine()){
          String str = scan.nextLine();
          String[] numberString = str.split(" "); //splits the line into multiple parts divided by spaces
          
          for (String numberValue : numberString){
          System.out.printf(numberValue + " "); //prints out the individual parts
          }
          
          numberSide = Integer.parseInt(numberString[0]); //converts the string of number of sides into a integer
          sideLength = Double.parseDouble(numberString[1]); //converts the string of side length into a double
          
          if (numberString.length > 2 ){
              xCoord = Double.parseDouble(numberString[2]);  //converts the string of x into a double
              yCoord = Double.parseDouble(numberString[3]); //converts the string of y into a double
              polygon.setNumSides(numberSide); //sets the polygon's number os sides to the value given in the file
              polygon.setSide(sideLength);//sets the polygon's side length to the value given in the file
              polygon.setX(xCoord); //sets the polygon's x coordinate to the value given in the file
              polygon.setY(yCoord); //sets the polygon's y coordinate to the value given in the file
          } 
          
          else {
              polygon.setNumSides(numberSide); //sets the polygon's number os sides to the value given in the file
              polygon.setSide(sideLength); //sets the polygon's side length to the value given in the file
              xCoord = polygon.getX(); 
              yCoord = polygon.getY();
          }
          
          System.out.println("(" + xCoord + ", " + yCoord + ") " + polygon.perimeter(numberSide, sideLength) + " " + polygon.area(numberSide, sideLength)); //prints the remaining values of x, y, perimeter and area.
          polygon.setX(0);
          polygon.setY(0);
      }
    }
         
    catch(FileNotFoundException | NumberFormatException e) { //catches the error if the file does not work.
    }
    }
}