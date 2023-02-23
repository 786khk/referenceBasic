public class Config {
    public void loadInterceptors(Interceptors interceptors) {
        interceptors.add(new ResourceRenameInterceptor());
        //의존을 줄이기 위해 구조를분리했음 그래서 config파일을 만듦
    }    
}
