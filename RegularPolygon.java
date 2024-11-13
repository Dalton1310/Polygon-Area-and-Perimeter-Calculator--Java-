import java.text.DecimalFormat;
public class RegularPolygon {
    private int numSides;
    
    private double side;
    
    private double x;
    
    private double y;
    
    public void setX(double x){ //setter for x
        this.x = x;
    }
    
    public void setY(double y){ //setter for y
        this.y = y;
    }
    
    public void setNumSides(int numSides){ //setter for number of sides
        this.numSides = numSides;
    }
    
    public void setSide(double side){ //setter for side length
        this.side = side;
    }
    
    public double getX(){ //gets the value of x
        return x;
    }
    
    public double getY(){ //gets the value of y
        return y;
    }
    
    public int getNumSides(int numSides){ //gets the number of sides
        return numSides;
    }
    
    public double getSide(double side){ //gets the value of the side length
        return side;
    }
    
    public double perimeter(int numSides, double side){ //returns the perimeter of the polygon
        getNumSides(numSides);
        getSide(side);
        return numSides * side;
    }
    
    public String area(int numSides, double side){ //returns the area of the polygon
        double temp;
        getNumSides(numSides);
        getSide(side);
        DecimalFormat dec = new DecimalFormat("#0.000");
        temp = (numSides * side * side) / (4 * Math.tan(Math.PI / numSides));
        return (dec.format(temp));
    }
    
    public RegularPolygon(){
        x = 0;
        y = 0;
        numSides = 3;
        side = 1;
    }
    
    public RegularPolygon(int numSides, double side){
        this.numSides = numSides;
        this.side = side;
        x = 0;
        y = 0;
    }
    
    public RegularPolygon(int numSides, double side, double x, double y){
        this.numSides = numSides;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    
    }



