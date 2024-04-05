package com.jakewharton.rxbinding2.view;

import android.view.View;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.jakewharton.rxbinding2.view.k */
public abstract class C17012k {
    public static C17012k create(View view, int i, int i2, int i3, int i4) {
        return new AutoValue_ViewScrollChangeEvent(view, i, i2, i3, i4);
    }

    public abstract int oldScrollX();

    public abstract int oldScrollY();

    public abstract int scrollX();

    public abstract int scrollY();

    public abstract View view();
}
