package com.bumptech.glide.load.engine;

import android.support.p013v4.media.C0072d;
import java.security.MessageDigest;
import p150j4.C7109b;

/* renamed from: com.bumptech.glide.load.engine.e */
public final class C6018e implements C7109b {

    /* renamed from: b */
    public final C7109b f12900b;

    /* renamed from: c */
    public final C7109b f12901c;

    public C6018e(C7109b bVar, C7109b bVar2) {
        this.f12900b = bVar;
        this.f12901c = bVar2;
    }

    /* renamed from: b */
    public final void mo12991b(MessageDigest messageDigest) {
        this.f12900b.mo12991b(messageDigest);
        this.f12901c.mo12991b(messageDigest);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6018e)) {
            return false;
        }
        C6018e eVar = (C6018e) obj;
        return this.f12900b.equals(eVar.f12900b) && this.f12901c.equals(eVar.f12901c);
    }

    public final int hashCode() {
        return this.f12901c.hashCode() + (this.f12900b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("DataCacheKey{sourceKey=");
        h.append(this.f12900b);
        h.append(", signature=");
        h.append(this.f12901c);
        h.append('}');
        return h.toString();
    }
}
