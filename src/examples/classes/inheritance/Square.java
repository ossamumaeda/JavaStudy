package examples.classes.inheritance;

public class Square extends Shape implements Geometry{

    private int side;

    public Square(int dimensions,int side){
        super(dimensions);
        this.setSide(side);
    }

    // Get and Setters
    public int getSide() {
        return side;
    }
    public void setSide(int side) {
        this.side = side;
    }

    // Implementing interface function
    public int calculateArea(){
        int s = this.getSide();
        return s*s;
    }

    // Override of toString function from Object. Allows the system.out.println to be humanly readable
    @Override
    public String toString(){
        return "Square with side: " + this.getSide();
    }
}
