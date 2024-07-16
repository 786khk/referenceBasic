package objectOriented;

class Document{
static int count = 0;
    String name;
    public Document(){
        this("제목없음" + ++count);
    }
    public Document(String name){
        this.name = name;
        System.out.println("created"+ this.name);
    }
}
public class InitializationEx4 {
    public void main(){

        Document d1 = new Document();
        Document d2 = new Document("java.txt"); // 제목이 없으면 일정규칙에 따라 이름 생성
        Document d3 = new Document();
        Document d4 = new Document();

    }
}
