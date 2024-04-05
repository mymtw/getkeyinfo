package com.bumptech.glide.load.engine;

import androidx.activity.C0114h;
import p150j4.C7109b;

/* renamed from: com.bumptech.glide.load.engine.o */
public final class C6045o<Z> implements C6051s<Z> {

    /* renamed from: b */
    public final boolean f12999b;

    /* renamed from: c */
    public final boolean f13000c;

    /* renamed from: d */
    public final C6051s<Z> f13001d;

    /* renamed from: e */
    public final C6046a f13002e;

    /* renamed from: f */
    public final C7109b f13003f;

    /* renamed from: g */
    public int f13004g;

    /* renamed from: h */
    public boolean f13005h;

    /* renamed from: com.bumptech.glide.load.engine.o$a */
    public interface C6046a {
        /* renamed from: a */
        void mo16969a(C7109b bVar, C6045o<?> oVar);
    }

    public C6045o(C6051s<Z> sVar, boolean z, boolean z2, C7109b bVar, C6046a aVar) {
        C0114h.m281L(sVar);
        this.f13001d = sVar;
        this.f12999b = z;
        this.f13000c = z2;
        this.f13003f = bVar;
        C0114h.m281L(aVar);
        this.f13002e = aVar;
    }

    /* renamed from: a */
    public final int mo16989a() {
        return this.f13001d.mo16989a();
    }

    /* renamed from: b */
    public final synchronized void mo16990b() {
        if (this.f13004g > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f13005h) {
            this.f13005h = true;
            if (this.f13000c) {
                this.f13001d.mo16990b();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    /* renamed from: c */
    public final synchronized void mo16991c() {
        if (!this.f13005h) {
            this.f13004g++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    /* renamed from: d */
    public final Class<Z> mo16992d() {
        return this.f13001d.mo16992d();
    }

    /* renamed from: e */
    public final void mo16993e() {
        boolean z;
        synchronized (this) {
            int i = this.f13004g;
            if (i > 0) {
                z = true;
                int i2 = i - 1;
                this.f13004g = i2;
                if (i2 != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            this.f13002e.mo16969a(this.f13003f, this);
        }
    }

    public final Z get() {
        return this.f13001d.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f12999b + ", listener=" + this.f13002e + ", key=" + this.f13003f + ", acquired=" + this.f13004g + ", isRecycled=" + this.f13005h + ", resource=" + this.f13001d + '}';
    }
}
