package MyWas3.MyWas.src;
import java.util.HashMap;
import java.util.Map;

public class Pages {
    Map<String, String> pageList;
    
    private static Pages pages;

    static {
        pages = new Pages();
    }

    static Pages getInstance() {
        return pages;
    }

    private Pages() {
        pageList = new HashMap<>();
    }
    
    public void add(String key, String value) {
        pageList.put(key, value);
    }

    public String renderPage(String pageName) {
        if(!pageName.startsWith("/")) {
            pageName = "/" + pageName;
        }

        return this.pageList.get(pageName);
    }

    public String renderPage(HttpRequest httpRequest) {
        String page = this.renderPage(httpRequest.pageName);
        try {

            for(Map.Entry<String, String> entry : httpRequest.parameters.entrySet()){
                page = page.replaceAll(toKeyFormat(entry.getKey()), entry.getValue());
            }
    
            return page;
        } catch(Exception e) {
            throw new PagesException(httpRequest.pageName);
            // page = this.renderPage("404.html");
            // return page;
        }
    }

    private String toKeyFormat(String key) {
        return "\\$\\{" + key + "\\}";
    }
}