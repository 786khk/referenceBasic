import java.util.ArrayList;
import java.util.List;

public class Interceptors implements HandlerInterceptor {
    List<HandlerInterceptor> interceptorList;

    static Interceptors interceptors;

    static {
        interceptors = new Interceptors();
    }

    static Interceptors getInstance() {
        return interceptors;
    }
    
    private Interceptors() {
        this.interceptorList = new ArrayList<>();
        this.interceptorList.add(new DefaultInterceptor());
    }

    public void add(HandlerInterceptor handlerInterceptor) {
        this.interceptorList.add(handlerInterceptor);
    }

    public void remove() {
        //
    }

    @Override
    public void afterCompletion(HttpRequest httpRequest) {
        for(HandlerInterceptor interceptor : this.interceptorList) {
            interceptor.afterCompletion(httpRequest);
        }
    }

    @Override
    public void postHandle(HttpRequest httpRequest) {
        for(HandlerInterceptor interceptor : this.interceptorList) {
            interceptor.postHandle(httpRequest);
        }
    }

    @Override
    public boolean preHandle(HttpRequest httpRequest) {
        boolean result = true;

        for(HandlerInterceptor interceptor : this.interceptorList) {
            if(!interceptor.preHandle(httpRequest)) {
                result = false;
                break;
            }
        }
        
        return result;
    }
}
