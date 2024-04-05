package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* renamed from: androidx.datastore.preferences.protobuf.d1 */
public abstract class C2570d1<T, B> {
    /* renamed from: a */
    public abstract void mo9622a(int i, int i2, Object obj);

    /* renamed from: b */
    public abstract void mo9623b(B b, int i, long j);

    /* renamed from: c */
    public abstract void mo9624c(int i, Object obj, Object obj2);

    /* renamed from: d */
    public abstract void mo9625d(B b, int i, ByteString byteString);

    /* renamed from: e */
    public abstract void mo9626e(B b, int i, long j);

    /* renamed from: f */
    public abstract C2575e1 mo9627f(Object obj);

    /* renamed from: g */
    public abstract C2575e1 mo9628g(Object obj);

    /* renamed from: h */
    public abstract int mo9629h(T t);

    /* renamed from: i */
    public abstract int mo9630i(T t);

    /* renamed from: j */
    public abstract void mo9631j(Object obj);

    /* renamed from: k */
    public abstract C2575e1 mo9632k(Object obj, Object obj2);

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f A[LOOP:0: B:16:0x002f->B:19:0x003c, LOOP_START] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo9633l(B r7, androidx.datastore.preferences.protobuf.C2640x0 r8) throws java.io.IOException {
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
            int r8 = r8.mo9791t()
            r6.mo9622a(r1, r8, r7)
            return r2
        L_0x0021:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r7 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r7
        L_0x0026:
            r7 = 0
            return r7
        L_0x0028:
            androidx.datastore.preferences.protobuf.e1 r0 = r6.mo9634m()
            int r4 = r1 << 3
            r3 = r3 | r4
        L_0x002f:
            int r4 = r8.mo9797z()
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x003e
            boolean r4 = r6.mo9633l(r0, r8)
            if (r4 != 0) goto L_0x002f
        L_0x003e:
            int r8 = r8.getTag()
            if (r3 != r8) goto L_0x004c
            androidx.datastore.preferences.protobuf.e1 r8 = r6.mo9638q(r0)
            r6.mo9624c(r1, r7, r8)
            return r2
        L_0x004c:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r7 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidEndTag()
            throw r7
        L_0x0051:
            androidx.datastore.preferences.protobuf.ByteString r8 = r8.mo9783n()
            r6.mo9625d(r7, r1, r8)
            return r2
        L_0x0059:
            long r3 = r8.mo9769a()
            r6.mo9623b(r7, r1, r3)
            return r2
        L_0x0061:
            long r3 = r8.mo9754G()
            r6.mo9626e(r7, r1, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2570d1.mo9633l(java.lang.Object, androidx.datastore.preferences.protobuf.x0):boolean");
    }

    /* renamed from: m */
    public abstract C2575e1 mo9634m();

    /* renamed from: n */
    public abstract void mo9635n(Object obj, B b);

    /* renamed from: o */
    public abstract void mo9636o(Object obj, T t);

    /* renamed from: p */
    public abstract void mo9637p();

    /* renamed from: q */
    public abstract C2575e1 mo9638q(Object obj);

    /* renamed from: r */
    public abstract void mo9639r(Object obj, C2601k kVar) throws IOException;

    /* renamed from: s */
    public abstract void mo9640s(Object obj, C2601k kVar) throws IOException;
}
