package p577go;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* renamed from: go.c */
public final class C17805c {

    /* renamed from: a */
    public final int f38706a;

    /* renamed from: b */
    public final ByteBuffer f38707b;

    /* renamed from: c */
    public final MediaCodec.BufferInfo f38708c;

    public C17805c(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.f38706a = i;
        this.f38707b = byteBuffer;
        if (bufferInfo == null) {
            this.f38708c = new MediaCodec.BufferInfo();
        } else {
            this.f38708c = bufferInfo;
        }
    }
}
