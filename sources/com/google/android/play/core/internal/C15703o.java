package com.google.android.play.core.internal;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.google.android.play.core.internal.o */
public final class C15703o implements C15708t {

    /* renamed from: a */
    public final ByteBuffer f35487a;

    public C15703o(ByteBuffer byteBuffer) {
        this.f35487a = byteBuffer.slice();
    }

    /* renamed from: a */
    public final void mo55518a(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        ByteBuffer slice;
        synchronized (this.f35487a) {
            int i2 = (int) j;
            this.f35487a.position(i2);
            this.f35487a.limit(i2 + i);
            slice = this.f35487a.slice();
        }
        for (MessageDigest update : messageDigestArr) {
            slice.position(0);
            update.update(slice);
        }
    }

    public final long zza() {
        return (long) this.f35487a.capacity();
    }
}
