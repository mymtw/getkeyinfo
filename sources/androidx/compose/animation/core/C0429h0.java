package androidx.compose.animation.core;

import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: androidx.compose.animation.core.h0 */
public final class C0429h0<T> implements C0454t<T> {

    /* renamed from: a */
    public final float f1128a;

    /* renamed from: b */
    public final float f1129b;

    /* renamed from: c */
    public final T f1130c;

    public C0429h0() {
        this((Object) null, 7);
    }

    public C0429h0(float f, float f2, T t) {
        this.f1128a = f;
        this.f1129b = f2;
        this.f1130c = t;
    }

    /* renamed from: a */
    public final C0439m0 mo3470a(C0435k0 k0Var) {
        C19383o.m32797g(k0Var, "converter");
        float f = this.f1128a;
        float f2 = this.f1129b;
        T t = this.f1130c;
        return new C0463x0(f, f2, t == null ? null : (C0432j) k0Var.mo3509a().invoke(t));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0429h0) {
            C0429h0 h0Var = (C0429h0) obj;
            if (h0Var.f1128a == this.f1128a) {
                if ((h0Var.f1129b == this.f1129b) && C19383o.m32792b(h0Var.f1130c, this.f1130c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        T t = this.f1130c;
        return Float.hashCode(this.f1129b) + C0023f.m104c(this.f1128a, (t != null ? t.hashCode() : 0) * 31, 31);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0429h0(Object obj, int i) {
        this((i & 1) != 0 ? 1.0f : 0.0f, (i & 2) != 0 ? 1500.0f : 0.0f, (i & 4) != 0 ? null : obj);
    }
}
