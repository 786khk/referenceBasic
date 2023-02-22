public class MyWebServer {
    public String request(String uri) {
        Pages pages = new Pages();
        HandlerInterceptor handlerInterceptor = new DefaultInterceptor();
        HttpRequest httpRequest = new HttpRequest(uri);
        String page;

        if(handlerInterceptor.preHandle(httpRequest)) {
            page = pages.renderPage(httpRequest);
        } else {
            page = pages.renderPage("404.html");
        }

        handlerInterceptor.postHandle(httpRequest);
        //view 랜더링
        handlerInterceptor.afterCompletion(httpRequest);

        return page;
    }  
}
