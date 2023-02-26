import 연습.Pages;

public class MyWebServer {
    public String request(String uri) {
        Pages pages = new Pages();
        Interceptors interceptors = new Interceptors();
        HttpRequest httpRequest = new HttpRequest(uri);

        Config config = new Config();
        config.loadInterceptors(interceptors);
        //이질감을 느껴야 함.. 부분부분이아니라 
        
        String page;

        if(interceptors.preHandle(httpRequest)) {
            page = pages.renderPage(httpRequest);

            interceptors.postHandle(httpRequest);
            //view 랜더링
            interceptors.afterCompletion(httpRequest);
        } else {
            page = pages.renderPage("404.html");
        }

        return page;
    }  
}
