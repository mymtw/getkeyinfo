package p244t5;

import java.util.Enumeration;

/* renamed from: t5.b1 */
public final class C7965b1 extends C8021t1 {

    /* renamed from: c */
    public byte[] f17444c;

    public C7965b1(byte[] bArr) {
        this.f17444c = bArr;
    }

    /* renamed from: e */
    public final void mo20506e(C8014r1 r1Var) {
        byte[] bArr = this.f17444c;
        if (bArr != null) {
            r1Var.mo20569f(48, bArr);
        } else {
            super.mo20522p().mo20506e(r1Var);
        }
    }

    /* renamed from: n */
    public final int mo20509n() {
        byte[] bArr = this.f17444c;
        return bArr != null ? C7974e1.m15996a(bArr.length) + 1 + this.f17444c.length : super.mo20522p().mo20509n();
    }

    /* renamed from: o */
    public final C8018s1 mo20521o() {
        if (this.f17444c != null) {
            mo20526z();
        }
        return super.mo20521o();
    }

    /* renamed from: p */
    public final C8018s1 mo20522p() {
        if (this.f17444c != null) {
            mo20526z();
        }
        return super.mo20522p();
    }

    /* renamed from: q */
    public final synchronized C7984h1 mo20523q(int i) {
        if (this.f17444c != null) {
            mo20526z();
        }
        return super.mo20523q(i);
    }

    /* renamed from: w */
    public final synchronized Enumeration mo20524w() {
        byte[] bArr = this.f17444c;
        if (bArr == null) {
            return super.mo20524w();
        }
        return new C7962a1(bArr);
    }

    /* renamed from: y */
    public final synchronized int mo20525y() {
        if (this.f17444c != null) {
            mo20526z();
        }
        return super.mo20525y();
    }

    /* renamed from: z */
    public final void mo20526z() {
        C7962a1 a1Var = new C7962a1(this.f17444c);
        while (a1Var.hasMoreElements()) {
            this.f17505b.addElement(a1Var.nextElement());
        }
        this.f17444c = null;
    }
}
