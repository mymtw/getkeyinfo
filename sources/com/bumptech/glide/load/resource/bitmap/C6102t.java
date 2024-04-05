package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.activity.C0114h;
import com.bumptech.glide.load.engine.C6047p;
import com.bumptech.glide.load.engine.C6051s;

/* renamed from: com.bumptech.glide.load.resource.bitmap.t */
public final class C6102t implements C6051s<BitmapDrawable>, C6047p {

    /* renamed from: b */
    public final Resources f13124b;

    /* renamed from: c */
    public final C6051s<Bitmap> f13125c;

    public C6102t(Resources resources, C6051s<Bitmap> sVar) {
        C0114h.m281L(resources);
        this.f13124b = resources;
        C0114h.m281L(sVar);
        this.f13125c = sVar;
    }

    /* renamed from: a */
    public final int mo16989a() {
        return this.f13125c.mo16989a();
    }

    /* renamed from: b */
    public final void mo16990b() {
        this.f13125c.mo16990b();
    }

    /* renamed from: c */
    public final void mo16996c() {
        C6051s<Bitmap> sVar = this.f13125c;
        if (sVar instanceof C6047p) {
            ((C6047p) sVar).mo16996c();
        }
    }

    /* renamed from: d */
    public final Class<BitmapDrawable> mo16992d() {
        return BitmapDrawable.class;
    }

    public final Object get() {
        return new BitmapDrawable(this.f13124b, this.f13125c.get());
    }
}
