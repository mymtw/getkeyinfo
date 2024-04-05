package p244t5;

import android.support.p013v4.media.C0072d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import p003a2.C0023f;
import p267v7.C8212a;
import p267v7.C8217e;
import p276w7.C8260c;
import p276w7.C8261d;

/* renamed from: t5.p1 */
public abstract class C8008p1 extends C8018s1 implements C8011q1 {

    /* renamed from: b */
    public byte[] f17499b;

    public C8008p1(byte[] bArr) {
        if (bArr != null) {
            this.f17499b = bArr;
            return;
        }
        throw new NullPointerException("string cannot be null");
    }

    /* renamed from: q */
    public static C8008p1 m16103q(Object obj) {
        if (obj == null || (obj instanceof C8008p1)) {
            return (C8008p1) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return m16103q(C8018s1.m16138m((byte[]) obj));
            } catch (IOException e) {
                StringBuilder h = C0072d.m201h("failed to construct OCTET STRING from byte[]: ");
                h.append(e.getMessage());
                throw new IllegalArgumentException(h.toString());
            }
        } else {
            if (obj instanceof C7984h1) {
                C8018s1 i = ((C7984h1) obj).mo12996i();
                if (i instanceof C8008p1) {
                    return (C8008p1) i;
                }
            }
            throw new IllegalArgumentException(C0023f.m108i(obj, C0072d.m201h("illegal object in getInstance: ")));
        }
    }

    /* renamed from: s */
    public static C8008p1 m16104s(C7966c cVar, boolean z) {
        C8018s1 s = cVar.mo20528s();
        if (z || (s instanceof C8008p1)) {
            return m16103q(s);
        }
        C8021t1 s2 = C8021t1.m16151s(s);
        C8008p1[] p1VarArr = new C8008p1[s2.mo20525y()];
        Enumeration w = s2.mo20524w();
        int i = 0;
        while (w.hasMoreElements()) {
            p1VarArr[i] = (C8008p1) w.nextElement();
            i++;
        }
        return new C7981h(p1VarArr);
    }

    /* renamed from: b */
    public final InputStream mo20530b() {
        return new ByteArrayInputStream(this.f17499b);
    }

    /* renamed from: e */
    public final C8018s1 mo20527e() {
        return this;
    }

    /* renamed from: g */
    public final boolean mo20507g(C8018s1 s1Var) {
        if (!(s1Var instanceof C8008p1)) {
            return false;
        }
        return C8212a.m16500g(this.f17499b, ((C8008p1) s1Var).f17499b);
    }

    public final int hashCode() {
        return C8212a.m16495b(mo20541v());
    }

    /* renamed from: o */
    public final C8018s1 mo20521o() {
        return new C7964b0(this.f17499b);
    }

    /* renamed from: p */
    public final C8018s1 mo20522p() {
        return new C7964b0(this.f17499b);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("#");
        byte[] bArr = this.f17499b;
        C8261d dVar = C8260c.f18096a;
        h.append(C8217e.m16511c(C8260c.m16546b(0, bArr.length, bArr)));
        return h.toString();
    }

    /* renamed from: v */
    public byte[] mo20541v() {
        return this.f17499b;
    }
}
