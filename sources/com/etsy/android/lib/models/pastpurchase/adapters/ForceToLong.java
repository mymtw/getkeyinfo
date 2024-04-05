package com.etsy.android.lib.models.pastpurchase.adapters;

import com.squareup.moshi.C17404p;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@C17404p
@Retention(RetentionPolicy.RUNTIME)
public @interface ForceToLong {
}
