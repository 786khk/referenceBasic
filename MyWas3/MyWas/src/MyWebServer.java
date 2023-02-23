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
        HttpRequest httpRequest = new HttpRequest(uri);
        String page;

        if(this.interceptors.preHandle(httpRequest)) {
            page = pages.renderPage(httpRequest);

            this.interceptors.postHandle(httpRequest);
            this.interceptors.afterCompletion(httpRequest);
        } else {
            page = this.pages.renderPage("404.html");
        }

        return page;
    }  
}
