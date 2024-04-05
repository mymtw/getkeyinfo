package com.etsy.android.lib.models.apiv3.listing;

import com.squareup.moshi.C17404p;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@C17404p
@Retention(RetentionPolicy.RUNTIME)
public @interface EmptyArrayToMap {
}
