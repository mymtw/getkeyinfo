package com.google.android.datatransport.runtime;

import android.support.p013v4.media.C0072d;
import com.google.android.datatransport.C6493a;
import java.util.Arrays;

/* renamed from: com.google.android.datatransport.runtime.j */
public final class C6546j {

    /* renamed from: a */
    public final C6493a f14482a;

    /* renamed from: b */
    public final byte[] f14483b;

    public C6546j(C6493a aVar, byte[] bArr) {
        if (aVar == null) {
            throw new NullPointerException("encoding is null");
        } else if (bArr != null) {
            this.f14482a = aVar;
            this.f14483b = bArr;
        } else {
            throw new NullPointerException("bytes is null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6546j)) {
            return false;
        }
        C6546j jVar = (C6546j) obj;
        if (!this.f14482a.equals(jVar.f14482a)) {
            return false;
        }
        return Arrays.equals(this.f14483b, jVar.f14483b);
    }

    public final int hashCode() {
        return ((this.f14482a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f14483b);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("EncodedPayload{encoding=");
        h.append(this.f14482a);
        h.append(", bytes=[...]}");
        return h.toString();
    }
}
