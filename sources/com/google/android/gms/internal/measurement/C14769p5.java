package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.p5 */
public final class C14769p5 implements C14783q6 {

    /* renamed from: a */
    public static final C14769p5 f33045a = new C14769p5();

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C14757o6 mo50592a(java.lang.Class<?> r5) {
        /*
            r4 = this;
            java.lang.Class<com.google.android.gms.internal.measurement.t5> r0 = com.google.android.gms.internal.measurement.C14819t5.class
            boolean r1 = r0.isAssignableFrom(r5)
            if (r1 != 0) goto L_0x0024
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.getName()
            java.lang.String r1 = "Unsupported message type: "
            int r2 = r5.length()
            if (r2 == 0) goto L_0x001b
            java.lang.String r5 = r1.concat(r5)
            goto L_0x0020
        L_0x001b:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1)
        L_0x0020:
            r0.<init>(r5)
            throw r0
        L_0x0024:
            java.lang.Class r0 = r5.asSubclass(r0)     // Catch:{ Exception -> 0x0034 }
            com.google.android.gms.internal.measurement.t5 r0 = com.google.android.gms.internal.measurement.C14819t5.m23960o(r0)     // Catch:{ Exception -> 0x0034 }
            r1 = 3
            java.lang.Object r0 = r0.mo50282q(r1)     // Catch:{ Exception -> 0x0034 }
            com.google.android.gms.internal.measurement.o6 r0 = (com.google.android.gms.internal.measurement.C14757o6) r0     // Catch:{ Exception -> 0x0034 }
            return r0
        L_0x0034:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r5 = r5.getName()
            java.lang.String r2 = "Unable to get message info for "
            int r3 = r5.length()
            if (r3 == 0) goto L_0x0048
            java.lang.String r5 = r2.concat(r5)
            goto L_0x004d
        L_0x0048:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
        L_0x004d:
            r1.<init>(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C14769p5.mo50592a(java.lang.Class):com.google.android.gms.internal.measurement.o6");
    }

    /* renamed from: b */
    public final boolean mo50593b(Class<?> cls) {
        return C14819t5.class.isAssignableFrom(cls);
    }
}
