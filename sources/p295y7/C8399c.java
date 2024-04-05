package p295y7;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import p267v7.C8217e;

/* renamed from: y7.c */
public final class C8399c extends BufferedWriter {

    /* renamed from: b */
    public char[] f18414b = new char[64];

    public C8399c(OutputStreamWriter outputStreamWriter) {
        super(outputStreamWriter);
        String str = C8217e.f18044a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00f9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20977a(p295y7.C8397a r12) {
        /*
            r11 = this;
            java.lang.String r0 = "-----BEGIN CERTIFICATE-----"
            r11.write(r0)
            r11.newLine()
            java.util.List r0 = r12.f18412a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0038
            java.util.List r0 = r12.f18412a
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0035
            java.lang.Object r1 = r0.next()
            y7.b r1 = (p295y7.C8398b) r1
            r1.getClass()
            r1 = 0
            r11.write(r1)
            java.lang.String r2 = ": "
            r11.write(r2)
            r11.write(r1)
            r11.newLine()
            goto L_0x0016
        L_0x0035:
            r11.newLine()
        L_0x0038:
            byte[] r12 = r12.f18413b
            w7.b r0 = p276w7.C8258a.f18093a
            int r0 = r12.length
            int r1 = r0 + 2
            int r1 = r1 / 3
            int r1 = r1 * 4
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>(r1)
            w7.b r1 = p276w7.C8258a.f18093a     // Catch:{ Exception -> 0x0121 }
            r1.getClass()     // Catch:{ Exception -> 0x0121 }
            int r3 = r0 % 3
            int r0 = r0 - r3
            r4 = 0
            r5 = r4
        L_0x0052:
            int r6 = r4 + r0
            if (r5 >= r6) goto L_0x0099
            byte r6 = r12[r5]     // Catch:{ Exception -> 0x0121 }
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r7 = r5 + 1
            byte r7 = r12[r7]     // Catch:{ Exception -> 0x0121 }
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r8 = r5 + 2
            byte r8 = r12[r8]     // Catch:{ Exception -> 0x0121 }
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte[] r9 = r1.f18094a     // Catch:{ Exception -> 0x0121 }
            int r10 = r6 >>> 2
            r10 = r10 & 63
            byte r9 = r9[r10]     // Catch:{ Exception -> 0x0121 }
            r2.write(r9)     // Catch:{ Exception -> 0x0121 }
            byte[] r9 = r1.f18094a     // Catch:{ Exception -> 0x0121 }
            int r6 = r6 << 4
            int r10 = r7 >>> 4
            r6 = r6 | r10
            r6 = r6 & 63
            byte r6 = r9[r6]     // Catch:{ Exception -> 0x0121 }
            r2.write(r6)     // Catch:{ Exception -> 0x0121 }
            byte[] r6 = r1.f18094a     // Catch:{ Exception -> 0x0121 }
            int r7 = r7 << 2
            int r9 = r8 >>> 6
            r7 = r7 | r9
            r7 = r7 & 63
            byte r6 = r6[r7]     // Catch:{ Exception -> 0x0121 }
            r2.write(r6)     // Catch:{ Exception -> 0x0121 }
            byte[] r6 = r1.f18094a     // Catch:{ Exception -> 0x0121 }
            r7 = r8 & 63
            byte r6 = r6[r7]     // Catch:{ Exception -> 0x0121 }
            r2.write(r6)     // Catch:{ Exception -> 0x0121 }
            int r5 = r5 + 3
            goto L_0x0052
        L_0x0099:
            r5 = 61
            r7 = 1
            if (r3 == r7) goto L_0x00cf
            r8 = 2
            if (r3 == r8) goto L_0x00a2
            goto L_0x00ef
        L_0x00a2:
            byte r3 = r12[r6]     // Catch:{ Exception -> 0x0121 }
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r6 = r6 + r7
            byte r12 = r12[r6]     // Catch:{ Exception -> 0x0121 }
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r6 = r3 >>> 2
            r6 = r6 & 63
            int r3 = r3 << 4
            int r7 = r12 >>> 4
            r3 = r3 | r7
            r3 = r3 & 63
            int r12 = r12 << r8
            r12 = r12 & 63
            byte[] r7 = r1.f18094a     // Catch:{ Exception -> 0x0121 }
            byte r6 = r7[r6]     // Catch:{ Exception -> 0x0121 }
            r2.write(r6)     // Catch:{ Exception -> 0x0121 }
            byte[] r6 = r1.f18094a     // Catch:{ Exception -> 0x0121 }
            byte r3 = r6[r3]     // Catch:{ Exception -> 0x0121 }
            r2.write(r3)     // Catch:{ Exception -> 0x0121 }
            byte[] r1 = r1.f18094a     // Catch:{ Exception -> 0x0121 }
            byte r12 = r1[r12]     // Catch:{ Exception -> 0x0121 }
            r2.write(r12)     // Catch:{ Exception -> 0x0121 }
            goto L_0x00ec
        L_0x00cf:
            byte r12 = r12[r6]     // Catch:{ Exception -> 0x0121 }
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r3 = r12 >>> 2
            r3 = r3 & 63
            int r12 = r12 << 4
            r12 = r12 & 63
            byte[] r6 = r1.f18094a     // Catch:{ Exception -> 0x0121 }
            byte r3 = r6[r3]     // Catch:{ Exception -> 0x0121 }
            r2.write(r3)     // Catch:{ Exception -> 0x0121 }
            byte[] r1 = r1.f18094a     // Catch:{ Exception -> 0x0121 }
            byte r12 = r1[r12]     // Catch:{ Exception -> 0x0121 }
            r2.write(r12)     // Catch:{ Exception -> 0x0121 }
            r2.write(r5)     // Catch:{ Exception -> 0x0121 }
        L_0x00ec:
            r2.write(r5)     // Catch:{ Exception -> 0x0121 }
        L_0x00ef:
            int r0 = r0 / 3
            byte[] r12 = r2.toByteArray()
            r0 = r4
        L_0x00f6:
            int r1 = r12.length
            if (r0 >= r1) goto L_0x0118
            r1 = r4
        L_0x00fa:
            char[] r2 = r11.f18414b
            int r3 = r2.length
            if (r1 == r3) goto L_0x010d
            int r3 = r0 + r1
            int r5 = r12.length
            if (r3 < r5) goto L_0x0105
            goto L_0x010d
        L_0x0105:
            byte r3 = r12[r3]
            char r3 = (char) r3
            r2[r1] = r3
            int r1 = r1 + 1
            goto L_0x00fa
        L_0x010d:
            r11.write(r2, r4, r1)
            r11.newLine()
            char[] r1 = r11.f18414b
            int r1 = r1.length
            int r0 = r0 + r1
            goto L_0x00f6
        L_0x0118:
            java.lang.String r12 = "-----END CERTIFICATE-----"
            r11.write(r12)
            r11.newLine()
            return
        L_0x0121:
            r12 = move-exception
            com.cardinalcommerce.dependencies.internal.bouncycastle.util.a.e r0 = new com.cardinalcommerce.dependencies.internal.bouncycastle.util.a.e
            java.lang.String r1 = "exception encoding base64 string: "
            java.lang.StringBuilder r1 = android.support.p013v4.media.C0072d.m201h(r1)
            java.lang.String r2 = r12.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p295y7.C8399c.mo20977a(y7.a):void");
    }
}
