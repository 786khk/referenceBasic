package collectionFramework;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyVector implements List{
    Object[] data=null;
    int capacity=0;
    int size=0;
    
    public MyVector(int capacity) {
        if(capacity<0) throw new IllegalArgumentException();
        this.capacity = capacity;
        data = new Object[capacity];
    }
    
    public MyVector() {
        this(10);
    }

    public void  ensureCapacity(int minCapacity){
        if(minCapacity -data.length>0) setCapacity(minCapacity);
    }   
    
    public boolean add(Object obj){
        ensureCapacity(size+1);
        data[size++] = obj;
        return true;
    }

    public Object get(int index){
        if(index <0 || index>= size) throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
        return data[index];
    }
 
    public Object remove(int index){
        Object oldObject = null;
        if(index <0 || index>= size) throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
        oldObject = data[index];
        if(index != size-1){
            System.arraycopy(data, index+1, data, index, size-index-1);

        }
        data[size -1] = null;
        size--;
        return oldObject;
    }
    public boolean remove(Object o){
        for(int i=0; i<size; i++){
            if(o.equals(data[i])){
                remove(i);
                return true;
            }
        }
        return false;
    }

    public void trimTosize(){
        setCapacity(size);
    }

    private void setCapacity(int capacity){
        if(this.capacity==capacity) return; // 크기가 같으면 변경하지 않음
        Object[] tmp = new Object[capacity];
        System.arraycopy(data, 0, tmp, 0, size);
        data=tmp;
        this.capacity = capacity;
    }

    public void clear(){
        for(int i=0; i<size; i++){
            data[i] = null;
        }
        size = 0;
    }

    public Object[] toArray(){
        Object[] result = new Object[size];
        return result;
    }

    public boolean isEmpty(){
        return size ==0;
    }

    public int capacity(){
        return capacity;
    }

    public int size(){return size;}
    // public int size()
    // public boolean isEmpty()
    public boolean contains(Object o){return false;}
    public Iterator iterator(){ return null;}
    // public Object[] toArray();
    public Object[] toArray(Object[] o){return null;}
    // public boolean add(Object o)
    // public boolean remove(Object o)
    public boolean containsAll(Collection c){return false;}
    public boolean addAll(Collection c){return false;}
    public boolean addAll(int index, Collection c){return false;}
    public boolean removeAll(Collection c){return false;}
    public boolean retainAll(Collection c){return false;}
    // public boolean clear()
    public boolean equals(Object o){return false;}
    // public int hashCode();
    // public Object get(int index);
    public Object set(int index, Object element){return null;}
    public void add(int index, Object element){}
    // public Object remove(int index)
    public int indexOf(Object o){return -1;}
    public int lastIndexOf(Object o){return -1;}
    public ListIterator listIterator(){return null;}
    public ListIterator listIterator(int index){return null;}
    public List subList(int fromIndex, int toIndex){return null;}
    //jdk 1.8부터 list의 default로 추가
    // default void sort(Comparator c){}
    // default Spliterator spliterator(){}
    // default void replaceAll(UnaryOperator operator){}

    public static void main(String[] args) {
        
    }

 
}
