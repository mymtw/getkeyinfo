package com.google.android.play.core.internal;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* renamed from: com.google.android.play.core.internal.d0 */
public final class C15688d0 implements C15708t {

    /* renamed from: a */
    public final FileChannel f35447a;

    /* renamed from: b */
    public final long f35448b;

    /* renamed from: c */
    public final long f35449c;

    public C15688d0(FileChannel fileChannel, long j, long j2) {
        this.f35447a = fileChannel;
        this.f35448b = j;
        this.f35449c = j2;
    }

    /* renamed from: a */
    public final void mo55518a(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        MappedByteBuffer map = this.f35447a.map(FileChannel.MapMode.READ_ONLY, this.f35448b + j, (long) i);
        map.load();
        for (MessageDigest update : messageDigestArr) {
            map.position(0);
            update.update(map);
        }
    }

    public final long zza() {
        return this.f35449c;
    }
}
