package Generics;

import java.util.ArrayList;

class Fruit implements Eatable{ public String toString() {return "this is Fruit";}}
class Apple extends Fruit { public String toString() {return "this is Apple";}}
class Grape extends Fruit { public String toString() {return "this is Grape";}}
class Toy { public String toString() {return "this is Toy";}}


interface Eatable{}


public class FruitBoxEx2 {
    public void main() {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();
        // FruitBox<Grape> appleBox = new FruitBox<Apple>();
        // FruitBox<Toy> toyBox = new FruitBox<Toy>();

        
        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
        // appleBox.add(new Grape()); // Grape는 Apple의 자손이 아님
        grapeBox.add(new Grape());

        System.out.println("fruitBox - "+fruitBox);
        System.out.println("appleBox - "+appleBox);
        System.out.println("appleBox.hashCode() - "+appleBox.hashCode());
        System.out.println("appleBox.get(0).hashCode() - "+appleBox.get(0).hashCode());
        System.out.println("grapeBox - "+grapeBox);
    }
    
}

class FruitBox<T extends Fruit & Eatable> extends Box<T>{}

class Box<T>{
    ArrayList<T> list = new ArrayList<>();

    void add(T item ){ list.add(item);}
    T get(int i){return list.get(i);}
    int size(){return list.size();}
    public String toString() { return list.toString();}
}
