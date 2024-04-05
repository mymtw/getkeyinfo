package com.bumptech.glide.load.engine;

import p080d5.C6652a;
import p080d5.C6660d;

/* renamed from: com.bumptech.glide.load.engine.r */
public final class C6049r<Z> implements C6051s<Z>, C6652a.C6656d {

    /* renamed from: f */
    public static final C6652a.C6655c f13009f = C6652a.m13024a(20, new C6050a());

    /* renamed from: b */
    public final C6660d.C6661a f13010b = new C6660d.C6661a();

    /* renamed from: c */
    public C6051s<Z> f13011c;

    /* renamed from: d */
    public boolean f13012d;

    /* renamed from: e */
    public boolean f13013e;

    /* renamed from: com.bumptech.glide.load.engine.r$a */
    public class C6050a implements C6652a.C6654b<C6049r<?>> {
        public final Object create() {
            return new C6049r();
        }
    }

    /* renamed from: a */
    public final int mo16989a() {
        return this.f13011c.mo16989a();
    }

    /* renamed from: b */
    public final synchronized void mo16990b() {
        this.f13010b.mo18831a();
        this.f13013e = true;
        if (!this.f13012d) {
            this.f13011c.mo16990b();
            this.f13011c = null;
            f13009f.mo18806a(this);
        }
    }

    /* renamed from: c */
    public final C6660d.C6661a mo16872c() {
        return this.f13010b;
    }

    /* renamed from: d */
    public final Class<Z> mo16992d() {
        return this.f13011c.mo16992d();
    }

    /* renamed from: e */
    public final synchronized void mo16999e() {
        this.f13010b.mo18831a();
        if (this.f13012d) {
            this.f13012d = false;
            if (this.f13013e) {
                mo16990b();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    public final Z get() {
        return this.f13011c.get();
    }
}
