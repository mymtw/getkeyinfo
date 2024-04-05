package com.jakewharton.rxbinding2.widget;

import android.widget.AbsListView;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.jakewharton.rxbinding2.widget.a */
public abstract class C17013a {
    public static C17013a create(AbsListView absListView, int i, int i2, int i3, int i4) {
        return new AutoValue_AbsListViewScrollEvent(absListView, i, i2, i3, i4);
    }

    public abstract int firstVisibleItem();

    public abstract int scrollState();

    public abstract int totalItemCount();

    public abstract AbsListView view();

    public abstract int visibleItemCount();
}
