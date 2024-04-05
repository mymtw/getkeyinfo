package com.bumptech.glide.load.resource.bitmap;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.resource.bitmap.b0 */
public final class C6078b0 extends MediaDataSource {

    /* renamed from: b */
    public final /* synthetic */ ByteBuffer f13074b;

    public C6078b0(ByteBuffer byteBuffer) {
        this.f13074b = byteBuffer;
    }

    public final void close() {
    }

    public final long getSize() {
        return (long) this.f13074b.limit();
    }

    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (j >= ((long) this.f13074b.limit())) {
            return -1;
        }
        this.f13074b.position((int) j);
        int min = Math.min(i2, this.f13074b.remaining());
        this.f13074b.get(bArr, i, min);
        return min;
    }
}
