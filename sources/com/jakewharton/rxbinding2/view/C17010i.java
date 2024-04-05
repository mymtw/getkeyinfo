package com.jakewharton.rxbinding2.view;

import android.view.View;
import android.view.ViewGroup;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.jakewharton.rxbinding2.view.i */
public abstract class C17010i extends C17008g {
    public static C17010i create(ViewGroup viewGroup, View view) {
        return new AutoValue_ViewGroupHierarchyChildViewRemoveEvent(viewGroup, view);
    }
}
