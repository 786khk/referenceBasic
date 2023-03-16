package Annoation;

public class AnnotationEx2 {
    public static void main(String[] args) {
        newClass n = new newClass();
        n.old = 10; 
        System.out.println(n.getOld());
    }
}

class newClass {
    int newFeild;
    int getNewFeild(){return newFeild;}
    @Deprecated
    int old;
    @Deprecated
    int getOld(){return old;}
}
// 컴파일시 아래 메세지가 뜬다.
//Note: .\Annoation\AnnotationEx2.java uses or overrides a deprecated API.
// Note: Recompile with -Xlint:deprecation for details.


// 언급된대로 커맨드를 추가해 실ㄹ행하면 ㅇ;렇게 뜸
/*
 .\Annoation\AnnotationEx2.java:6: warning: [deprecation] old in newClass has been deprecated
        n.old = 10;
         ^
.\Annoation\AnnotationEx2.java:7: warning: [deprecation] getOld() in newClass has been deprecated
        System.out.println(n.getOld());
                            ^
2 warnings
PS D:\01.테스트 프로젝트\4.기본교육\referenceBasic> javac -Xlint:deprecation .\Annoation\AnnotationEx2.java
.\Annoation\AnnotationEx2.java:6: warning: [deprecation] old in newClass has been deprecated
        n.old = 10; 
         ^
.\Annoation\AnnotationEx2.java:7: warning: [deprecation] getOld() in newClass has been deprecated
        System.out.println(n.getOld());
                            ^
2 warnings
 */