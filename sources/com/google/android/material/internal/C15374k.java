package com.google.android.material.internal;

import android.view.View;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import java.util.WeakHashMap;

/* renamed from: com.google.android.material.internal.k */
public final class C15374k implements View.OnAttachStateChangeListener {
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        C2364y.C2372h.m5253c(view);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
