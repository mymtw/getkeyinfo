package com.jakewharton.rxbinding2.widget;

import android.text.Editable;
import android.widget.TextView;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.jakewharton.rxbinding2.widget.m */
public abstract class C17025m {
    public static C17025m create(TextView textView, Editable editable) {
        return new AutoValue_TextViewAfterTextChangeEvent(textView, editable);
    }

    public abstract Editable editable();

    public abstract TextView view();
}
