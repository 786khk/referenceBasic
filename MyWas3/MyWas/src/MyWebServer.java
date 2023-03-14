package MyWas3.MyWas.src;
public class MyWebServer {
    Pages pages;
    Interceptors interceptors;

    public MyWebServer() {
        this.pages = Pages.getInstance();
        this.interceptors = Interceptors.getInstance();

        Config config = Config.getInstance();
        config.loadInterceptors(interceptors);
        config.loadPages(pages);
    }

    public String request(String uri) {
        //try catch
        HttpRequest httpRequest = new HttpRequest(uri);
        String page;
        try {
    
            if(this.interceptors.preHandle(httpRequest)) {
                page = pages.renderPage(httpRequest);
    
                this.interceptors.postHandle(httpRequest);
                this.interceptors.afterCompletion(httpRequest);
            } else {
                page = this.pages.renderPage("404.html");
            }
        } catch (Exception e) {
            page = this.pages.renderPage("500.html");
            
        }
        return page;
            // TODO: handle exception

    }  
}
