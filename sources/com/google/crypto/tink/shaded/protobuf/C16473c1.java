package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* renamed from: com.google.crypto.tink.shaded.protobuf.c1 */
public abstract class C16473c1<T, B> {
    /* renamed from: a */
    public abstract void mo58679a(int i, int i2, Object obj);

    /* renamed from: b */
    public abstract void mo58680b(B b, int i, long j);

    /* renamed from: c */
    public abstract void mo58681c(int i, Object obj, Object obj2);

    /* renamed from: d */
    public abstract void mo58682d(B b, int i, ByteString byteString);

    /* renamed from: e */
    public abstract void mo58683e(B b, int i, long j);

    /* renamed from: f */
    public abstract C16476d1 mo58684f(Object obj);

    /* renamed from: g */
    public abstract C16476d1 mo58685g(Object obj);

    /* renamed from: h */
    public abstract int mo58686h(T t);

    /* renamed from: i */
    public abstract int mo58687i(T t);

    /* renamed from: j */
    public abstract void mo58688j(Object obj);

    /* renamed from: k */
    public abstract C16476d1 mo58689k(Object obj, Object obj2);

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f A[LOOP:0: B:16:0x002f->B:19:0x003c, LOOP_START] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo58690l(B r7, com.google.crypto.tink.shaded.protobuf.C16540w0 r8) throws java.io.IOException {
        /*
            r6 = this;
            int r0 = r8.getTag()
            int r1 = r0 >>> 3
            r0 = r0 & 7
            r2 = 1
            if (r0 == 0) goto L_0x0061
            if (r0 == r2) goto L_0x0059
            r3 = 2
            if (r0 == r3) goto L_0x0051
            r3 = 4
            r4 = 3
            if (r0 == r4) goto L_0x0028
            if (r0 == r3) goto L_0x0026
            r3 = 5
            if (r0 != r3) goto L_0x0021
            int r8 = r8.mo58851t()
            r6.mo58679a(r1, r8, r7)
            return r2
        L_0x0021:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r7 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r7
        L_0x0026:
            r7 = 0
            return r7
        L_0x0028:
            com.google.crypto.tink.shaded.protobuf.d1 r0 = r6.mo58691m()
            int r4 = r1 << 3
            r3 = r3 | r4
        L_0x002f:
            int r4 = r8.mo58857z()
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x003e
            boolean r4 = r6.mo58690l(r0, r8)
            if (r4 != 0) goto L_0x002f
        L_0x003e:
            int r8 = r8.getTag()
            if (r3 != r8) goto L_0x004c
            com.google.crypto.tink.shaded.protobuf.d1 r8 = r6.mo58695q(r0)
            r6.mo58681c(r1, r7, r8)
            return r2
        L_0x004c:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r7 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidEndTag()
            throw r7
        L_0x0051:
            com.google.crypto.tink.shaded.protobuf.ByteString r8 = r8.mo58843n()
            r6.mo58682d(r7, r1, r8)
            return r2
        L_0x0059:
            long r3 = r8.mo58829a()
            r6.mo58680b(r7, r1, r3)
            return r2
        L_0x0061:
            long r3 = r8.mo58815G()
            r6.mo58683e(r7, r1, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C16473c1.mo58690l(java.lang.Object, com.google.crypto.tink.shaded.protobuf.w0):boolean");
    }

    /* renamed from: m */
    public abstract C16476d1 mo58691m();

    /* renamed from: n */
    public abstract void mo58692n(Object obj, B b);

    /* renamed from: o */
    public abstract void mo58693o(Object obj, T t);

    /* renamed from: p */
    public abstract void mo58694p();

    /* renamed from: q */
    public abstract C16476d1 mo58695q(Object obj);

    /* renamed from: r */
    public abstract void mo58696r(Object obj, C16505k kVar) throws IOException;

    /* renamed from: s */
    public abstract void mo58697s(Object obj, C16505k kVar) throws IOException;
}
