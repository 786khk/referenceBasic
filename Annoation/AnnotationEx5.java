package Annoation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Deprecated
@SuppressWarnings("111")
@TestInfo(testBy = "aaa", testDateTime = @DateTime(yymmdd="230315", hhmmss="184545"))
public class AnnotationEx5 {
    public static void main(String[] args) {
        Class<AnnotationEx5> cl = AnnotationEx5.class;
        TestInfo anno = (TestInfo)cl.getAnnotation(TestInfo.class);

        System.out.println("anno.testedBy()=" + anno.testBy());
        System.out.println("anno.testDateTime()=" + anno.testDateTime());
        System.out.println("anno.testDateTime()=" + anno.testDateTime());
        for(String s : anno.testToools())System.out.println("testTools : "+s);
        
        System.out.println();
        Annotation[] anoarr = cl.getAnnotations();

        for(Annotation a: anoarr) System.out.println(a);
        
    }
}
@Retention(RetentionPolicy.RUNTIME)
@interface TestInfo{
    int count() default 1;
    String testBy();
    String[] testToools() default "JUnit";
    TestType testType() default TestType.FIRST;
    DateTime testDateTime();
}
@Retention(RetentionPolicy.RUNTIME)
@interface DateTime{
    String yymmdd();
    String hhmmss();
}

enum TestType{ FIRST, FINAL}
