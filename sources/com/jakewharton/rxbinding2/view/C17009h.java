package com.jakewharton.rxbinding2.view;

import android.view.View;
import android.view.ViewGroup;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.jakewharton.rxbinding2.view.h */
public abstract class C17009h extends C17008g {
    public static C17009h create(ViewGroup viewGroup, View view) {
        return new AutoValue_ViewGroupHierarchyChildViewAddEvent(viewGroup, view);
    }
}
