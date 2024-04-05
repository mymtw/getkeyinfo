package com.airbnb.lottie;

import java.util.Arrays;

/* renamed from: com.airbnb.lottie.l */
public final class C4841l<V> {

    /* renamed from: a */
    public final V f10902a;

    /* renamed from: b */
    public final Throwable f10903b;

    public C4841l(C4828c cVar) {
        this.f10902a = cVar;
        this.f10903b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4841l)) {
            return false;
        }
        C4841l lVar = (C4841l) obj;
        V v = this.f10902a;
        if (v != null && v.equals(lVar.f10902a)) {
            return true;
        }
        Throwable th = this.f10903b;
        if (th == null || lVar.f10903b == null) {
            return false;
        }
        return th.toString().equals(this.f10903b.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10902a, this.f10903b});
    }

    public C4841l(Throwable th) {
        this.f10903b = th;
        this.f10902a = null;
    }
}
