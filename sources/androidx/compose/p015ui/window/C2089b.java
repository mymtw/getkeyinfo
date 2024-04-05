package androidx.compose.p015ui.window;

import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.window.b */
public final class C2089b {

    /* renamed from: a */
    public final boolean f4725a;

    /* renamed from: b */
    public final boolean f4726b;

    /* renamed from: c */
    public final SecureFlagPolicy f4727c;

    /* renamed from: d */
    public final boolean f4728d;

    public C2089b(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3) {
        C19383o.m32797g(secureFlagPolicy, "securePolicy");
        this.f4725a = z;
        this.f4726b = z2;
        this.f4727c = secureFlagPolicy;
        this.f4728d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2089b)) {
            return false;
        }
        C2089b bVar = (C2089b) obj;
        return this.f4725a == bVar.f4725a && this.f4726b == bVar.f4726b && this.f4727c == bVar.f4727c && this.f4728d == bVar.f4728d;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f4726b);
        int hashCode2 = this.f4727c.hashCode();
        return Boolean.hashCode(this.f4728d) + ((hashCode2 + ((hashCode + (Boolean.hashCode(this.f4725a) * 31)) * 31)) * 31);
    }

    public C2089b() {
        this(true, true, SecureFlagPolicy.Inherit, true);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2089b(int r2) {
        /*
            r1 = this;
            androidx.compose.ui.window.SecureFlagPolicy r2 = androidx.compose.p015ui.window.SecureFlagPolicy.Inherit
            java.lang.String r0 = "securePolicy"
            kotlin.jvm.internal.C19383o.m32797g(r2, r0)
            r0 = 1
            r1.<init>(r0, r0, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.window.C2089b.<init>(int):void");
    }
}
