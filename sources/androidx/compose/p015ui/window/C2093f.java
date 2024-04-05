package androidx.compose.p015ui.window;

import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.window.f */
public final class C2093f {

    /* renamed from: a */
    public final boolean f4729a;

    /* renamed from: b */
    public final boolean f4730b;

    /* renamed from: c */
    public final boolean f4731c;

    /* renamed from: d */
    public final SecureFlagPolicy f4732d;

    /* renamed from: e */
    public final boolean f4733e;

    /* renamed from: f */
    public final boolean f4734f;

    /* renamed from: g */
    public final boolean f4735g;

    public C2093f(boolean z, boolean z2, boolean z3, SecureFlagPolicy secureFlagPolicy, boolean z4, boolean z5, boolean z6) {
        C19383o.m32797g(secureFlagPolicy, "securePolicy");
        this.f4729a = z;
        this.f4730b = z2;
        this.f4731c = z3;
        this.f4732d = secureFlagPolicy;
        this.f4733e = z4;
        this.f4734f = z5;
        this.f4735g = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2093f)) {
            return false;
        }
        C2093f fVar = (C2093f) obj;
        return this.f4729a == fVar.f4729a && this.f4730b == fVar.f4730b && this.f4731c == fVar.f4731c && this.f4732d == fVar.f4732d && this.f4733e == fVar.f4733e && this.f4734f == fVar.f4734f && this.f4735g == fVar.f4735g;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f4729a);
        int hashCode2 = Boolean.hashCode(this.f4730b);
        int hashCode3 = Boolean.hashCode(this.f4731c);
        int hashCode4 = this.f4732d.hashCode();
        int hashCode5 = Boolean.hashCode(this.f4733e);
        int hashCode6 = Boolean.hashCode(this.f4734f);
        return Boolean.hashCode(this.f4735g) + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (Boolean.hashCode(this.f4730b) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public C2093f() {
        this(false, true, true, SecureFlagPolicy.Inherit, true, true, false);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2093f(boolean r11, boolean r12, boolean r13, boolean r14, int r15) {
        /*
            r10 = this;
            r0 = r15 & 1
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r3 = r1
            goto L_0x0008
        L_0x0007:
            r3 = r11
        L_0x0008:
            r11 = r15 & 2
            r0 = 1
            if (r11 == 0) goto L_0x000f
            r4 = r0
            goto L_0x0010
        L_0x000f:
            r4 = r12
        L_0x0010:
            r11 = r15 & 4
            if (r11 == 0) goto L_0x0016
            r5 = r0
            goto L_0x0017
        L_0x0016:
            r5 = r13
        L_0x0017:
            r11 = r15 & 8
            if (r11 == 0) goto L_0x001e
            androidx.compose.ui.window.SecureFlagPolicy r11 = androidx.compose.p015ui.window.SecureFlagPolicy.Inherit
            goto L_0x001f
        L_0x001e:
            r11 = 0
        L_0x001f:
            r6 = r11
            r11 = r15 & 16
            if (r11 == 0) goto L_0x0026
            r7 = r0
            goto L_0x0027
        L_0x0026:
            r7 = r14
        L_0x0027:
            r11 = r15 & 32
            if (r11 == 0) goto L_0x002d
            r8 = r0
            goto L_0x002e
        L_0x002d:
            r8 = r1
        L_0x002e:
            java.lang.String r11 = "securePolicy"
            kotlin.jvm.internal.C19383o.m32797g(r6, r11)
            r9 = 0
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.window.C2093f.<init>(boolean, boolean, boolean, boolean, int):void");
    }
}
