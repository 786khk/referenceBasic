package utilClass;

class Person{
    long id;
    public boolean equals(Object obj){ //오버라이딩
        if(obj instanceof Person) return id==((Person)obj).id; // obj가 Object타입이므로 id값을 참조하기 위해 Person으로 형변환
        //Person.id가 같으면 true
        else return false; // 같은 타입이 아니면 비교하지 않음
    }
    Person(long id){
        this.id = id;
    }
}
public class EqualsEx2 {

    public static void main(String[] args) {
     Person p1 = new Person(9209152222222L);
     Person p2 = new Person(9209152222222L);
        if(p1==p2)
            System.out.println("p1==p2"); 
        else 
            System.out.println("p1!=p2");
  
            
        if(p1.equals(p2))System.out.println("p1==p2");
        else System.out.println("p1!=p2"); // 서로 다른 인스턴스라도 Person.id가 같으면 true
        // 결과 : 
        // p1!=p2
        // p1==p2
    
    }
}

