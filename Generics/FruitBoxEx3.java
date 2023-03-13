package Generics;

import java.util.ArrayList;
import java.util.Optional;

class Fruit { public String toString() {return "this is Fruit";}}
class Apple extends Fruit { public String toString() {return "this is Apple";}}
class Grape extends Fruit { public String toString() {return "this is Grape";}}

class Juice{
    String name;
    Juice(String name){
        this.name = name + "Juice";
    }

    public String toString(){return name;}
}

class Juicer{
    static Juice makeJuice(FruitBox<? extends Fruit> box){
        String tmp = "";
        for(Fruit f : box.getList()){
            tmp += f+""; // 에러, Fruit타입이 아닐 수 있음
        }

        return new Juice(tmp);
    }
}

public class FruitBoxEx3 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
     
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        
        System.out.println("fruitBox - "+fruitBox);
        System.out.println("appleBox - "+appleBox);


        /**
            fruitBox - [this is Apple, this is Grape]
            appleBox - [this is Apple, this is Apple]
         */
       
    }
    
}

class FruitBox<T extends Fruit > extends Box<T>{}

class Box<T>{
    ArrayList<T> list = new ArrayList<>();

    void add(T item ){ list.add(item);}
    T get(int i){return list.get(i);}
    ArrayList<T> getList(){ return list;}
    int size(){return list.size();}
    public String toString() { return list.toString();}
}
