package com.google.android.gms.internal.measurement;

import android.content.Context;
import androidx.compose.animation.C0391c;

/* renamed from: com.google.android.gms.internal.measurement.w3 */
public final class C14853w3 extends C14729m4 {

    /* renamed from: a */
    public final Context f33143a;

    /* renamed from: b */
    public final C14768p4<zzhz<C14612d4>> f33144b;

    public C14853w3(Context context, C14768p4<zzhz<C14612d4>> p4Var) {
        this.f33143a = context;
        this.f33144b = p4Var;
    }

    /* renamed from: a */
    public final Context mo50679a() {
        return this.f33143a;
    }

    /* renamed from: b */
    public final C14768p4<zzhz<C14612d4>> mo50680b() {
        return this.f33144b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f33144b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.gms.internal.measurement.C14729m4
            r2 = 0
            if (r1 == 0) goto L_0x002e
            com.google.android.gms.internal.measurement.m4 r5 = (com.google.android.gms.internal.measurement.C14729m4) r5
            android.content.Context r1 = r4.f33143a
            android.content.Context r3 = r5.mo50679a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002e
            com.google.android.gms.internal.measurement.p4<com.google.android.gms.internal.measurement.zzhz<com.google.android.gms.internal.measurement.d4>> r1 = r4.f33144b
            if (r1 != 0) goto L_0x0022
            com.google.android.gms.internal.measurement.p4 r5 = r5.mo50680b()
            if (r5 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0022:
            com.google.android.gms.internal.measurement.p4 r5 = r5.mo50680b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            return r0
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C14853w3.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (this.f33143a.hashCode() ^ 1000003) * 1000003;
        C14768p4<zzhz<C14612d4>> p4Var = this.f33144b;
        return hashCode ^ (p4Var == null ? 0 : p4Var.hashCode());
    }

    public final String toString() {
        String obj = this.f33143a.toString();
        String valueOf = String.valueOf(this.f33144b);
        StringBuilder sb = new StringBuilder(obj.length() + 46 + valueOf.length());
        C0391c.m1061h(sb, "FlagsContext{context=", obj, ", hermeticFileOverrides=", valueOf);
        sb.append("}");
        return sb.toString();
    }
}
