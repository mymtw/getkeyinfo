package p244t5;

/* renamed from: t5.e */
public final class C7972e extends C7963b {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7972e(int r5, com.google.android.play.core.appupdate.C15567i r6) {
        /*
            r4 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
        L_0x0006:
            int r2 = r6.mo55344c()
            if (r1 == r2) goto L_0x0036
            t5.h1 r2 = r6.mo55342a(r1)     // Catch:{ IOException -> 0x001e }
            t5.o1 r2 = (p244t5.C8005o1) r2     // Catch:{ IOException -> 0x001e }
            java.lang.String r3 = "BER"
            byte[] r2 = r2.mo20561a(r3)     // Catch:{ IOException -> 0x001e }
            r0.write(r2)     // Catch:{ IOException -> 0x001e }
            int r1 = r1 + 1
            goto L_0x0006
        L_0x001e:
            r5 = move-exception
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.s r6 = new com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.s
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "malformed object: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0, r5)
            throw r6
        L_0x0036:
            byte[] r6 = r0.toByteArray()
            r0 = 1
            r4.<init>(r5, r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p244t5.C7972e.<init>(int, com.google.android.play.core.appupdate.i):void");
    }

    /* renamed from: e */
    public final void mo20506e(C8014r1 r1Var) {
        r1Var.mo20567c(this.f17441b ? 96 : 64, this.f17442c);
        r1Var.mo20570h(128);
        r1Var.f17501a.write(this.f17443d);
        r1Var.mo20570h(0);
        r1Var.mo20570h(0);
    }
}
