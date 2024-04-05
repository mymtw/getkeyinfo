package com.linkedin.android.litr.render;

import java.nio.ByteBuffer;
import p577go.C17805c;
import p617lo.C18209a;

public final class OboeAudioProcessor implements C18209a {

    /* renamed from: b */
    public double f37419b;

    /* renamed from: c */
    public long f37420c = 0;

    /* renamed from: d */
    public final int f37421d;

    /* renamed from: e */
    public final int f37422e;

    static {
        System.loadLibrary("litr-jni");
    }

    public OboeAudioProcessor(int i, int i2, int i3, int i4) {
        this.f37421d = i;
        this.f37422e = i3;
        initProcessor(i, i2, i3, i4);
        this.f37419b = 1000000.0d / ((double) i4);
    }

    private final native void initProcessor(int i, int i2, int i3, int i4);

    private final native int processAudioFrame(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2);

    private final native void releaseProcessor();

    /* renamed from: b */
    public final void mo60324b(C17805c cVar, C17805c cVar2) {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2 = cVar.f38707b;
        if (byteBuffer2 == null || (byteBuffer = cVar2.f38707b) == null) {
            throw new IllegalArgumentException("Source or target frame doesn't have a buffer, cannot process it!");
        }
        int processAudioFrame = processAudioFrame(byteBuffer2, cVar.f38708c.size / (this.f37421d * 2), byteBuffer);
        int i = processAudioFrame * 2 * this.f37422e;
        cVar2.f38707b.rewind();
        cVar2.f38707b.limit(i);
        cVar2.f38708c.set(0, i, this.f37420c, cVar.f38708c.flags);
        this.f37420c += (long) (((double) processAudioFrame) * this.f37419b);
    }

    public final void release() {
        releaseProcessor();
    }
}
