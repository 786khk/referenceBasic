package Enums;

enum Direction1{ EAST, WEST, SOUTH, NORTH}

public class EnumEx1 {
    public static void main(){
        Direction1 d1 = Direction1.EAST;
        Direction1 d2 = Direction1.WEST;
        Direction1 d3 = Direction1.SOUTH;
        Direction1 d4 = Direction1.NORTH;

        System.out.println("d1"+d1);
        System.out.println("d2"+d2);
        System.out.println("d3"+d3);
        System.out.println("d4"+d4);


        System.out.println("d1==d2 ? " + (d1==d2));
        System.out.println("d1==d3 ? " + (d1==d3));
        System.out.println("d1.equals(d3) ? " + (d1.equals(d3)));
        // System.out.println("d2 > d3 ? " + (d2 > d3));

        System.out.println("d1.compareTo(d3)"+d1.compareTo(d3));
        System.out.println("d1.compareTo(d2)"+d1.compareTo(d2));

        switch(d1){
            case  EAST:
            System.out.println("this is EAST"); break;
            case  SOUTH:
            System.out.println("this is SOUTH"); break;
            case  WEST:
            System.out.println("this is SOUTH"); break;
            case  NORTH:
            System.out.println("this is SOUTH"); break;
            default : 
            System.out.println("invailed Direction");

        }


        Direction1[] dArr = Direction1.values();
        for(Direction1 d : dArr) System.out.printf("%s=%d%n ", d.name(), d.ordinal());
    }
}
