package com.bumptech.glide.load.engine.bitmap_recycle;

import com.bumptech.glide.load.engine.bitmap_recycle.C6010l;
import java.util.ArrayDeque;
import p036c5.C4426l;

/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.c */
public abstract class C5997c<T extends C6010l> {

    /* renamed from: a */
    public final ArrayDeque f12847a = new ArrayDeque(20);

    public C5997c() {
        char[] cArr = C4426l.f9710a;
    }

    /* renamed from: a */
    public abstract T mo16917a();

    /* renamed from: b */
    public final T mo16918b() {
        T t = (C6010l) this.f12847a.poll();
        return t == null ? mo16917a() : t;
    }

    /* renamed from: c */
    public final void mo16919c(T t) {
        if (this.f12847a.size() < 20) {
            this.f12847a.offer(t);
        }
    }
}
