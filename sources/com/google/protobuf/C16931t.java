package com.google.protobuf;

/* renamed from: com.google.protobuf.t */
public final class C16931t implements C16904i0 {

    /* renamed from: a */
    public static final C16931t f37291a = new C16931t();

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.protobuf.C16899h0 mo59869a(java.lang.Class<?> r4) {
        /*
            r3 = this;
            java.lang.Class<com.google.protobuf.GeneratedMessageLite> r0 = com.google.protobuf.GeneratedMessageLite.class
            boolean r1 = r0.isAssignableFrom(r4)
            if (r1 == 0) goto L_0x002a
            java.lang.Class r0 = r4.asSubclass(r0)     // Catch:{ Exception -> 0x0019 }
            com.google.protobuf.GeneratedMessageLite r0 = com.google.protobuf.GeneratedMessageLite.m27958u(r0)     // Catch:{ Exception -> 0x0019 }
            com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ Exception -> 0x0019 }
            java.lang.Object r0 = r0.mo59389t(r1)     // Catch:{ Exception -> 0x0019 }
            com.google.protobuf.h0 r0 = (com.google.protobuf.C16899h0) r0     // Catch:{ Exception -> 0x0019 }
            return r0
        L_0x0019:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unable to get message info for "
            java.lang.StringBuilder r2 = android.support.p013v4.media.C0072d.m201h(r2)
            java.lang.String r4 = androidx.appcompat.widget.C0326j.m862g(r4, r2)
            r1.<init>(r4, r0)
            throw r1
        L_0x002a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported message type: "
            java.lang.StringBuilder r1 = android.support.p013v4.media.C0072d.m201h(r1)
            java.lang.String r4 = androidx.appcompat.widget.C0326j.m862g(r4, r1)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C16931t.mo59869a(java.lang.Class):com.google.protobuf.h0");
    }

    /* renamed from: b */
    public final boolean mo59870b(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }
}
