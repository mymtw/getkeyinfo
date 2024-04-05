package p373ja;

import okhttp3.C19994o;

/* renamed from: ja.a */
public final /* synthetic */ class C12967a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f28547b;

    /* renamed from: c */
    public final /* synthetic */ byte[] f28548c;

    /* renamed from: d */
    public final /* synthetic */ String f28549d;

    /* renamed from: e */
    public final /* synthetic */ String f28550e;

    /* renamed from: f */
    public final /* synthetic */ C19994o f28551f;

    public /* synthetic */ C12967a(int i, String str, String str2, C19994o oVar, byte[] bArr) {
        this.f28547b = i;
        this.f28548c = bArr;
        this.f28549d = str;
        this.f28550e = str2;
        this.f28551f = oVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0169  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            int r0 = r15.f28547b
            byte[] r1 = r15.f28548c
            java.lang.String r2 = r15.f28549d
            java.lang.String r3 = r15.f28550e
            okhttp3.o r4 = r15.f28551f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.util.Locale r6 = java.util.Locale.ROOT
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]
            long r9 = java.lang.System.currentTimeMillis()
            r11 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 / r11
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r10 = 0
            r8[r10] = r9
            java.lang.String r9 = "device_timestamp=%d "
            java.lang.String r8 = java.lang.String.format(r6, r9, r8)
            r5.append(r8)
            java.lang.String r8 = "HTTP "
            r5.append(r8)
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r8[r10] = r9
            java.lang.String r9 = "error %d: "
            java.lang.String r8 = java.lang.String.format(r6, r9, r8)
            r5.append(r8)
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r9 = new java.lang.String     // Catch:{ IOException -> 0x004f }
            java.lang.String r11 = "UTF-8"
            r9.<init>(r1, r11)     // Catch:{ IOException -> 0x004f }
            java.lang.String r1 = r9.trim()     // Catch:{ IOException -> 0x004f }
            goto L_0x0051
        L_0x004f:
            java.lang.String r1 = "Error processing response body"
        L_0x0051:
            r8[r10] = r1
            java.lang.String r1 = "\"%s\" "
            java.lang.String r1 = java.lang.String.format(r6, r1, r8)
            r5.append(r1)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.Object[] r6 = new java.lang.Object[r7]
            r6[r10] = r2
            java.lang.String r2 = "error: \"%s\""
            java.lang.String r2 = java.lang.String.format(r1, r2, r6)
            r5.append(r2)
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r2[r10] = r3
            java.lang.String r3 = "url=%s "
            java.lang.String r2 = java.lang.String.format(r1, r3, r2)
            r5.append(r2)
            java.lang.Object[] r2 = new java.lang.Object[r7]
            if (r4 != 0) goto L_0x0080
            java.lang.String r3 = "[]"
            goto L_0x0129
        L_0x0080:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "["
            r3.<init>(r6)
            java.util.TreeMap r6 = new java.util.TreeMap
            java.util.Comparator r8 = java.lang.String.CASE_INSENSITIVE_ORDER
            java.lang.String r9 = "CASE_INSENSITIVE_ORDER"
            kotlin.jvm.internal.C19383o.m32796f(r8, r9)
            r6.<init>(r8)
            java.lang.String[] r8 = r4.f44235b
            int r8 = r8.length
            r9 = 2
            int r8 = r8 / r9
            r11 = r10
        L_0x0099:
            if (r11 >= r8) goto L_0x00d3
            java.lang.String r12 = r4.mo72949c(r11)
            java.util.Locale r13 = java.util.Locale.US
            java.lang.String r14 = "Locale.US"
            kotlin.jvm.internal.C19383o.m32796f(r13, r14)
            if (r12 == 0) goto L_0x00cb
            java.lang.String r12 = r12.toLowerCase(r13)
            java.lang.String r13 = "(this as java.lang.String).toLowerCase(locale)"
            kotlin.jvm.internal.C19383o.m32796f(r12, r13)
            java.lang.Object r13 = r6.get(r12)
            java.util.List r13 = (java.util.List) r13
            if (r13 != 0) goto L_0x00c1
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r9)
            r6.put(r12, r13)
        L_0x00c1:
            java.lang.String r12 = r4.mo72955m(r11)
            r13.add(r12)
            int r11 = r11 + 1
            goto L_0x0099
        L_0x00cb:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)
            throw r0
        L_0x00d3:
            java.lang.String[] r4 = p373ja.C12968b.f28552a
            if (r4 != 0) goto L_0x00e9
            java.util.List<java.lang.String> r4 = com.etsy.android.lib.config.C8591a.f18700r
            com.etsy.android.lib.config.a r4 = p628nj.C18263b.f40056T
            com.etsy.android.lib.config.e r4 = r4.f18706f
            com.etsy.android.lib.config.EtsyConfigKey r8 = com.etsy.android.lib.config.C8592b.f18749O
            o9.l r4 = r4.mo21137g(r8)
            java.lang.String[] r4 = r4.mo45845l()
            p373ja.C12968b.f28552a = r4
        L_0x00e9:
            java.lang.String[] r4 = p373ja.C12968b.f28552a
            if (r4 == 0) goto L_0x0120
            int r8 = r4.length
            r11 = r10
            r12 = r11
        L_0x00f0:
            if (r11 >= r8) goto L_0x0120
            r13 = r4[r11]
            boolean r14 = r6.containsKey(r13)
            if (r14 == 0) goto L_0x011d
            if (r12 == 0) goto L_0x0101
            java.lang.String r12 = ", "
            r3.append(r12)
        L_0x0101:
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r12[r10] = r13
            java.lang.Object r13 = r6.get(r13)
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.lang.String r14 = ","
            java.lang.String r13 = android.text.TextUtils.join(r14, r13)
            r12[r7] = r13
            java.lang.String r13 = "\"%s: %s\""
            java.lang.String r12 = java.lang.String.format(r13, r12)
            r3.append(r12)
            r12 = r7
        L_0x011d:
            int r11 = r11 + 1
            goto L_0x00f0
        L_0x0120:
            java.lang.String r4 = "]"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x0129:
            r2[r10] = r3
            java.lang.String r3 = "headers=%s "
            java.lang.String r1 = java.lang.String.format(r1, r3, r2)
            r5.append(r1)
            int[] r1 = p373ja.C12968b.f28553b
            if (r1 != 0) goto L_0x014a
            java.util.List<java.lang.String> r1 = com.etsy.android.lib.config.C8591a.f18700r
            com.etsy.android.lib.config.a r1 = p628nj.C18263b.f40056T
            com.etsy.android.lib.config.e r1 = r1.f18706f
            com.etsy.android.lib.config.EtsyConfigKey r2 = com.etsy.android.lib.config.C8592b.f18747N
            o9.l r1 = r1.mo21137g(r2)
            int[] r1 = r1.mo45842i()
            p373ja.C12968b.f28553b = r1
        L_0x014a:
            int[] r1 = p373ja.C12968b.f28553b
            if (r1 == 0) goto L_0x015a
            int r2 = r1.length
            r3 = r10
        L_0x0150:
            if (r3 >= r2) goto L_0x015a
            r4 = r1[r3]
            if (r0 != r4) goto L_0x0157
            goto L_0x015b
        L_0x0157:
            int r3 = r3 + 1
            goto L_0x0150
        L_0x015a:
            r7 = r10
        L_0x015b:
            java.lang.String r0 = "NetworkResponse"
            if (r7 == 0) goto L_0x0169
            ea.n r1 = p628nj.C18263b.f40052P
            java.lang.String r2 = r5.toString()
            r1.mo45450b(r0, r2)
            goto L_0x0172
        L_0x0169:
            ea.n r1 = p628nj.C18263b.f40052P
            java.lang.String r2 = r5.toString()
            r1.mo45450b(r0, r2)
        L_0x0172:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p373ja.C12967a.run():void");
    }
}
