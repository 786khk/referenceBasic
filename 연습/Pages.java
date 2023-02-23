package 연습;

import java.util.HashMap;
import java.util.Map;

public class Pages {
    Map<String,String> pageList;
    
    public Pages() {//어디서든 접근할수있지만 유일하게 설정한다.
        //이 하나의 
        this.pageList = new HashMap<>();
        this.loadPages();

    }

    private void loadPages(){
        pageList.put("/index.html","<html><head><title>index</title></head><body><h1>${name}</h1></body></html>");
        pageList.put("/home.html","<html><head><title>home</title></head><body><h1>${name}</h1></body></html>");
        pageList.put("/404.html","<html><head><title>404</title></head><body><h1>404</h1></body></html>");
    }
    
    public String renderPage(HttpRequest httpRequest){
        try {
            String page = this.pageList.get(httpRequest.pageName);
            //빠르게 렌더링 해주면 됨
            
            for(Map.Entry<String,String> entry : httpRequest.map.entrySet()){
                page = page.replaceAll(entry.getKey(), entry.getValue());
            }
            return page;
            
        } catch (Exception e) {
            // TODO: handle exception
            return this.renderPage("404.html");

        }
    }
    
    public String renderPage(String pageName){
        if(!pageName.startsWith("/")){
            pageName = "/"+ pageName;
        }
        return this.pageList.get(pageName);
    }

    public String getKeyFormat(String key){
        return "\\$\\{"+key+"\\}";
    }
    

    // 인터셉터는 하나만 넣으면 안됨.
    // 디폴트를 안쓰면 내가직접구현해야한다.
    // html에서 do를 바꿔즈는 인터셉터로==> resourceSecurity라는 이름으로



}
