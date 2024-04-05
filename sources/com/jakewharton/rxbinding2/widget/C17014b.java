package com.jakewharton.rxbinding2.widget;

import android.view.View;
import android.widget.AdapterView;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.jakewharton.rxbinding2.widget.b */
public abstract class C17014b {
    public static C17014b create(AdapterView<?> adapterView, View view, int i, long j) {
        return new AutoValue_AdapterViewItemClickEvent(adapterView, view, i, j);
    }

    public abstract View clickedView();

    /* renamed from: id */
    public abstract long mo60195id();

    public abstract int position();

    public abstract AdapterView<?> view();
}
