package androidx.compose.animation.core;

import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.animation.core.z */
public final class C0466z<T> implements C0422e<T> {

    /* renamed from: a */
    public final C0446q<T> f1200a;

    /* renamed from: b */
    public final RepeatMode f1201b;

    /* renamed from: c */
    public final long f1202c;

    public C0466z() {
        throw null;
    }

    public C0466z(C0446q qVar, RepeatMode repeatMode, long j) {
        this.f1200a = qVar;
        this.f1201b = repeatMode;
        this.f1202c = j;
    }

    /* renamed from: a */
    public final <V extends C0432j> C0439m0<V> mo3470a(C0435k0<T, V> k0Var) {
        C19383o.m32797g(k0Var, "converter");
        return new C0457u0(this.f1200a.mo3470a(k0Var), this.f1201b, this.f1202c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0466z) {
            C0466z zVar = (C0466z) obj;
            if (C19383o.m32792b(zVar.f1200a, this.f1200a) && zVar.f1201b == this.f1201b) {
                if (zVar.f1202c == this.f1202c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f1201b.hashCode();
        return Long.hashCode(this.f1202c) + ((hashCode + (this.f1200a.hashCode() * 31)) * 31);
    }
}
