package com.google.android.gms.internal.icing;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.icing.k0 */
public final class C14515k0 {

    /* renamed from: a */
    public static final Charset f32655a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f32656b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f32656b = bArr;
        ByteBuffer.wrap(bArr);
    }

    /* renamed from: a */
    public static int m23053a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: b */
    public static C14491e0 m23054b(Object obj, Object obj2) {
        C14479b0 zzy = ((C14480b1) obj).zzy();
        C14480b1 b1Var = (C14480b1) obj2;
        zzy.getClass();
        if (zzy.f32616b.getClass().isInstance(b1Var)) {
            C14491e0 e0Var = (C14491e0) ((C14506i) b1Var);
            if (zzy.f32618d) {
                zzy.mo49739d();
                zzy.f32618d = false;
            }
            C14479b0.m22934a(zzy.f32617c, e0Var);
            return zzy.mo49740f();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
