package com.etsy.android.uikit.view;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C3198u;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.uikit.view.b */
public final class C11928b extends C3198u {

    /* renamed from: q */
    public final /* synthetic */ CustomScrollingLayoutManager f26502q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11928b(CustomScrollingLayoutManager customScrollingLayoutManager, Context context) {
        super(context);
        this.f26502q = customScrollingLayoutManager;
    }

    /* renamed from: a */
    public final PointF mo11706a(int i) {
        return this.f26502q.mo11291a(i);
    }

    /* renamed from: i */
    public final float mo11827i(DisplayMetrics displayMetrics) {
        C19383o.m32797g(displayMetrics, "displayMetrics");
        return 100.0f / ((float) displayMetrics.densityDpi);
    }
}
