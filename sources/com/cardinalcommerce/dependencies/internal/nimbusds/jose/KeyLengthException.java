package com.cardinalcommerce.dependencies.internal.nimbusds.jose;

public class KeyLengthException extends C6254l {

    /* renamed from: a */
    private final int f13626a;

    /* renamed from: b */
    private final C6236a f13627b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public KeyLengthException(int r4, com.cardinalcommerce.dependencies.internal.nimbusds.jose.C6236a r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r4 <= 0) goto L_0x0010
            java.lang.String r1 = "The expected key length is "
            java.lang.String r2 = " bits"
            java.lang.String r1 = android.support.p013v4.media.C0069a.m175f(r1, r4, r2)
            goto L_0x0012
        L_0x0010:
            java.lang.String r1 = "Unexpected key length"
        L_0x0012:
            r0.append(r1)
            if (r5 == 0) goto L_0x002e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " (for "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = " algorithm)"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L_0x0030
        L_0x002e:
            java.lang.String r1 = ""
        L_0x0030:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            r3.f13626a = r4
            r3.f13627b = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.dependencies.internal.nimbusds.jose.KeyLengthException.<init>(int, com.cardinalcommerce.dependencies.internal.nimbusds.jose.a):void");
    }

    public KeyLengthException(String str) {
        super(str);
        this.f13626a = 0;
        this.f13627b = null;
    }
}
