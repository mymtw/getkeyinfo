package com.fasterxml.jackson.databind.jsonschema;

import com.fasterxml.jackson.annotation.JacksonAnnotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@JacksonAnnotation
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonSerializableSchema {
    public static final String NO_VALUE = "##irrelevant";

    /* renamed from: id */
    String mo44269id() default "";

    @Deprecated
    String schemaItemDefinition() default "##irrelevant";

    @Deprecated
    String schemaObjectPropertiesDefinition() default "##irrelevant";

    String schemaType() default "any";
}
