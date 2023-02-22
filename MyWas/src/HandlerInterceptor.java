public interface HandlerInterceptor {
    public boolean preHandle(HttpRequest httpRequest);
    public void postHandle(HttpRequest httpRequest);
    public void afterCompletion(HttpRequest httpRequest);
}