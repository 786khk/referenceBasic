package 연습;

import java.util.HashMap;
import java.util.Map;

public class HttpRequest {
    private String src;
    public String pageName;
    public Map<String, String> map;
    
    public String getSrc(){
        return src;
    }
// 생성자
    public HttpRequest(String src){
        this.map = new HashMap<>();
        this.src = src;
    }
}
