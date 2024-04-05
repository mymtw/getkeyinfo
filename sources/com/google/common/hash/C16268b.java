package com.google.common.hash;

import com.google.common.base.C15794l;
import com.google.errorprone.annotations.Immutable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

@Immutable
/* renamed from: com.google.common.hash.b */
public abstract class C16268b implements C16271e {
    public HashCode hashBytes(byte[] bArr) {
        return hashBytes(bArr, 0, bArr.length);
    }

    public HashCode hashInt(int i) {
        return newHasher(4).mo57870a(i).mo57800f();
    }

    public HashCode hashLong(long j) {
        return newHasher(8).mo57871b(j).mo57800f();
    }

    public <T> HashCode hashObject(T t, Funnel<? super T> funnel) {
        C16269c cVar = (C16269c) newHasher();
        cVar.getClass();
        funnel.funnel(t, cVar);
        return cVar.mo57800f();
    }

    public HashCode hashString(CharSequence charSequence, Charset charset) {
        return newHasher().mo57875h(charSequence, charset).mo57800f();
    }

    public HashCode hashUnencodedChars(CharSequence charSequence) {
        C16269c cVar = (C16269c) newHasher(charSequence.length() * 2);
        cVar.getClass();
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            cVar.mo57876j(charSequence.charAt(i));
        }
        return cVar.mo57800f();
    }

    public C16272f newHasher(int i) {
        C15794l.m25609c(i, "expectedInputSize must be >= 0 but was %s", i >= 0);
        return newHasher();
    }

    public HashCode hashBytes(byte[] bArr, int i, int i2) {
        C15794l.m25619m(i, i + i2, bArr.length);
        return newHasher(i2).mo57873e(i, i2, bArr).mo57800f();
    }

    public HashCode hashBytes(ByteBuffer byteBuffer) {
        return newHasher(byteBuffer.remaining()).mo57874g(byteBuffer).mo57800f();
    }
}
