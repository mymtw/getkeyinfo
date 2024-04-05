package p244t5;

import java.io.IOException;

/* renamed from: t5.s1 */
public abstract class C8018s1 extends C8005o1 {
    /* renamed from: m */
    public static C8018s1 m16138m(byte[] bArr) {
        C7996l1 l1Var = new C7996l1(bArr);
        try {
            C8018s1 h = l1Var.mo20554h();
            if (l1Var.available() == 0) {
                return h;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    /* renamed from: e */
    public abstract void mo20506e(C8014r1 r1Var);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7984h1) && mo20507g(((C7984h1) obj).mo12996i());
    }

    /* renamed from: g */
    public abstract boolean mo20507g(C8018s1 s1Var);

    public abstract int hashCode();

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public abstract boolean mo20508l();

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public abstract int mo20509n();

    /* renamed from: o */
    public C8018s1 mo20521o() {
        return this;
    }

    /* renamed from: p */
    public C8018s1 mo20522p() {
        return this;
    }
}
