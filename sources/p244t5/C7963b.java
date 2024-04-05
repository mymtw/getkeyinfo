package p244t5;

import p267v7.C8212a;
import p267v7.C8217e;
import p276w7.C8260c;
import p276w7.C8261d;

/* renamed from: t5.b */
public abstract class C7963b extends C8018s1 {

    /* renamed from: b */
    public final boolean f17441b;

    /* renamed from: c */
    public final int f17442c;

    /* renamed from: d */
    public final byte[] f17443d;

    public C7963b(int i, boolean z, byte[] bArr) {
        this.f17441b = z;
        this.f17442c = i;
        this.f17443d = C8212a.m16504k(bArr);
    }

    /* renamed from: e */
    public void mo20506e(C8014r1 r1Var) {
        int i = this.f17441b ? 96 : 64;
        int i2 = this.f17442c;
        byte[] bArr = this.f17443d;
        r1Var.mo20567c(i, i2);
        r1Var.mo20566b(bArr.length);
        r1Var.f17501a.write(bArr);
    }

    /* renamed from: g */
    public final boolean mo20507g(C8018s1 s1Var) {
        if (!(s1Var instanceof C7963b)) {
            return false;
        }
        C7963b bVar = (C7963b) s1Var;
        return this.f17441b == bVar.f17441b && this.f17442c == bVar.f17442c && C8212a.m16500g(this.f17443d, bVar.f17443d);
    }

    public final int hashCode() {
        return (this.f17441b ^ this.f17442c) ^ C8212a.m16495b(this.f17443d) ? 1 : 0;
    }

    /* renamed from: l */
    public final boolean mo20508l() {
        return this.f17441b;
    }

    /* renamed from: n */
    public final int mo20509n() {
        return C7974e1.m15996a(this.f17443d.length) + C7974e1.m15998c(this.f17442c) + this.f17443d.length;
    }

    public final String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        if (this.f17441b) {
            stringBuffer.append("CONSTRUCTED ");
        }
        stringBuffer.append("APPLICATION ");
        stringBuffer.append(Integer.toString(this.f17442c));
        stringBuffer.append("]");
        if (this.f17443d != null) {
            stringBuffer.append(" #");
            byte[] bArr = this.f17443d;
            C8261d dVar = C8260c.f18096a;
            str = C8217e.m16511c(C8260c.m16546b(0, bArr.length, bArr));
        } else {
            str = " #null";
        }
        stringBuffer.append(str);
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }
}
