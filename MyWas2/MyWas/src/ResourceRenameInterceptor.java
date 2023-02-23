public class ResourceRenameInterceptor implements HandlerInterceptor {

    @Override
    public void afterCompletion(HttpRequest httpRequest) {
        // TODO Auto-generated method stub
        httpRequest.pageName = httpRequest.pageName.replace(".do", ".html");
        
    }

    @Override
    public void postHandle(HttpRequest httpRequest) {
        // TODO Auto-generated method stub
        httpRequest.pageName = httpRequest.pageName.replace(".do", ".html");
        
    }

    @Override
    public boolean preHandle(HttpRequest httpRequest) {
        httpRequest.pageName = httpRequest.pageName.replace(".do", ".html");
        return false;
    } //확장자 do를 html로 변환
    
}
