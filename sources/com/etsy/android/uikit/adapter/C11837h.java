package com.etsy.android.uikit.adapter;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.C6127f;
import p302z4.C8448i;

/* renamed from: com.etsy.android.uikit.adapter.h */
public final class C11837h implements C6127f<Drawable> {

    /* renamed from: b */
    public final /* synthetic */ View f26318b;

    public C11837h(View view) {
        this.f26318b = view;
    }

    /* renamed from: f */
    public final boolean mo17169f(GlideException glideException, Object obj, C8448i iVar) {
        return false;
    }

    /* renamed from: h */
    public final boolean mo17172h(Object obj, Object obj2, C8448i iVar, DataSource dataSource) {
        Drawable drawable = (Drawable) obj;
        this.f26318b.setVisibility(8);
        return false;
    }
}
