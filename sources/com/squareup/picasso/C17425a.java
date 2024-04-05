package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.squareup.picasso.a */
public abstract class C17425a<T> {

    /* renamed from: a */
    public final Picasso f38056a;

    /* renamed from: b */
    public final C17459s f38057b;

    /* renamed from: c */
    public final C17426a f38058c;

    /* renamed from: d */
    public final boolean f38059d;

    /* renamed from: e */
    public final int f38060e;

    /* renamed from: f */
    public final int f38061f;

    /* renamed from: g */
    public final int f38062g;

    /* renamed from: h */
    public final Drawable f38063h;

    /* renamed from: i */
    public final String f38064i;

    /* renamed from: j */
    public final Object f38065j;

    /* renamed from: k */
    public boolean f38066k;

    /* renamed from: l */
    public boolean f38067l;

    /* renamed from: com.squareup.picasso.a$a */
    public static class C17426a<M> extends WeakReference<M> {

        /* renamed from: a */
        public final C17425a f38068a;

        public C17426a(C17425a aVar, M m, ReferenceQueue<? super M> referenceQueue) {
            super(m, referenceQueue);
            this.f38068a = aVar;
        }
    }

    public C17425a(Picasso picasso, Object obj, C17459s sVar, String str) {
        this.f38056a = picasso;
        this.f38057b = sVar;
        this.f38058c = obj == null ? null : new C17426a(this, obj, picasso.f38048i);
        this.f38060e = 0;
        this.f38061f = 0;
        this.f38059d = false;
        this.f38062g = 0;
        this.f38063h = null;
        this.f38064i = str;
        this.f38065j = this;
    }

    /* renamed from: a */
    public void mo68583a() {
        this.f38067l = true;
    }

    /* renamed from: b */
    public abstract void mo68584b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom);

    /* renamed from: c */
    public abstract void mo68585c(Exception exc);

    /* renamed from: d */
    public final T mo68586d() {
        C17426a aVar = this.f38058c;
        if (aVar == null) {
            return null;
        }
        return aVar.get();
    }
}
