import java.util.HashMap;
import java.util.Map;

public class Pages {
    Map<String, String> pageList;

    public Pages() {
        pageList = new HashMap<>();
        this.loadPages();
    }
    
    private void loadPages() {
        pageList.put("/index.html", "<html><head><title>index/${name}<title></head><body><div>${age}</div></body></html>" );
        pageList.put("/home.html", "<html><head><title>home/${name}<title></head><body><div>${age}</div></body></html>" );
        pageList.put("/404.html", "<html><head><title>404<title></head><body>404</body></html>" );
    }

    public String renderPage(String pageName) {
        if(!pageName.startsWith("/")) {
            pageName = "/" + pageName;
        }

        return this.pageList.get(pageName);
    }

    public String renderPage(HttpRequest httpRequest) {
        try {
            String page = this.renderPage(httpRequest.pageName);

            for(Map.Entry<String, String> entry : httpRequest.parameters.entrySet()){
                page = page.replaceAll(toKeyFormat(entry.getKey()), entry.getValue());
            }
    
            return page;
        } catch(Exception e) {
            return this.renderPage("404.html");
        }
    }

    private String toKeyFormat(String key) {
        return "\\$\\{" + key + "\\}";
    }
}