package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.exoplayer2.audio.d */
public final class C14194d extends C14193c {

    /* renamed from: i */
    public int[] f31443i;

    /* renamed from: j */
    public int[] f31444j;

    /* renamed from: b */
    public final void mo47177b(ByteBuffer byteBuffer) {
        int[] iArr = this.f31444j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer i = mo47257i(((limit - position) / this.f31436b.f31324d) * this.f31437c.f31324d);
        while (position < limit) {
            for (int i2 : iArr) {
                i.putShort(byteBuffer.getShort((i2 * 2) + position));
            }
            position += this.f31436b.f31324d;
        }
        byteBuffer.position(limit);
        i.flip();
    }

    /* renamed from: e */
    public final AudioProcessor.C14178a mo47253e(AudioProcessor.C14178a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.f31443i;
        if (iArr == null) {
            return AudioProcessor.C14178a.f31320e;
        }
        if (aVar.f31323c == 2) {
            boolean z = aVar.f31322b != iArr.length;
            int i = 0;
            while (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 < aVar.f31322b) {
                    z |= i2 != i;
                    i++;
                } else {
                    throw new AudioProcessor.UnhandledAudioFormatException(aVar);
                }
            }
            return z ? new AudioProcessor.C14178a(aVar.f31321a, iArr.length, 2) : AudioProcessor.C14178a.f31320e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    /* renamed from: f */
    public final void mo47254f() {
        this.f31444j = this.f31443i;
    }

    /* renamed from: h */
    public final void mo47256h() {
        this.f31444j = null;
        this.f31443i = null;
    }
}
