package MyWas3.MyWas.src;
public class Config {
    private static Config config;

    static {
        config = new Config();
    }

    static Config getInstance() {
        return config;
    }

    private Config() {}

    public void loadInterceptors(Interceptors interceptors) {
        interceptors.add(new ResourceRenameInterceptor());
    }    
    public void loadPages(Pages pages) {
        pages.add("/index.html", "<html><head><title>index/${name}<title></head><body><div>${age}</div></body></html>" );
        pages.add("/home.html", "<html><head><title>home/${name}<title></head><body><div>${age}</div></body></html>" );
        pages.add("/404.html", "<html><head><title>404<title></head><body>404</body></html>" );
        pages.add("/500.html", "<html><head><title>500<title></head><body>404</body></html>" );
    }    
}
