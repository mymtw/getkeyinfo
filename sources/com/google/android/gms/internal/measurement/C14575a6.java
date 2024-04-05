package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.measurement.a6 */
public final class C14575a6 {

    /* renamed from: a */
    public static final Charset f32740a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f32741b;

    static {
        Charset.forName("US-ASCII");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f32741b = bArr;
        ByteBuffer.wrap(bArr);
    }

    /* renamed from: a */
    public static int m23369a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: b */
    public static C14819t5 m23370b(Object obj, Object obj2) {
        C14782q5 d = ((C14796r6) obj).mo50827d();
        C14796r6 r6Var = (C14796r6) obj2;
        d.getClass();
        if (d.f33057b.getClass().isInstance(r6Var)) {
            d.mo50811l((C14819t5) ((C14818t4) r6Var));
            return d.mo50808i();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
