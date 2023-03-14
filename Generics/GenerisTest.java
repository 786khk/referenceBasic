package Generics;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
interface ITest{

}
class Test <T extends TestParents & ITest> {
    T t;
    T[] arr;
    List<T> list;
    
}

class TestParents {
    String A;
    String B;
    int C;
    
}

public class GenerisTest {
        public static void main(String[] args) {


                Test test = new Test();
                getClassInfo(test);
                
                
        }
            
        private static Test<? extends TestParents>  getClassInfo(Test<? extends TestParents> test) {
            // private static Test<?,? extends TestParents>  getClassInfo(Test<? extends TestParents> test) {
            Test tt = new Test<>();
            Class<Test> c = Test.class;
            Class c1 = Test.class;

            TypeVariable<Class<Test>> test33[]= c.getTypeParameters();
            String t =  c.getTypeName();
            for(int i=0; i<test33.length; i++){
                System.out.println("파라미터 타입가죠옴 " + test33[i]);

            }
            System.out.println(test33);
           
            return tt;
        }

}
