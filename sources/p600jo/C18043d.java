package p600jo;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* renamed from: jo.d */
public interface C18043d {
    /* renamed from: a */
    void mo69610a();

    /* renamed from: b */
    int mo69611b(int i, MediaFormat mediaFormat);

    /* renamed from: c */
    void mo69612c(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

    void release();
}
