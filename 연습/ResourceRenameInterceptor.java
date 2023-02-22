package 연습;

public class ResourceRenameInterceptor { //확장자 do를 html로 변환하는 파일
    String action;

    public String resourceSecurity(String url){
        String action = "do";
        if(url.contains(action)){
            url =  url.replace(action,"html");

        }

        return url;
    }
    //지금은 인터셉터가 하나만 동작하는데 디폴트와 함께 이것도 동작하도록

}
