package com.google.common.hash;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.charset.Charset;

@CanIgnoreReturnValue
/* renamed from: com.google.common.hash.c */
public abstract class C16269c implements C16272f {
    /* renamed from: e */
    public abstract C16272f mo57873e(int i, int i2, byte[] bArr);

    /* renamed from: h */
    public C16272f mo57872d(CharSequence charSequence, Charset charset) {
        return mo57889c(charSequence.toString().getBytes(charset));
    }

    /* renamed from: i */
    public C16272f mo57889c(byte[] bArr) {
        return mo57873e(0, bArr.length, bArr);
    }

    /* renamed from: j */
    public abstract C16272f mo57876j(char c);
}
