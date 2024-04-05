package com.jakewharton.rxbinding2.widget;

import android.widget.RatingBar;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.jakewharton.rxbinding2.widget.g */
public abstract class C17019g {
    public static C17019g create(RatingBar ratingBar, float f, boolean z) {
        return new AutoValue_RatingBarChangeEvent(ratingBar, f, z);
    }

    public abstract boolean fromUser();

    public abstract float rating();

    public abstract RatingBar view();
}
