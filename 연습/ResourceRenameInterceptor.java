package 연습;

public class ResourceRenameInterceptor implements HandlerInterceptor { //확장자 do를 html로 변환하는 파일
    String action;
    //HandlerInterceptor를 상속을 안하면 인터페이스를만든이유가 없음  . 규칙을 준수하지않음
    public String resourceSecurity(String url){
        String action = ".do";
        if(url.contains(action)){
            url =  url.replace(action,".html");

        }

        return url;
    }
    //지금은 인터셉터가 하나만 동작하는데 디폴트와 함께 이것도 동작하도록
    @Override
    public boolean preHandler(HttpRequest httpRequest) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'preHandler'");
    }
    @Override
    public void postHandler(HttpRequest httpRequest) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'postHandler'");
    }
    @Override
    public void afterHandler(HttpRequest httpRequest) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'afterHandler'");
    }

}
