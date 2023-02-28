public class PagesException  extends RuntimeException{
    String pageName = "";

    public PagesException(String pageName) {
        super();
    }

    public PagesException() {
        super();
    }

    public PagesException(String message, String pageName) {
        super(message);
        this.pageName = pageName;
    }
}
