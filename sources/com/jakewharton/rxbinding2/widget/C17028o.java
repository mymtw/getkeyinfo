package com.jakewharton.rxbinding2.widget;

import android.widget.TextView;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.jakewharton.rxbinding2.widget.o */
public abstract class C17028o {
    public static C17028o create(TextView textView, CharSequence charSequence, int i, int i2, int i3) {
        return new AutoValue_TextViewBeforeTextChangeEvent(textView, charSequence, i, i2, i3);
    }

    public abstract int after();

    public abstract int count();

    public abstract int start();

    public abstract CharSequence text();

    public abstract TextView view();
}
