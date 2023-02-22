public class App {
    public static void main(String[] args) throws Exception {
        MyWebServer myWebServer = new MyWebServer();
        //String res = myWebServer.request(args[0]);
        String uri = "/index.do?name=abc&age=15"; //args[0]
        String res = myWebServer.request(uri);
        //String res = myWebServer.request("/index.html");

        System.out.println("\n\n########################\n");
        System.out.println(uri);
        System.out.println("\n########################\n");
        System.out.println(res);
        System.out.println("\n########################\n\n");
    }
}