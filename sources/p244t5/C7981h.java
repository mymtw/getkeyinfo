package p244t5;

import java.util.Enumeration;
import java.util.Vector;

/* renamed from: t5.h */
public final class C7981h extends C8008p1 {

    /* renamed from: c */
    public final int f17466c;

    /* renamed from: d */
    public final C8008p1[] f17467d;

    /* renamed from: t5.h$a */
    public class C7982a implements Enumeration {

        /* renamed from: a */
        public int f17468a = 0;

        public C7982a() {
        }

        public final boolean hasMoreElements() {
            return this.f17468a < C7981h.this.f17467d.length;
        }

        public final Object nextElement() {
            C8008p1[] p1VarArr = C7981h.this.f17467d;
            int i = this.f17468a;
            this.f17468a = i + 1;
            return p1VarArr[i];
        }
    }

    public C7981h(byte[] bArr) {
        this(bArr, (C8008p1[]) null);
    }

    public C7981h(byte[] bArr, C8008p1[] p1VarArr) {
        super(bArr);
        this.f17467d = p1VarArr;
        this.f17466c = 1000;
    }

    /* renamed from: e */
    public final void mo20506e(C8014r1 r1Var) {
        r1Var.mo20570h(36);
        r1Var.mo20570h(128);
        Enumeration w = mo20542w();
        while (w.hasMoreElements()) {
            r1Var.mo20535d((C7984h1) w.nextElement());
        }
        r1Var.mo20570h(0);
        r1Var.mo20570h(0);
    }

    /* renamed from: l */
    public final boolean mo20508l() {
        return true;
    }

    /* renamed from: n */
    public final int mo20509n() {
        Enumeration w = mo20542w();
        int i = 0;
        while (w.hasMoreElements()) {
            i += ((C7984h1) w.nextElement()).mo12996i().mo20509n();
        }
        return i + 2 + 2;
    }

    /* renamed from: v */
    public final byte[] mo20541v() {
        return this.f17499b;
    }

    /* renamed from: w */
    public final Enumeration mo20542w() {
        if (this.f17467d != null) {
            return new C7982a();
        }
        Vector vector = new Vector();
        int i = 0;
        while (true) {
            byte[] bArr = this.f17499b;
            if (i >= bArr.length) {
                return vector.elements();
            }
            int i2 = this.f17466c + i;
            if (i2 > bArr.length) {
                i2 = bArr.length;
            }
            int i3 = i2 - i;
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, i, bArr2, 0, i3);
            vector.addElement(new C7964b0(bArr2));
            i += this.f17466c;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7981h(p244t5.C8008p1[] r4) {
        /*
            r3 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
        L_0x0006:
            int r2 = r4.length
            if (r1 == r2) goto L_0x004e
            r2 = r4[r1]     // Catch:{ ClassCastException -> 0x002d, IOException -> 0x0015 }
            t5.b0 r2 = (p244t5.C7964b0) r2     // Catch:{ ClassCastException -> 0x002d, IOException -> 0x0015 }
            byte[] r2 = r2.f17499b     // Catch:{ ClassCastException -> 0x002d, IOException -> 0x0015 }
            r0.write(r2)     // Catch:{ ClassCastException -> 0x002d, IOException -> 0x0015 }
            int r1 = r1 + 1
            goto L_0x0006
        L_0x0015:
            r4 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "exception converting octets "
            java.lang.StringBuilder r1 = android.support.p013v4.media.C0072d.m201h(r1)
            java.lang.String r4 = r4.toString()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L_0x002d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r4 = r4[r1]
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            r2.append(r4)
            java.lang.String r4 = " found in input should only contain DEROctetString"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r0.<init>(r4)
            throw r0
        L_0x004e:
            byte[] r0 = r0.toByteArray()
            r3.<init>(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p244t5.C7981h.<init>(t5.p1[]):void");
    }
}
