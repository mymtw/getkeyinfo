package com.jakewharton.rxbinding2.widget;

import android.widget.TextView;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.jakewharton.rxbinding2.widget.r */
public abstract class C17032r {
    public static C17032r create(TextView textView, CharSequence charSequence, int i, int i2, int i3) {
        return new AutoValue_TextViewTextChangeEvent(textView, charSequence, i, i2, i3);
    }

    public abstract int before();

    public abstract int count();

    public abstract int start();

    public abstract CharSequence text();

    public abstract TextView view();
}
