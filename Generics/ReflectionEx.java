package Generics;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.List;

interface GenericInterface<T>{

}

public class ReflectionEx {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) throws NoSuchFieldException {
        
        Class<GenericSample> clazz = GenericSample.class;
        // Type t = new Type();

        {
            TypeVariable<Class<GenericSample>>[] types = clazz.getTypeParameters();

            String name1 = types[0].getName();
            String name2 = types[1].getName();
            
            System.out.println("=== GenericSample 클래스의 정보 ===");
            System.out.println(name1);    // "T"
            System.out.println(name2);    //  "U"
        }
        
      
        {
            ParameterizedType type = (ParameterizedType) clazz.getGenericInterfaces()[0];
    
            String name = type.getTypeName();
            Type actual1 = type.getActualTypeArguments()[0];
              
            System.out.println("====GenericInterface 인터페이스 정보====");
            System.out.println(name);        //  "GenericInterface<java.lang.Integer>"
            System.out.println(actual1);      //  Class<Integer>
        }
        
        {
            TypeVariable<?> type = (TypeVariable<?>) clazz.getField("t").getGenericType();
            
            String name = type.getName();        
            GenericDeclaration decl = type.getGenericDeclaration();   
            Type bound = type.getBounds()[0];    
            
            System.out.println("=== 형변수: T ===");
            System.out.println(name);        //  "T"
            System.out.println(decl);        //  Class<GenericSample>
            System.out.println(bound);        //  Class<Object>
        } 
        
        /////////////////////////////////////////////////////////////////////////////
        // 형변수의 배열: T[]
        /////////////////////////////////////////////////////////////////////////////
        {
            GenericArrayType tArray = (GenericArrayType) clazz.getField("tArray").getGenericType();
            TypeVariable<?> type = (TypeVariable<?>) tArray.getGenericComponentType();
            
            System.out.println("=== 형변수의 배열: T[] ===");
            System.out.println(tArray.getTypeName());            //  "T[]"
            System.out.println(type.getName());                    //  "T"
            System.out.println(type.getGenericDeclaration());     //  Class<GenericSample>
            System.out.println(type.getBounds()[0]);            //  Class<Object>
        }
        
         /////////////////////////////////////////////////////////////////////////////
        // 파라미터화된 형: List<String>
        /////////////////////////////////////////////////////////////////////////////
        {
            ParameterizedType type = (ParameterizedType) clazz.getField("list").getGenericType();
            
            String typeName = type.getTypeName();     
            Type rawType = type.getRawType();         
            Type actual = type.getActualTypeArguments()[0];   
            
            System.out.println("=== 파라미터화된 형: List<String> ===");
            System.out.println(typeName);     //  "java.util.List<java.lang.String>"
            System.out.println(rawType);    //  Class<List>
            System.out.println(actual);        //  Class<String>
        }
        
        {
            ParameterizedType type = (ParameterizedType) clazz.getField("tList").getGenericType();
            
            String typeName = type.getTypeName();             
            Type rawType = type.getRawType();                
            Type actual = type.getActualTypeArguments()[0];    
            
            System.out.println("===파라미터화된 형: List<T> ===");
            System.out.println(typeName);    //  "java.util.List<T>"
            System.out.println(rawType);    //  Class<List>
            System.out.println(actual);        //  T
        }
        
        /////////////////////////////////////////////////////////////////////////////
        //  제한있는 파라미터화된 형: List<U>
        /////////////////////////////////////////////////////////////////////////////
        {
            ParameterizedType boundList = (ParameterizedType) clazz.getField("boundList").getGenericType();
            TypeVariable<?> type = (TypeVariable<?>) boundList.getActualTypeArguments()[0];
            
            String name = type.getName();
            Type bound = type.getBounds()[0];
                    
            System.out.println("=== 제한적 파라미터화된 형:: List<U> ===");
            System.out.println(boundList.getTypeName()); //  "java.util.List<U>"
            System.out.println(name);                     //  "U"
            System.out.println(bound);                     //  Class<Exception>
        }
        
        
          /////////////////////////////////////////////////////////////////////////////
        // 상한있는 와일드 카드: List<? extends Exception>
        /////////////////////////////////////////////////////////////////////////////
        {
            ParameterizedType wildList = (ParameterizedType) clazz.getField("wildList").getGenericType();
            WildcardType type = (WildcardType) wildList.getActualTypeArguments()[0];
    
            Type upperBound = type.getUpperBounds()[0];
            Type[] lowerBounds = type.getLowerBounds();
    
            System.out.println("=== 상한있는 와일드 카드: List<? extends Exception> ===");
            System.out.println(upperBound);           //  Class<Exception>
            System.out.println(lowerBounds.length);    //  없음（길이 0인 배열）
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }


}


class GenericSample<T, U extends Exception> implements GenericInterface<Integer> {
    public T t;
    public T[] tArray;
    public List<String> list;
    public List<T> tList;
    public List<U> boundList;
    public List<? extends Exception> wildList;

}

class GenericSample2<T, U extends Exception> implements GenericInterface<String> {
    public T t;
    public T[] tArray;
    public List<Integer> list;
    public List<T> tList;
    public List<U> boundList;
    public List<? extends Exception> wildList;

}