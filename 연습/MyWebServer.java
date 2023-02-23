package 연습;

public class MyWebServer {
    public String request(String url){
        Pages pages = new Pages();
        HandlerInterceptor handlerInterceptor = new DefaultInterceptor();
        HttpRequest httpRequest = new HttpRequest(url);
        // 사실 본질 httpRequest하나만 있으면 다해결할 수 있다.
        // 여기서 상속을 하지않아도 됨. 즉 is-a로 하면 안됨
        //상속은 의전성이 무척 강함 인터페이스는 단순 구현이기떄문에 의존이 약함

        String page;

        if(handlerInterceptor.preHandler(httpRequest)){
            // 결과를 처리한 후 리터럴을 받거나 참조로 처리한다.
            page = pages.renderPage(httpRequest);
            handlerInterceptor.postHandler(httpRequest);
            handlerInterceptor.afterHandler(httpRequest);
        }else {
            page = pages.renderPage("404.html");
        }
        //흐름을 파악해야함
        //추가삭제가능해야함 
        // TODO: 추가삭제가 가능하단건 코드를안고치고 추가,삭제가 가능하다고 생각해야함>> 의존성을 떨어트림
        // 구조공부를하자
        //다형은 각자 개별적기능은필요없고 있는걸 쓰면됨

        /**
         * 스프링을 처음 배울 때 AOP, autoWired를 배ㅜㄴ다. 이건 기능은 만들고 변경될떄마다 간단하게만 수정함
         * 예를들어 DB관련 소스는 설정파일의 DB 서버만바꾸면된다.
         * 
         */


        //view 랜더링
        return page;
    }
    
}
