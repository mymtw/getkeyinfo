package com.google.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.protobuf.d1 */
public final class C16880d1 extends C16871b1<C16876c1, C16876c1> {
    /* renamed from: a */
    public final void mo59849a(Object obj, int i, ByteString byteString) {
        ((C16876c1) obj).mo59872b((i << 3) | 2, byteString);
    }

    /* renamed from: b */
    public final void mo59850b(Object obj, int i, long j) {
        ((C16876c1) obj).mo59872b((i << 3) | 0, Long.valueOf(j));
    }

    /* renamed from: c */
    public final C16876c1 mo59851c(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    /* renamed from: d */
    public final int mo59852d(Object obj) {
        return ((C16876c1) obj).mo59871a();
    }

    /* renamed from: e */
    public final int mo59853e(Object obj) {
        C16876c1 c1Var = (C16876c1) obj;
        int i = c1Var.f37190d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < c1Var.f37187a; i3++) {
            i2 += CodedOutputStream.m27879d(3, (ByteString) c1Var.f37189c[i3]) + CodedOutputStream.m27897v(2, c1Var.f37188b[i3] >>> 3) + (CodedOutputStream.m27896u(1) * 2);
        }
        c1Var.f37190d = i2;
        return i2;
    }

    /* renamed from: f */
    public final void mo59854f(Object obj) {
        ((GeneratedMessageLite) obj).unknownFields.f37191e = false;
    }

    /* renamed from: g */
    public final C16876c1 mo59855g(Object obj, Object obj2) {
        C16876c1 c1Var = (C16876c1) obj;
        C16876c1 c1Var2 = (C16876c1) obj2;
        if (c1Var2.equals(C16876c1.f37186f)) {
            return c1Var;
        }
        int i = c1Var.f37187a + c1Var2.f37187a;
        int[] copyOf = Arrays.copyOf(c1Var.f37188b, i);
        System.arraycopy(c1Var2.f37188b, 0, copyOf, c1Var.f37187a, c1Var2.f37187a);
        Object[] copyOf2 = Arrays.copyOf(c1Var.f37189c, i);
        System.arraycopy(c1Var2.f37189c, 0, copyOf2, c1Var.f37187a, c1Var2.f37187a);
        return new C16876c1(i, copyOf, copyOf2, true);
    }

    /* renamed from: h */
    public final C16876c1 mo59856h() {
        return new C16876c1();
    }

    /* renamed from: i */
    public final void mo59857i(Object obj, Object obj2) {
        ((GeneratedMessageLite) obj).unknownFields = (C16876c1) obj2;
    }

    /* renamed from: j */
    public final void mo59858j(Object obj, Object obj2) {
        ((GeneratedMessageLite) obj).unknownFields = (C16876c1) obj2;
    }

    /* renamed from: k */
    public final void mo59859k(Object obj, C16905j jVar) throws IOException {
        C16876c1 c1Var = (C16876c1) obj;
        c1Var.getClass();
        jVar.getClass();
        if (Writer$FieldOrder.ASCENDING == Writer$FieldOrder.DESCENDING) {
            int i = c1Var.f37187a;
            while (true) {
                i--;
                if (i >= 0) {
                    jVar.mo59962l(c1Var.f37188b[i] >>> 3, c1Var.f37189c[i]);
                } else {
                    return;
                }
            }
        } else {
            for (int i2 = 0; i2 < c1Var.f37187a; i2++) {
                jVar.mo59962l(c1Var.f37188b[i2] >>> 3, c1Var.f37189c[i2]);
            }
        }
    }

    /* renamed from: l */
    public final void mo59860l(Object obj, C16905j jVar) throws IOException {
        ((C16876c1) obj).mo59873c(jVar);
    }
}
