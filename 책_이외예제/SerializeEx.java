package 책_이외예제;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class SerializeEx {
    private static final String USERINFO_SER = "user.ser";
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        conductSerializing();
        conductDeserializing();
    }
    
    public static void conductSerializing() {
        try {
            FileOutputStream fos = new FileOutputStream(USERINFO_SER);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream out = new ObjectOutputStream(bos);
            
            User u1 = new User("김현경", "1234", "786khk@abc.com", 32);
            User u2 = new User("박철오", "8877", "pch06178@abc.com", 35);
            
            ArrayList list = new ArrayList<>();
            list.add(u1);
            list.add(u2);
            
            out.writeObject(u1);
            out.writeObject(u2);
            out.writeObject(list);
            out.close();
            System.out.println("직렬화 완료");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void conductDeserializing(){
        try {
            FileInputStream fis = new FileInputStream(USERINFO_SER);
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream in = new ObjectInputStream(bis);
            
            User u1 = (User) in.readObject();
            User u2 = (User) in.readObject();
            ArrayList list = (ArrayList) in.readObject();
            
            System.out.println(u1.toString());
            System.out.println(u2.toString());
            System.out.println("count :: " + list.size());
            System.out.println(list.toString());
            
            in.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class User implements Serializable{
    private String name;
    private transient String password;
    private String email;
    public int age;
    
    public User(String name, String password,String email, int age) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.age = age;
    }
    
    public String toString() {
        return "(" + name + ", " + password + ", " + email + ", " + age + ")";
    }
}
