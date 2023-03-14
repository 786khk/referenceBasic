package Enums;

import javax.print.DocFlavor.STRING;

abstract class MyEnum<T extends MyEnum<T>> implements Comparable<T>{
    static int id = 10;
    int ordinal;
    String name;

    public int ordinal() { return ordinal;}

    MyEnum(String name){
        this.name = name;
        ordinal++;
    }
  
    public int compareTo(T t){
        return ordinal - t.ordinal;
    }
}

abstract class MyTransportation extends MyEnum{
    static final MyTransportation BUS = new MyTransportation("BUS", 100) {
        int fare(int distance){return distance * BASIC_FEE;}
    };
    static final MyTransportation TRAIN = new MyTransportation("TRAIN", 200) {
        int fare(int distance){return distance * BASIC_FEE;}
    };
    static final MyTransportation SHIP = new MyTransportation("SHIP", 300) {
        int fare(int distance){return distance * BASIC_FEE;}
    };
    static final MyTransportation AIRPLANE = new MyTransportation("AIRPLANE", 400) {
        int fare(int distance){return distance * BASIC_FEE;}
    };

    abstract int fare(int distance);
    protected final int BASIC_FEE;

    MyTransportation(String name, int basicFee){
        super(name);
        this.BASIC_FEE = basicFee;
    }
    public String name(){return name;}
    public String toString(){return name;}
}

public class EnumEx4{
    public void main() {
        MyTransportation t1 = MyTransportation.BUS;
        MyTransportation t2 = MyTransportation.TRAIN;
        MyTransportation t3 = MyTransportation.SHIP;
        MyTransportation t4 = MyTransportation.AIRPLANE;
        MyTransportation t5 = MyTransportation.BUS;
        
        System.out.printf("t1 :%s, %d%n " , t1.name(), t1.ordinal());
        System.out.printf("t2 :%s, %d%n " , t2.name(), t2.ordinal());
        System.out.printf("t3 :%s, %d%n " , t3.name(), t3.ordinal());
        System.out.printf("t4 :%s, %d%n " , t4.name(), t4.ordinal());
        System.out.printf("t5 :%s, %d%n " , t5.name(), t5.ordinal());
        System.out.println("t1 ==t2 ? " + (t1==t2));
        System.out.println("t1.compareTo(t3)" + t1.compareTo(t3));
    }
}