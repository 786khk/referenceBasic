public class DefaultInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpRequest httpRequest) {
        try {
            String src = httpRequest.getSrc();
            String[] uriItems = src.split("\\?");

            httpRequest.pageName = uriItems[0];

            if(uriItems.length>1) {
                String[] parameters = uriItems[1].split("&");

                for(String parameter : parameters) { //key=value
                    String[] parameterItem = parameter.split("=");
                    httpRequest.parameters.put(parameterItem[0], parameterItem[1]);
                }
            }

            return true;
        } catch(Exception e) {
            httpRequest.pageName = "404.html";
            return false;
        }        
    }
    
    @Override
    public void postHandle(HttpRequest httpRequest) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void afterCompletion(HttpRequest httpRequest) {
        // TODO Auto-generated method stub
        
    }
}
