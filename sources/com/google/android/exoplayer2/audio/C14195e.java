package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.exoplayer2.audio.e */
public final class C14195e extends C14193c {

    /* renamed from: i */
    public static final int f31445i = Float.floatToIntBits(Float.NaN);

    /* renamed from: b */
    public final void mo47177b(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.f31436b.f31323c;
        if (i2 == 536870912) {
            byteBuffer2 = mo47257i((i / 3) * 4);
            while (position < limit) {
                int floatToIntBits = Float.floatToIntBits((float) (((double) (((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24))) * 4.656612875245797E-10d));
                if (floatToIntBits == f31445i) {
                    floatToIntBits = Float.floatToIntBits(0.0f);
                }
                byteBuffer2.putInt(floatToIntBits);
                position += 3;
            }
        } else if (i2 == 805306368) {
            byteBuffer2 = mo47257i(i);
            while (position < limit) {
                int floatToIntBits2 = Float.floatToIntBits((float) (((double) ((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24))) * 4.656612875245797E-10d));
                if (floatToIntBits2 == f31445i) {
                    floatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                byteBuffer2.putInt(floatToIntBits2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    /* renamed from: e */
    public final AudioProcessor.C14178a mo47253e(AudioProcessor.C14178a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int i = aVar.f31323c;
        if (i == 536870912 || i == 805306368 || i == 4) {
            return i != 4 ? new AudioProcessor.C14178a(aVar.f31321a, aVar.f31322b, 4) : AudioProcessor.C14178a.f31320e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }
}
