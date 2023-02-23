package 연습;
// 인터페이스 핸들러의 구현체 DefaultInterceptor
public class DefaultInterceptor implements HandlerInterceptor{
    //사용자의 요청에 대한 정의
    @Override
    public boolean preHandler(HttpRequest httpRequest) {
        try {
            String urlArray[] = httpRequest.getSrc().split("\\?");
            String path = urlArray[0]; 
            String param = urlArray[1];

            httpRequest.pageName =  urlArray[0];
            System.out.println("pageName"+httpRequest.pageName);
            if(urlArray.length>0){
                String[] params = urlArray[1].split("&");
                
                for (String item : params) {
                    String[] paramItem = item.split("=");
                    httpRequest.map.put(paramItem[0],paramItem[1]);
    
                }
            }

            this.postHandler(httpRequest);
            return true ;
        } catch (Exception e) {
            httpRequest.pageName= "404.html";
            return false;
            // TODO: handle exception
        }
        
    }

    @Override
    public void postHandler(HttpRequest httpRequest) {
   // view 전에 preHandler가 true

        ResourceRenameInterceptor renameInterceptor = new ResourceRenameInterceptor();

        renameInterceptor.resourceSecurity(httpRequest.pageName);
        System.out.println("postHandler"+httpRequest.pageName);
        // TODO  Auto-generated method stub
        
    }

    @Override
    public void afterHandler(HttpRequest httpRequest) {
        // TODO Auto-generated method stub
        
    }
    


}
