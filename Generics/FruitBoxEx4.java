package Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class FruitBoxEx4 {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();
        System.out.println(appleBox.hashCode());
        appleBox.add(new Apple("greenApple", 120));
        appleBox.add(new Apple("redApple", 110));
        appleBox.add(new Apple("greenApple", 150));
        grapeBox.add(new Grape("green", 200));
        grapeBox.add(new Grape("green", 100));

        System.out.println("fruitBox - "+grapeBox);
        System.out.println("appleBox - "+appleBox);

        Collections.sort(appleBox.getList(), new AppleComp());
        Collections.sort(grapeBox.getList(), new GrapeComp());

        System.out.println("============After Collections.sort() by new GrapeComp/AppleComp()============    ");
        System.out.println("appleBox : " + appleBox);
        System.out.println("grapeBox : " + grapeBox);
        System.out.println();

        Collections.sort(appleBox.getList(), new FruitComp());// 정렬
        Collections.sort(grapeBox.getList(), new FruitComp());

        System.out.println("============After Collections.sort() by new FruitComp()============    ");
        System.out.println("appleBox : " + appleBox);
        System.out.println("grapeBox : " + grapeBox);
        System.out.println();


        

       
    }
    
}

class Fruit {
    String name;
    int weight;
     Fruit(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public String toString(){ return name + "("+weight+")";}
}    
class Apple extends Fruit {
     Apple(String name, int weight){
        super(name, weight);
    }
}
class Grape extends Fruit {
     Grape(String name, int weight){
        super(name, weight);
    } 
}
class AppleComp implements Comparator<Apple>{

    public int compare(Apple t1, Apple t2){
        return t2.weight - t1.weight;
    }
}

class GrapeComp implements Comparator<Grape>{
    public int compare(Grape t1, Grape t2){
        return t2.weight - t1.weight;
    }
}

class FruitComp implements Comparator<Fruit>{
    public int compare(Fruit t1, Fruit t2){
        return t2.weight - t1.weight;
    }
}


class FruitBox<T extends Fruit> extends Boxs<T>{}

class Boxs<T>{
    ArrayList<T> list = new ArrayList<T>();

    public void add(T item ){ list.add(item);}
    T get(int i){return list.get(i);}
    ArrayList<T> getList(){ return list;}
    int size(){return list.size();}
    public String toString() { return list.toString();}
}
