package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.e */
public final class C14956e {

    /* renamed from: c */
    public static final C14956e f33362c = new C14956e((Boolean) null, (Boolean) null);

    /* renamed from: a */
    public final Boolean f33363a;

    /* renamed from: b */
    public final Boolean f33364b;

    public C14956e(Boolean bool, Boolean bool2) {
        this.f33363a = bool;
        this.f33364b = bool2;
    }

    /* renamed from: a */
    public static C14956e m24274a(Bundle bundle) {
        return bundle == null ? f33362c : new C14956e(m24277h(bundle.getString("ad_storage")), m24277h(bundle.getString("analytics_storage")));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.measurement.internal.C14956e m24275b(java.lang.String r7) {
        /*
            r0 = 0
            if (r7 == 0) goto L_0x0037
            int r1 = r7.length()
            r2 = 3
            r3 = 49
            r4 = 48
            if (r1 < r2) goto L_0x001e
            r1 = 2
            char r1 = r7.charAt(r1)
            if (r1 == r4) goto L_0x001b
            if (r1 == r3) goto L_0x0018
            goto L_0x001e
        L_0x0018:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto L_0x001f
        L_0x001b:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L_0x001f
        L_0x001e:
            r1 = r0
        L_0x001f:
            int r5 = r7.length()
            r6 = 4
            if (r5 < r6) goto L_0x0034
            char r7 = r7.charAt(r2)
            if (r7 == r4) goto L_0x0032
            if (r7 == r3) goto L_0x002f
            goto L_0x0034
        L_0x002f:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x0034
        L_0x0032:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L_0x0034:
            r7 = r0
            r0 = r1
            goto L_0x0038
        L_0x0037:
            r7 = r0
        L_0x0038:
            com.google.android.gms.measurement.internal.e r1 = new com.google.android.gms.measurement.internal.e
            r1.<init>(r0, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C14956e.m24275b(java.lang.String):com.google.android.gms.measurement.internal.e");
    }

    /* renamed from: g */
    public static final int m24276g(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    /* renamed from: h */
    public static Boolean m24277h(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* renamed from: c */
    public final C14956e mo51983c(C14956e eVar) {
        Boolean bool = this.f33363a;
        Boolean bool2 = eVar.f33363a;
        boolean z = true;
        if (bool == null) {
            bool = bool2;
        } else if (bool2 != null) {
            bool = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
        }
        Boolean bool3 = this.f33364b;
        Boolean bool4 = eVar.f33364b;
        if (bool3 == null) {
            bool3 = bool4;
        } else if (bool4 != null) {
            if (!bool3.booleanValue() || !bool4.booleanValue()) {
                z = false;
            }
            bool3 = Boolean.valueOf(z);
        }
        return new C14956e(bool, bool3);
    }

    /* renamed from: d */
    public final String mo51984d() {
        StringBuilder sb = new StringBuilder("G1");
        Boolean bool = this.f33363a;
        char c = '1';
        sb.append(bool == null ? '-' : bool.booleanValue() ? '1' : '0');
        Boolean bool2 = this.f33364b;
        if (bool2 == null) {
            c = '-';
        } else if (!bool2.booleanValue()) {
            c = '0';
        }
        sb.append(c);
        return sb.toString();
    }

    /* renamed from: e */
    public final boolean mo51985e() {
        Boolean bool = this.f33363a;
        return bool == null || bool.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14956e)) {
            return false;
        }
        C14956e eVar = (C14956e) obj;
        return m24276g(this.f33363a) == m24276g(eVar.f33363a) && m24276g(this.f33364b) == m24276g(eVar.f33364b);
    }

    /* renamed from: f */
    public final boolean mo51987f() {
        Boolean bool = this.f33364b;
        return bool == null || bool.booleanValue();
    }

    public final int hashCode() {
        return m24276g(this.f33364b) + ((m24276g(this.f33363a) + 527) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConsentSettings: ");
        sb.append("adStorage=");
        Boolean bool = this.f33363a;
        String str = "denied";
        if (bool == null) {
            sb.append("uninitialized");
        } else {
            sb.append(true != bool.booleanValue() ? str : "granted");
        }
        sb.append(", analyticsStorage=");
        Boolean bool2 = this.f33364b;
        if (bool2 == null) {
            sb.append("uninitialized");
        } else {
            if (true == bool2.booleanValue()) {
                str = "granted";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
