package com.google.common.hash;

import com.google.common.base.C15794l;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@CanIgnoreReturnValue
/* renamed from: com.google.common.hash.a */
public abstract class C16267a extends C16269c {

    /* renamed from: a */
    public final ByteBuffer f36375a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    /* renamed from: c */
    public final C16276j mo57889c(byte[] bArr) {
        bArr.getClass();
        mo57802m(0, bArr.length, bArr);
        return this;
    }

    /* renamed from: e */
    public final C16272f mo57873e(int i, int i2, byte[] bArr) {
        C15794l.m25619m(i, i + i2, bArr.length);
        mo57802m(i, i2, bArr);
        return this;
    }

    /* renamed from: g */
    public final C16272f mo57874g(ByteBuffer byteBuffer) {
        mo57853n(byteBuffer);
        return this;
    }

    /* renamed from: i */
    public final C16272f mo57890i(byte[] bArr) {
        bArr.getClass();
        mo57802m(0, bArr.length, bArr);
        return this;
    }

    /* renamed from: j */
    public final C16272f mo57876j(char c) {
        this.f36375a.putChar(c);
        mo57891l(2);
        return this;
    }

    /* renamed from: k */
    public abstract void mo57801k(byte b);

    /* renamed from: l */
    public final void mo57891l(int i) {
        try {
            mo57802m(0, i, this.f36375a.array());
        } finally {
            this.f36375a.clear();
        }
    }

    /* renamed from: m */
    public abstract void mo57802m(int i, int i2, byte[] bArr);

    /* renamed from: n */
    public void mo57853n(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            mo57802m(byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), byteBuffer.array());
            byteBuffer.position(byteBuffer.limit());
            return;
        }
        for (int remaining = byteBuffer.remaining(); remaining > 0; remaining--) {
            mo57801k(byteBuffer.get());
        }
    }

    /* renamed from: a */
    public final C16272f mo57870a(int i) {
        this.f36375a.putInt(i);
        mo57891l(4);
        return this;
    }

    /* renamed from: b */
    public final C16272f mo57871b(long j) {
        this.f36375a.putLong(j);
        mo57891l(8);
        return this;
    }
}
