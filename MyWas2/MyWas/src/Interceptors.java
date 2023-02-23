import java.util.ArrayList;
import java.util.List;

public class Interceptors implements HandlerInterceptor {
    List<HandlerInterceptor> interceptorList;

    public Interceptors() {
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
        for(HandlerInterceptor interceptor : this.interceptorList) { //DefaultInterceptor가 들어가있음
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
