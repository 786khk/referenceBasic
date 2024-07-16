package objectOriented;


public class ConstructorEx2 {
  
    public void main(){
        CarConstructor c = new CarConstructor();
        c.color = "red";
        c.gearType = "auto";
        c.door = 5;
        CarConstructor c2 = new CarConstructor("blue","auto",4);

        System.out.println("c.color: " + c.color + "c.gearType: " + c.gearType+ "c.door: " + c.door);
        System.out.println("c2.color: " + c.color + "c2.gearType: " + c.gearType+ "c2.door: " + c.door);
    }
        


}


class CarConstructor{
    String color;
    String gearType;
    int door;

    CarConstructor(){}

    CarConstructor(String c, String g, int n){
        color = c;
        gearType = g;
        door = n;
    }
}