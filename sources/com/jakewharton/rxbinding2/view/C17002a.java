package com.jakewharton.rxbinding2.view;

import android.view.MenuItem;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.jakewharton.rxbinding2.view.a */
public abstract class C17002a extends C17003b {
    public static C17002a create(MenuItem menuItem) {
        return new AutoValue_MenuItemActionViewCollapseEvent(menuItem);
    }
}
