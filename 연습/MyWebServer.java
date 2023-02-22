package 연습;

public class MyWebServer {
    public String request(String url){
        Pages pages = new Pages();
        HandlerInterceptor handlerInterceptor = new DefaultInterceptor();
        HttpRequest httpRequest = new HttpRequest(url);

        String page;

        if(handlerInterceptor.preHandler(httpRequest)){
            // 결과를 처리한 후 리터럴을 받거나 참조로 처리한다.
            page = pages.renderPage(httpRequest);
        }else {
            page = pages.renderPage("404.html");
        }

        handlerInterceptor.postHandler(httpRequest);
        //view 랜더링
        handlerInterceptor.afterHandler(httpRequest);
        return page;
    }
    
}
