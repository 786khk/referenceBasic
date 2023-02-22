package 연습;

public interface HandlerInterceptor {
    // public void request(String url);

    public boolean preHandler(HttpRequest httpRequest);
    public void postHandler(HttpRequest httpRequest);
    public void afterHandler(HttpRequest httpRequest);
}
