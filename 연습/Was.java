package 연습;

public class Was {
    // 간이 was

    //req를 받고 파라미터를 파싱 >> goekd url에 맞는 웹페이지찾아 리턴

    /**
     * >> req >> WAS >> parsing (>> 인터셉터 , 필터 )>> controller >>  
     * 
     * <<res << WAS << URL해당하는ㅍ에이지
     */

    // req 
    public static void main(String[] args) {
        MyWebServer myWebServer = new MyWebServer();
        String url = "/index.do?name=inje&age=20";
         String path =  myWebServer.request(url);

         System.out.println("##########################");
         System.out.println(path);
         System.out.println("##########################");
    }
    //파라미터 나눠서 처리하는 기능은 디폴트

}
