public class Triangle {


    private int side1, side2, side3, side4;


    /**
     * Triangle constructor method
     * @param sideOne length of side 1
     * @param sideTwo length of side 2
     * @param sideThree length of side 3
     */
    public Triangle(int sideOne, int sideTwo, int sideThree){
        side1 = sideOne;
        side2 = sideTwo;
        side3 = sideThree;
    }//End of constructor


    private int largest(){
        int longestSide;
        if (side1 > side2 && side1 >side3){
            longestSide = side1;
        } else if (side2 > side1 && side2 > side3){
            longestSide = side2;
        } else {
            longestSide = side3;
        }

        return longestSide;
    }

    private int shortest(){
        int shortestSide;
        if (side1 < side2 && side1 < side3){
            shortestSide = side1;
        } else if (side2 < side1 && side2 < side3){
            shortestSide = side2;
        } else {
            shortestSide = side3;
        }

        return shortestSide;

    }

    public boolean is_equilateral(){
        boolean isEquilateral = false;
        if (side1 == side2 && side1 == side3){
            isEquilateral = true;
        }

        return isEquilateral;
    }

    public boolean is_isosceles(){
        boolean isIsosoceles = false;
        if (side1 == side2 || side2 == side3 || side1 == side3){
            isIsosoceles = true;
        }

        return isIsosoceles;
    }

    public boolean is_scalene(){
        boolean isScalene = false;
        if (side1 != side2 || side1 != side3){
            isScalene = true;
        }
        return isScalene;
    }





}//End of class
