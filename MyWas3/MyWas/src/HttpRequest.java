import java.util.HashMap;
import java.util.Map;

public class HttpRequest {
    private String src;
    public String pageName;
    public Map<String, String> parameters;

    public HttpRequest(String src) {
        this.src = src;
        this.parameters = new HashMap<>();
    }

    public String getSrc() {
        return this.src;
    }
}
