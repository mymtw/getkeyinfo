package com.squareup.moshi;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.squareup.moshi.n */
public @interface C17402n {
    boolean ignore() default false;

    String name() default "\u0000";
}
