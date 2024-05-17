package examples.classes.inheritance;

import java.util.ArrayList;

public class Call {
    public static void main(String[] args){
        // Different ways to create an object
        Square sq = new Square(2,4);
        var sq2 = new Square(2,10);

        // Calling an object function
        int area = sq.calculateArea();
        int area2 = sq2.calculateArea();
        System.out.println(area);
        System.out.println(area2);

        // Printing out an object
        System.out.println(sq);

        //Creating Object List
        ArrayList<Square> squareArrayList = new ArrayList<>();
        squareArrayList.add(sq);
        squareArrayList.add(sq2);

        //Another way to create list


        //Loop through array
        for(int i=0; i < squareArrayList.size(); i++){ // C alike loop
            System.out.println(squareArrayList.get(i));
        }
        for(Square square: squareArrayList){ // foreach
            System.out.println(square);
        }
    }
}
