package MyWas3.MyWas.src;
public class App {
    public static void main(String[] args) throws Exception {
        MyWebServer myWebServer = new MyWebServer();
        //String res = myWebServer.request(args[0]);
        String uri=""; //args[0]
        String res;
        
        res = myWebServer.request("/index1.do?name=abc&age=15");
        // res = myWebServer.request("/home.do?name=abc&age=15");
        // res = myWebServer.request("/about.do?name=abc&age=15");
        // res = myWebServer.request("/login.do?name=abc&age=15");
        // res = myWebServer.request("/index.do?name=abc&age=15");
        // res = myWebServer.request("/index.do?name=abc&age=15");
        //res = myWebServer.request("/index.html");

        System.out.println("\n\n########################\n");
        System.out.println(uri);
        System.out.println("\n########################\n");
        System.out.println(res);
        System.out.println("\n########################\n\n");
    }
}