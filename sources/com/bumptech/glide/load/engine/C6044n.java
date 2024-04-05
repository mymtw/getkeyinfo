package com.bumptech.glide.load.engine;

import android.support.p013v4.media.C0072d;
import androidx.activity.C0114h;
import java.security.MessageDigest;
import java.util.Map;
import p036c5.C4413b;
import p150j4.C7109b;
import p150j4.C7114e;
import p150j4.C7117h;

/* renamed from: com.bumptech.glide.load.engine.n */
public final class C6044n implements C7109b {

    /* renamed from: b */
    public final Object f12990b;

    /* renamed from: c */
    public final int f12991c;

    /* renamed from: d */
    public final int f12992d;

    /* renamed from: e */
    public final Class<?> f12993e;

    /* renamed from: f */
    public final Class<?> f12994f;

    /* renamed from: g */
    public final C7109b f12995g;

    /* renamed from: h */
    public final Map<Class<?>, C7117h<?>> f12996h;

    /* renamed from: i */
    public final C7114e f12997i;

    /* renamed from: j */
    public int f12998j;

    public C6044n(Object obj, C7109b bVar, int i, int i2, C4413b bVar2, Class cls, Class cls2, C7114e eVar) {
        C0114h.m281L(obj);
        this.f12990b = obj;
        if (bVar != null) {
            this.f12995g = bVar;
            this.f12991c = i;
            this.f12992d = i2;
            C0114h.m281L(bVar2);
            this.f12996h = bVar2;
            if (cls != null) {
                this.f12993e = cls;
                if (cls2 != null) {
                    this.f12994f = cls2;
                    C0114h.m281L(eVar);
                    this.f12997i = eVar;
                    return;
                }
                throw new NullPointerException("Transcode class must not be null");
            }
            throw new NullPointerException("Resource class must not be null");
        }
        throw new NullPointerException("Signature must not be null");
    }

    /* renamed from: b */
    public final void mo12991b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6044n)) {
            return false;
        }
        C6044n nVar = (C6044n) obj;
        return this.f12990b.equals(nVar.f12990b) && this.f12995g.equals(nVar.f12995g) && this.f12992d == nVar.f12992d && this.f12991c == nVar.f12991c && this.f12996h.equals(nVar.f12996h) && this.f12993e.equals(nVar.f12993e) && this.f12994f.equals(nVar.f12994f) && this.f12997i.equals(nVar.f12997i);
    }

    public final int hashCode() {
        if (this.f12998j == 0) {
            int hashCode = this.f12990b.hashCode();
            this.f12998j = hashCode;
            int hashCode2 = ((((this.f12995g.hashCode() + (hashCode * 31)) * 31) + this.f12991c) * 31) + this.f12992d;
            this.f12998j = hashCode2;
            int hashCode3 = this.f12996h.hashCode() + (hashCode2 * 31);
            this.f12998j = hashCode3;
            int hashCode4 = this.f12993e.hashCode() + (hashCode3 * 31);
            this.f12998j = hashCode4;
            int hashCode5 = this.f12994f.hashCode() + (hashCode4 * 31);
            this.f12998j = hashCode5;
            this.f12998j = this.f12997i.hashCode() + (hashCode5 * 31);
        }
        return this.f12998j;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("EngineKey{model=");
        h.append(this.f12990b);
        h.append(", width=");
        h.append(this.f12991c);
        h.append(", height=");
        h.append(this.f12992d);
        h.append(", resourceClass=");
        h.append(this.f12993e);
        h.append(", transcodeClass=");
        h.append(this.f12994f);
        h.append(", signature=");
        h.append(this.f12995g);
        h.append(", hashCode=");
        h.append(this.f12998j);
        h.append(", transformations=");
        h.append(this.f12996h);
        h.append(", options=");
        h.append(this.f12997i);
        h.append('}');
        return h.toString();
    }
}
