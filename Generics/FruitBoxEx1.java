package Generics;

import java.util.ArrayList;

class Fruit { public String toString() {return "this is Fruit";}}
class Apple extends Fruit { public String toString() {return "this is Apple";}}
class Grape { public String toString() {return "this is Grape";}}
class Toy { public String toString() {return "this is Toy";}}

public class FruitBoxEx1 {
    public void main() {
        Box<Fruit> fruitBox = new Box<Fruit>();
        Box<Apple> appleBox = new Box<Apple>();
        Box<Toy> toyBox = new Box<Toy>();
        // Box<Grape> grapeBox = new Box<Apple>(); // Type mismatch: cannot convert from Box<Apple> to Box<Grape>

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());

        appleBox.add(new Apple());
        appleBox.add(new Apple());
        // appleBox.add(new Toy());
        //The method add(Apple) in the type Box<Apple> is not applicable for the arguments (Toy)

        toyBox.add(new Toy());
        // toyBox.add(new Apple());
        // The method add(Toy) in the type Box<Toy> is not applicable for the arguments (Apple);
        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);

    }
    
}

class Box<T>{
    ArrayList<T> list = new ArrayList<>();

    void add(T item ){ list.add(item);}
    T get(int i){return list.get(i);}
    int size(){return list.size();}
    public String toString() { return list.toString();}
}
