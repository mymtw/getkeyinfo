package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: androidx.datastore.preferences.protobuf.f1 */
public final class C2578f1 extends C2570d1<C2575e1, C2575e1> {
    /* renamed from: a */
    public final void mo9622a(int i, int i2, Object obj) {
        ((C2575e1) obj).mo9642b((i << 3) | 5, Integer.valueOf(i2));
    }

    /* renamed from: b */
    public final void mo9623b(Object obj, int i, long j) {
        ((C2575e1) obj).mo9642b((i << 3) | 1, Long.valueOf(j));
    }

    /* renamed from: c */
    public final void mo9624c(int i, Object obj, Object obj2) {
        ((C2575e1) obj).mo9642b((i << 3) | 3, (C2575e1) obj2);
    }

    /* renamed from: d */
    public final void mo9625d(Object obj, int i, ByteString byteString) {
        ((C2575e1) obj).mo9642b((i << 3) | 2, byteString);
    }

    /* renamed from: e */
    public final void mo9626e(Object obj, int i, long j) {
        ((C2575e1) obj).mo9642b((i << 3) | 0, Long.valueOf(j));
    }

    /* renamed from: f */
    public final C2575e1 mo9627f(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        C2575e1 e1Var = generatedMessageLite.unknownFields;
        if (e1Var != C2575e1.f5860f) {
            return e1Var;
        }
        C2575e1 e1Var2 = new C2575e1();
        generatedMessageLite.unknownFields = e1Var2;
        return e1Var2;
    }

    /* renamed from: g */
    public final C2575e1 mo9628g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    /* renamed from: h */
    public final int mo9629h(Object obj) {
        return ((C2575e1) obj).mo9641a();
    }

    /* renamed from: i */
    public final int mo9630i(Object obj) {
        C2575e1 e1Var = (C2575e1) obj;
        int i = e1Var.f5864d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < e1Var.f5861a; i3++) {
            i2 += CodedOutputStream.m5498d(3, (ByteString) e1Var.f5863c[i3]) + CodedOutputStream.m5516v(2, e1Var.f5862b[i3] >>> 3) + (CodedOutputStream.m5515u(1) * 2);
        }
        e1Var.f5864d = i2;
        return i2;
    }

    /* renamed from: j */
    public final void mo9631j(Object obj) {
        ((GeneratedMessageLite) obj).unknownFields.f5865e = false;
    }

    /* renamed from: k */
    public final C2575e1 mo9632k(Object obj, Object obj2) {
        C2575e1 e1Var = (C2575e1) obj;
        C2575e1 e1Var2 = (C2575e1) obj2;
        if (e1Var2.equals(C2575e1.f5860f)) {
            return e1Var;
        }
        int i = e1Var.f5861a + e1Var2.f5861a;
        int[] copyOf = Arrays.copyOf(e1Var.f5862b, i);
        System.arraycopy(e1Var2.f5862b, 0, copyOf, e1Var.f5861a, e1Var2.f5861a);
        Object[] copyOf2 = Arrays.copyOf(e1Var.f5863c, i);
        System.arraycopy(e1Var2.f5863c, 0, copyOf2, e1Var.f5861a, e1Var2.f5861a);
        return new C2575e1(i, copyOf, copyOf2, true);
    }

    /* renamed from: m */
    public final C2575e1 mo9634m() {
        return new C2575e1();
    }

    /* renamed from: n */
    public final void mo9635n(Object obj, Object obj2) {
        ((GeneratedMessageLite) obj).unknownFields = (C2575e1) obj2;
    }

    /* renamed from: o */
    public final void mo9636o(Object obj, Object obj2) {
        ((GeneratedMessageLite) obj).unknownFields = (C2575e1) obj2;
    }

    /* renamed from: p */
    public final void mo9637p() {
    }

    /* renamed from: q */
    public final C2575e1 mo9638q(Object obj) {
        C2575e1 e1Var = (C2575e1) obj;
        e1Var.f5865e = false;
        return e1Var;
    }

    /* renamed from: r */
    public final void mo9639r(Object obj, C2601k kVar) throws IOException {
        C2575e1 e1Var = (C2575e1) obj;
        e1Var.getClass();
        kVar.getClass();
        if (Writer$FieldOrder.ASCENDING == Writer$FieldOrder.DESCENDING) {
            int i = e1Var.f5861a;
            while (true) {
                i--;
                if (i >= 0) {
                    kVar.mo9809l(e1Var.f5862b[i] >>> 3, e1Var.f5863c[i]);
                } else {
                    return;
                }
            }
        } else {
            for (int i2 = 0; i2 < e1Var.f5861a; i2++) {
                kVar.mo9809l(e1Var.f5862b[i2] >>> 3, e1Var.f5863c[i2]);
            }
        }
    }

    /* renamed from: s */
    public final void mo9640s(Object obj, C2601k kVar) throws IOException {
        ((C2575e1) obj).mo9643c(kVar);
    }
}
