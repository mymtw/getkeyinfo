package com.bumptech.glide.load.engine;

import android.support.p013v4.media.C0072d;
import com.bumptech.glide.load.engine.bitmap_recycle.C5996b;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p036c5.C4422i;
import p036c5.C4426l;
import p150j4.C7109b;
import p150j4.C7114e;
import p150j4.C7117h;

/* renamed from: com.bumptech.glide.load.engine.u */
public final class C6053u implements C7109b {

    /* renamed from: j */
    public static final C4422i<Class<?>, byte[]> f13024j = new C4422i<>(50);

    /* renamed from: b */
    public final C5996b f13025b;

    /* renamed from: c */
    public final C7109b f13026c;

    /* renamed from: d */
    public final C7109b f13027d;

    /* renamed from: e */
    public final int f13028e;

    /* renamed from: f */
    public final int f13029f;

    /* renamed from: g */
    public final Class<?> f13030g;

    /* renamed from: h */
    public final C7114e f13031h;

    /* renamed from: i */
    public final C7117h<?> f13032i;

    public C6053u(C5996b bVar, C7109b bVar2, C7109b bVar3, int i, int i2, C7117h<?> hVar, Class<?> cls, C7114e eVar) {
        this.f13025b = bVar;
        this.f13026c = bVar2;
        this.f13027d = bVar3;
        this.f13028e = i;
        this.f13029f = i2;
        this.f13032i = hVar;
        this.f13030g = cls;
        this.f13031h = eVar;
    }

    /* renamed from: b */
    public final void mo12991b(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f13025b.mo16915d();
        ByteBuffer.wrap(bArr).putInt(this.f13028e).putInt(this.f13029f).array();
        this.f13027d.mo12991b(messageDigest);
        this.f13026c.mo12991b(messageDigest);
        messageDigest.update(bArr);
        C7117h<?> hVar = this.f13032i;
        if (hVar != null) {
            hVar.mo12991b(messageDigest);
        }
        this.f13031h.mo12991b(messageDigest);
        C4422i<Class<?>, byte[]> iVar = f13024j;
        byte[] a = iVar.mo14373a(this.f13030g);
        if (a == null) {
            a = this.f13030g.getName().getBytes(C7109b.f15813a);
            iVar.mo14376d(this.f13030g, a);
        }
        messageDigest.update(a);
        this.f13025b.put(bArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6053u)) {
            return false;
        }
        C6053u uVar = (C6053u) obj;
        return this.f13029f == uVar.f13029f && this.f13028e == uVar.f13028e && C4426l.m10128b(this.f13032i, uVar.f13032i) && this.f13030g.equals(uVar.f13030g) && this.f13026c.equals(uVar.f13026c) && this.f13027d.equals(uVar.f13027d) && this.f13031h.equals(uVar.f13031h);
    }

    public final int hashCode() {
        int hashCode = ((((this.f13027d.hashCode() + (this.f13026c.hashCode() * 31)) * 31) + this.f13028e) * 31) + this.f13029f;
        C7117h<?> hVar = this.f13032i;
        if (hVar != null) {
            hashCode = (hashCode * 31) + hVar.hashCode();
        }
        int hashCode2 = this.f13030g.hashCode();
        return this.f13031h.hashCode() + ((hashCode2 + (hashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ResourceCacheKey{sourceKey=");
        h.append(this.f13026c);
        h.append(", signature=");
        h.append(this.f13027d);
        h.append(", width=");
        h.append(this.f13028e);
        h.append(", height=");
        h.append(this.f13029f);
        h.append(", decodedResourceClass=");
        h.append(this.f13030g);
        h.append(", transformation='");
        h.append(this.f13032i);
        h.append('\'');
        h.append(", options=");
        h.append(this.f13031h);
        h.append('}');
        return h.toString();
    }
}
