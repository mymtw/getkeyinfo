package com.jakewharton.rxbinding2.widget;

import android.view.KeyEvent;
import android.widget.TextView;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.jakewharton.rxbinding2.widget.p */
public abstract class C17029p {
    public static C17029p create(TextView textView, int i, KeyEvent keyEvent) {
        return new AutoValue_TextViewEditorActionEvent(textView, i, keyEvent);
    }

    public abstract int actionId();

    public abstract KeyEvent keyEvent();

    public abstract TextView view();
}
