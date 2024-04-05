package com.jakewharton.rxbinding2.widget;

import android.view.View;
import android.widget.AdapterView;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.jakewharton.rxbinding2.widget.d */
public abstract class C17016d extends C17018f {
    public static C17018f create(AdapterView<?> adapterView, View view, int i, long j) {
        return new AutoValue_AdapterViewItemSelectionEvent(adapterView, view, i, j);
    }

    /* renamed from: id */
    public abstract long mo60208id();

    public abstract int position();

    public abstract View selectedView();
}
