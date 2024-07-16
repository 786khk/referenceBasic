package objectOriented;

class Product{
static int count = 0;
    int serial;
    {
     ++count;
     serial = count;   
    }
    public Product(){}
}
public class InitializationEx3 {
    public void main(){

        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        System.out.println("p1제품번호 : "+ p1.serial);
        System.out.println("p2제품번호 : "+ p2.serial);
        System.out.println("p3제품번호 : "+ p3.serial);
        System.out.println("totalCount : "+ Product.count); // 초기화 블록에서 ++count를 해줘 계속 갯수늘어남
        // count 가 인스턴스 변수일 경우 그대로 1

    }
}
