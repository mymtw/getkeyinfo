package com.google.android.play.core.assetpacks;

import android.support.p013v4.media.C0070b;

/* renamed from: com.google.android.play.core.assetpacks.f0 */
public final class C15599f0 extends C15578a {

    /* renamed from: a */
    public final int f35130a;

    /* renamed from: b */
    public final String f35131b;

    /* renamed from: c */
    public final String f35132c;

    public C15599f0(int i, String str, String str2) {
        this.f35130a = i;
        this.f35131b = str;
        this.f35132c = str2;
    }

    /* renamed from: a */
    public final String mo55368a() {
        return this.f35132c;
    }

    /* renamed from: b */
    public final int mo55369b() {
        return this.f35130a;
    }

    /* renamed from: c */
    public final String mo55370c() {
        return this.f35131b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r1 = r4.f35132c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f35131b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.play.core.assetpacks.C15578a
            r2 = 0
            if (r1 == 0) goto L_0x003f
            com.google.android.play.core.assetpacks.a r5 = (com.google.android.play.core.assetpacks.C15578a) r5
            int r1 = r4.f35130a
            int r3 = r5.mo55369b()
            if (r1 != r3) goto L_0x003f
            java.lang.String r1 = r4.f35131b
            if (r1 != 0) goto L_0x001e
            java.lang.String r1 = r5.mo55370c()
            if (r1 != 0) goto L_0x003f
            goto L_0x0028
        L_0x001e:
            java.lang.String r3 = r5.mo55370c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003f
        L_0x0028:
            java.lang.String r1 = r4.f35132c
            if (r1 != 0) goto L_0x0033
            java.lang.String r5 = r5.mo55368a()
            if (r5 != 0) goto L_0x003f
            goto L_0x003e
        L_0x0033:
            java.lang.String r5 = r5.mo55368a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            return r0
        L_0x003f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C15599f0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = (this.f35130a ^ 1000003) * 1000003;
        String str = this.f35131b;
        int i2 = 0;
        int hashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f35132c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode ^ i2;
    }

    public final String toString() {
        int i = this.f35130a;
        String str = this.f35131b;
        String str2 = this.f35132c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb.append("AssetPackLocation{packStorageMethod=");
        sb.append(i);
        sb.append(", path=");
        sb.append(str);
        return C0070b.m184f(sb, ", assetsPath=", str2, "}");
    }
}
