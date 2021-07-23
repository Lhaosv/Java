package AnnocationPackage.ReflectAnnocation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/*
自定义注解
 */
//希望这个注解可以被反射：
@Retention(RetentionPolicy.RUNTIME)
//只允许该注解可以标注方法和类：
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface Myannocation {
    String username();
    String password();
}
