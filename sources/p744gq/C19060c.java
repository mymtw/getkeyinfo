package p744gq;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: gq.c */
public @interface C19060c {
    /* renamed from: c */
    String mo70540c() default "";

    /* renamed from: f */
    String mo70541f() default "";

    /* renamed from: l */
    int[] mo70542l() default {};

    /* renamed from: m */
    String mo70543m() default "";

    /* renamed from: v */
    int mo70544v() default 1;
}
