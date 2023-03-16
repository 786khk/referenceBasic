package Reflection;

import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.logging.LogManager;

class ReflectionExs {
    public static LocalDate getNow(){
        return LocalDate.now();
    }
    public String toString(){
        return this.toString();

    }
}
public class DumpMethods {
    public static void main(String args[]){
        try {
            Class c = Class.forName("Reflection.ReflectionExs");
            
			Method m[] = c.getDeclaredMethods();
            System.out.println(m[0]);
            Class intClass = Class.forName("java.lang.Integer");
            System.out.println("IntegerClass : " + intClass.getName());
			for (int i = 0; i < m.length; i++) System.out.println(m[i].toString());

		} catch (Exception e) {}
    }
}

