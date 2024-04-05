package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.crypto.tink.shaded.protobuf.e1 */
public final class C16480e1 extends C16473c1<C16476d1, C16476d1> {
    /* renamed from: a */
    public final void mo58679a(int i, int i2, Object obj) {
        ((C16476d1) obj).mo58699b((i << 3) | 5, Integer.valueOf(i2));
    }

    /* renamed from: b */
    public final void mo58680b(Object obj, int i, long j) {
        ((C16476d1) obj).mo58699b((i << 3) | 1, Long.valueOf(j));
    }

    /* renamed from: c */
    public final void mo58681c(int i, Object obj, Object obj2) {
        ((C16476d1) obj).mo58699b((i << 3) | 3, (C16476d1) obj2);
    }

    /* renamed from: d */
    public final void mo58682d(Object obj, int i, ByteString byteString) {
        ((C16476d1) obj).mo58699b((i << 3) | 2, byteString);
    }

    /* renamed from: e */
    public final void mo58683e(Object obj, int i, long j) {
        ((C16476d1) obj).mo58699b((i << 3) | 0, Long.valueOf(j));
    }

    /* renamed from: f */
    public final C16476d1 mo58684f(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        C16476d1 d1Var = generatedMessageLite.unknownFields;
        if (d1Var != C16476d1.f36589f) {
            return d1Var;
        }
        C16476d1 d1Var2 = new C16476d1();
        generatedMessageLite.unknownFields = d1Var2;
        return d1Var2;
    }

    /* renamed from: g */
    public final C16476d1 mo58685g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    /* renamed from: h */
    public final int mo58686h(Object obj) {
        return ((C16476d1) obj).mo58698a();
    }

    /* renamed from: i */
    public final int mo58687i(Object obj) {
        C16476d1 d1Var = (C16476d1) obj;
        int i = d1Var.f36593d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < d1Var.f36590a; i3++) {
            i2 += CodedOutputStream.m26563d(3, (ByteString) d1Var.f36592c[i3]) + CodedOutputStream.m26581v(2, d1Var.f36591b[i3] >>> 3) + (CodedOutputStream.m26580u(1) * 2);
        }
        d1Var.f36593d = i2;
        return i2;
    }

    /* renamed from: j */
    public final void mo58688j(Object obj) {
        ((GeneratedMessageLite) obj).unknownFields.f36594e = false;
    }

    /* renamed from: k */
    public final C16476d1 mo58689k(Object obj, Object obj2) {
        C16476d1 d1Var = (C16476d1) obj;
        C16476d1 d1Var2 = (C16476d1) obj2;
        if (d1Var2.equals(C16476d1.f36589f)) {
            return d1Var;
        }
        int i = d1Var.f36590a + d1Var2.f36590a;
        int[] copyOf = Arrays.copyOf(d1Var.f36591b, i);
        System.arraycopy(d1Var2.f36591b, 0, copyOf, d1Var.f36590a, d1Var2.f36590a);
        Object[] copyOf2 = Arrays.copyOf(d1Var.f36592c, i);
        System.arraycopy(d1Var2.f36592c, 0, copyOf2, d1Var.f36590a, d1Var2.f36590a);
        return new C16476d1(i, copyOf, copyOf2, true);
    }

    /* renamed from: m */
    public final C16476d1 mo58691m() {
        return new C16476d1();
    }

    /* renamed from: n */
    public final void mo58692n(Object obj, Object obj2) {
        ((GeneratedMessageLite) obj).unknownFields = (C16476d1) obj2;
    }

    /* renamed from: o */
    public final void mo58693o(Object obj, Object obj2) {
        ((GeneratedMessageLite) obj).unknownFields = (C16476d1) obj2;
    }

    /* renamed from: p */
    public final void mo58694p() {
    }

    /* renamed from: q */
    public final C16476d1 mo58695q(Object obj) {
        C16476d1 d1Var = (C16476d1) obj;
        d1Var.f36594e = false;
        return d1Var;
    }

    /* renamed from: r */
    public final void mo58696r(Object obj, C16505k kVar) throws IOException {
        C16476d1 d1Var = (C16476d1) obj;
        d1Var.getClass();
        kVar.getClass();
        if (Writer$FieldOrder.ASCENDING == Writer$FieldOrder.DESCENDING) {
            int i = d1Var.f36590a;
            while (true) {
                i--;
                if (i >= 0) {
                    kVar.mo58869l(d1Var.f36591b[i] >>> 3, d1Var.f36592c[i]);
                } else {
                    return;
                }
            }
        } else {
            for (int i2 = 0; i2 < d1Var.f36590a; i2++) {
                kVar.mo58869l(d1Var.f36591b[i2] >>> 3, d1Var.f36592c[i2]);
            }
        }
    }

    /* renamed from: s */
    public final void mo58697s(Object obj, C16505k kVar) throws IOException {
        ((C16476d1) obj).mo58700c(kVar);
    }
}
